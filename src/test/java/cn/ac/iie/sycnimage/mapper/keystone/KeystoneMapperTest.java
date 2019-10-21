package cn.ac.iie.sycnimage.mapper.keystone;

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
public class KeystoneMapperTest {

    @Autowired
    private KeystoneMapper keystoneMapper;

    @Test
    public void getUserIdByName() {
        String userId = keystoneMapper.getUserIdByName("admin");
        System.out.println(userId);
    }
}