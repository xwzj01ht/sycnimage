package cn.ac.iie.sycnimage.service.image.impl;

import cn.ac.iie.sycnimage.basemodel.HttpResponseTemp;
import cn.ac.iie.sycnimage.basemodel.ResultStat;
import cn.ac.iie.sycnimage.consolemodel.UserImage;
import cn.ac.iie.sycnimage.mapper.dglance.DImageLocationMapper;
import cn.ac.iie.sycnimage.mapper.dglance.DImageMapper;
import cn.ac.iie.sycnimage.mapper.keystone.KeystoneMapper;
import cn.ac.iie.sycnimage.mapper.sglance.SImageLocationMapper;
import cn.ac.iie.sycnimage.mapper.sglance.SImageMapper;
import cn.ac.iie.sycnimage.model.Image;
import cn.ac.iie.sycnimage.model.ImageLocation;
import cn.ac.iie.sycnimage.service.image.ImageService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by hongtao on 2019/10/21.
 */
@Service
public class ImageServiceImpl implements ImageService {
    protected static Logger logger = LoggerFactory.getLogger(ImageServiceImpl.class);

    @Autowired
    private SImageMapper sImageMapper;
    @Autowired
    private SImageLocationMapper sImageLocationMapper;
    @Autowired
    private DImageMapper dImageMapper;
    @Autowired
    private DImageLocationMapper dImageLocationMapper;
    @Autowired
    private KeystoneMapper keystoneMapper;

    @Override
    public HttpResponseTemp<?> sycnImage(UserImage userImage) {
        // 1.获取源库镜像元数据信息
        Image image = sImageMapper.getImageById(userImage.getImageId());
        if (image == null) {
            return ResultStat.IMAGE_NOT_EXIST.wrap(null, userImage.getImageId());
        }
        List<ImageLocation> imageLocations = sImageLocationMapper.getImageLocationsByImageId(userImage.getImageId());
        logger.info("query image from source database: " + image);
        logger.info("query image_locations from source database: " + imageLocations);

        // 2.获取目标库用户ID(owner)
        String owner = keystoneMapper.getUserIdByName(userImage.getUsername());
        if (owner == null) {
            return ResultStat.USER_NOT_EXIST.wrap(null, userImage.getUsername());
        }

        // 3.将得到的owner赋值给镜像元数据
        image.setOwner(owner);
        logger.info("change image owner to target database user: " + image);

        // 4.在目标库中插入镜像元数据
        try {
            dImageMapper.insertImage(image);
            for (int i = 0; i < imageLocations.size(); i++) {
                dImageLocationMapper.insertImageLocation(imageLocations.get(i));
            }
        } catch (Exception e) {
            logger.error("insert image to target database failed: " + e.getMessage());
            return ResultStat.INSERT_IMAGE_FAILED.wrap(null, e.getMessage());
        }
        return ResultStat.OK.wrap(null);
    }
}
