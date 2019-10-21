package cn.ac.iie.sycnimage.mapper.sglance;

import cn.ac.iie.sycnimage.model.Image;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

/**
 * Created by hongtao on 2019/10/18.
 */
@Mapper
public interface SImageMapper {

    @Select("SELECT id, name, size, status, created_at as createdAt, updated_at as updatedAt, " +
            "deleted_at as deletedAt, deleted, disk_format as diskFormat, container_format as containerFormat, " +
            "checksum, owner, min_disk as minDisk, min_ram as minRam, protected as protect, virtual_size as virtualSize," +
            " visibility FROM images WHERE id=#{imageId}")
    Image getImageById(@Param("imageId") String imageId);

}
