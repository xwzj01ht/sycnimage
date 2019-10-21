package cn.ac.iie.sycnimage.mapper.sglance;

import cn.ac.iie.sycnimage.model.Image;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

/**
 * Created by hongtao on 2019/10/18.
 */
@Mapper
public interface ImageMapper {

    @Select("SELECT * FROM images WHERE id=#{imageId}")
    Image getImageById(@Param("imageId") String imageId);

}
