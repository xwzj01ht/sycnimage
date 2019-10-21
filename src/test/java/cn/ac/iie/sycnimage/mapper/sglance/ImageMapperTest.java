package cn.ac.iie.sycnimage.mapper.sglance;

import cn.ac.iie.sycnimage.model.Image;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * Created by hongtao on 2019/10/18.
 */
@RunWith(SpringRunner.class)
@SpringBootTest
@EnableAutoConfiguration
public class ImageMapperTest {

    @Autowired
    private ImageMapper imageMapper;

    @Test
    public void getImageById() {
        Image image = imageMapper.getImageById("18f7adf0-b4ac-4961-9dfd-4c0fbca8a1d8");
        System.out.println(image);
        System.out.println(image.getOwner());
        System.out.println(image.isProtect());
    }
}