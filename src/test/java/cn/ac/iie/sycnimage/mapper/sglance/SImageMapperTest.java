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
public class SImageMapperTest {

    @Autowired
    private SImageMapper sImageMapper;

    @Test
    public void getImageById() {
        Image image = sImageMapper.getImageById("49b4a65e-cabb-432e-ad0b-a59fad5bb57b");
        System.out.println(image);
    }
}