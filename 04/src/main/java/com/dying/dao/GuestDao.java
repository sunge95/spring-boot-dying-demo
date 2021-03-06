package com.dying.dao;

import com.dying.bean.Guest;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

/**
 * Description:
 *
 * @author:SunG
 * @date 2021/3/6 1:18
 */
@Repository
public class GuestDao {

    static List<Guest> guestList = new ArrayList<>();

    static {
        guestList.add(new Guest("黄晓明","店长"));
        guestList.add(new Guest("秦海璐","财务"));
        guestList.add(new Guest("林述巍","总厨"));
        guestList.add(new Guest("王俊凯","经理"));
        guestList.add(new Guest("杨紫","前台"));
    }


    public List<Guest> findAllGuest() {
        return guestList;
    }

    public void add(Guest guest) {
        guestList.add(guest);
    }

    public Guest findGuestByName(String name) {
        if (guestList == null || guestList.size() ==0){
            return null;
        }
        for (Guest g:guestList){
            if (name.equals(g.getName())){
                return g;
            }
        }
        return null;
    }

    public void update(Guest newGuest) {
        String name = newGuest.getName();
        Guest oldGuest = findGuestByName(name);
        oldGuest.setRole(newGuest.getRole());
    }

    public void delete(String name) {
        Guest g = findGuestByName(name);
        guestList.remove(g);
    }
}
