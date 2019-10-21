package cn.ac.iie.sycnimage.service.image;

import cn.ac.iie.sycnimage.basemodel.HttpResponseTemp;
import cn.ac.iie.sycnimage.consolemodel.UserImage;

/**
 * Created by hongtao on 2019/10/21.
 */
public interface ImageService {

    HttpResponseTemp<?> sycnImage(UserImage userImage);

}
