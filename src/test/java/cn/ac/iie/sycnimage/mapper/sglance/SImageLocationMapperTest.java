package cn.ac.iie.sycnimage.mapper.sglance;

import cn.ac.iie.sycnimage.model.ImageLocation;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

/**
 * Created by hongtao on 2019/10/21.
 */
@RunWith(SpringRunner.class)
@SpringBootTest
@EnableAutoConfiguration
public class SImageLocationMapperTest {

    @Autowired
    private SImageLocationMapper sImageLocationMapper;

    @Test
    public void getImageLocationsByImageId() {
        List<ImageLocation> imageLocations = sImageLocationMapper.getImageLocationsByImageId("ff965a65-52fb-4fde-9bec-41e7334d4c8d");
        System.out.println(imageLocations);
    }
}