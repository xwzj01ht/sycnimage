package cn.ac.iie.sycnimage.service.image.impl;

import cn.ac.iie.sycnimage.basemodel.HttpResponseTemp;
import cn.ac.iie.sycnimage.basemodel.ResultStat;
import cn.ac.iie.sycnimage.consolemodel.UserImage;
import cn.ac.iie.sycnimage.mapper.dglance.DImageLocationMapper;
import cn.ac.iie.sycnimage.mapper.dglance.DImageMapper;
import cn.ac.iie.sycnimage.mapper.keystone.KeystoneMapper;
import cn.ac.iie.sycnimage.mapper.sglance.SImageLocationMapper;
import cn.ac.iie.sycnimage.mapper.sglance.SImageMapper;
import cn.ac.iie.sycnimage.service.image.ImageService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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
        //TODO 1.获取源库镜像元数据信息

        //TODO 2.获取目标库用户ID(owner)

        //TODO 3.将得到的owner赋值给镜像元数据

        //TODO 4.在目标库中插入镜像元数据
        return ResultStat.OK.wrap(null);
    }
}
