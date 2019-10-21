package cn.ac.iie.sycnimage.mapper.keystone;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

/**
 * Created by hongtao on 2019/10/21.
 */
@Mapper
public interface KeystoneMapper {

    @Select("SELECT user_id FROM local_user WHERE name=#{name}")
    String getUserIdByName(@Param("name") String name);

}
