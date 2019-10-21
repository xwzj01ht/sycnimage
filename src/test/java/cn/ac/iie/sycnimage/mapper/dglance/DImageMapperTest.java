package cn.ac.iie.sycnimage.mapper.dglance;

import cn.ac.iie.sycnimage.mapper.sglance.SImageMapper;
import cn.ac.iie.sycnimage.model.Image;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * Created by hongtao on 2019/10/21.
 */
@RunWith(SpringRunner.class)
@SpringBootTest
@EnableAutoConfiguration
public class DImageMapperTest {

    @Autowired
    private SImageMapper sImageMapper;

    @Autowired
    private DImageMapper dImageMapper;

    @Test
    public void insertImage() {

        Image sImage = sImageMapper.getImageById("49b4a65e-cabb-432e-ad0b-a59fad5bb57b");
        int id = dImageMapper.insertImage(sImage);
        System.out.println(id);

    }
}