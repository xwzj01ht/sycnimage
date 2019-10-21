package cn.ac.iie.sycnimage.mapper.dglance;

import cn.ac.iie.sycnimage.mapper.sglance.SImageLocationMapper;
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
public class DImageLocationMapperTest {

    @Autowired
    private SImageLocationMapper sImageLocationMapper;

    @Autowired
    private DImageLocationMapper dImageLocationMapper;

    @Test
    public void insertImageLocation() {

        List<ImageLocation> imageLocations = sImageLocationMapper.getImageLocationsByImageId("49b4a65e-cabb-432e-ad0b-a59fad5bb57b");
        for (int i = 0; i < imageLocations.size(); i++) {
            int id = dImageLocationMapper.insertImageLocation(imageLocations.get(i));
            System.out.println(imageLocations.get(i).getImageId());
            System.out.println(id);
        }

    }
}