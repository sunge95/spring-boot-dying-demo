package com.dying.mapper;

import com.dying.model.Guest;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * 启动类处可以用 @MapperScan("") 替代 @Mapper
 */
//@Mapper
public interface GuestMapper {

    @Select("select * from guest")
    List<Guest> findAll();
}
