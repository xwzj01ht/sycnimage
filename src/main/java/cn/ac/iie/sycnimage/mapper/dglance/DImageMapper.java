package cn.ac.iie.sycnimage.mapper.dglance;

import cn.ac.iie.sycnimage.model.Image;
import org.apache.ibatis.annotations.*;

/**
 * Created by hongtao on 2019/10/21.
 */
@Mapper
public interface DImageMapper {

    @Insert("INSERT INTO images (id, name, size, status, created_at, updated_at, deleted_at, deleted, disk_format, " +
            " container_format, checksum, owner, min_disk, min_ram, protected, virtual_size, visibility) values (" +
            " #{item.id}, #{item.name}, #{item.size}, #{item.status}, #{item.createdAt}, #{item.updatedAt}, " +
            " #{item.deletedAt}, #{item.deleted}, #{item.diskFormat}, #{item.containerFormat}, #{item.checksum}, " +
            " #{item.owner}, #{item.minDisk}, #{item.minRam}, #{item.protect}, #{item.virtualSize}, #{item.visibility})")
//    @Options(useGeneratedKeys = true, keyProperty = "item.id", keyColumn = "id")
    int insertImage(@Param("item") Image item);

}
