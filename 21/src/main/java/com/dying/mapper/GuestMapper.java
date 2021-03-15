package com.dying.mapper;

import com.dying.model.Guest;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Description:
 *
 * @author SunG
 * @date 2021/3/14 17:47
 */
@Mapper
public interface GuestMapper {
    @Select("select id,name,role from guest")
    List<Guest> getGuests();

    @Select("select id,name,role from guest where id = #{id}")
    Guest getGuestById(int id);

    @Update("update guest set name=#{name},role=#{role} where id=#{id}")
    int updateGuest(Guest guest);

    @Delete("delete from guest where id = #{id}")
    int deleteGuest(int id);

    @Delete("delete from guest")
    int deleteAllGuest();
}
