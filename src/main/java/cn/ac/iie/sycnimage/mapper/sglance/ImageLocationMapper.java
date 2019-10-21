package cn.ac.iie.sycnimage.mapper.sglance;

import cn.ac.iie.sycnimage.model.ImageLocation;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * Created by hongtao on 2019/10/21.
 */
@Mapper
public interface ImageLocationMapper {

    @Select("SELECT id, image_id as imageId, value, created_at as createdAt, updated_at as updatedAt, " +
            "deleted_at as deletedAt, deleted, meta_data as metaData, status FROM image_locations WHERE image_id=#{imageId}")
    List<ImageLocation> getImageLocationsByImageId(@Param("imageId") String imageId);

}
