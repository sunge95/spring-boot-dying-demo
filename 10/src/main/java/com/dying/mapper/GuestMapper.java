package com.dying.mapper;


import com.dying.model.Guest;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;

import java.util.List;


public interface GuestMapper{

    @Select("select name,role from guest")
    List<Guest> getGuests();

    @Insert("insert into guest(name,role) values(#{name},#{role})")
    void add(Guest guest);
}
