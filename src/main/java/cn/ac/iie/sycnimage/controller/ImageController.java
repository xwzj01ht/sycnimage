package cn.ac.iie.sycnimage.controller;

import cn.ac.iie.sycnimage.basemodel.HttpResponseTemp;
import cn.ac.iie.sycnimage.consolemodel.UserImage;
import cn.ac.iie.sycnimage.service.image.ImageService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * Created by hongtao on 2019/10/21.
 */
@Api(value = "镜像controller",tags = {"镜像操作接口"})
@RestController
@RequestMapping("/api")
public class ImageController {
    protected static Logger logger = LoggerFactory.getLogger(ImageController.class);
    @Autowired
    private ImageService imageService;

    @ApiOperation(value="同步指定镜像" , notes="将两个openstack集群的指定镜像元数据进行同步")
    @PostMapping(value = "/image/sycn")
    public HttpResponseTemp<?> sycnImage(@RequestBody UserImage userImage)
    {
        logger.info("sycn image: " + userImage);
        return imageService.sycnImage(userImage);
    }

}
