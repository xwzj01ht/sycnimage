package cn.ac.iie.sycnimage.mapper.dglance;

import cn.ac.iie.sycnimage.model.ImageLocation;
import org.apache.ibatis.annotations.*;

import java.util.List;

/**
 * Created by hongtao on 2019/10/21.
 */
@Mapper
public interface DImageLocationMapper {

    @Insert("INSERT INTO image_locations (image_id, value, created_at, updated_at, deleted_at, deleted, meta_data, " +
            " status) values (#{item.imageId}, #{item.value}, #{item.createdAt}, #{item.updatedAt}, #{item.deletedAt}, " +
            " #{item.deleted}, #{item.metaData}, #{item.status})")
    @Options(useGeneratedKeys = true, keyProperty = "item.id", keyColumn = "id")
    int insertImageLocation(@Param("item") ImageLocation item);

}
