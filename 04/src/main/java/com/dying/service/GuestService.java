package com.dying.service;

import com.dying.bean.Guest;

import java.util.List;

/**
 * Description:
 *
 * @author SunG
 * @date 2021/3/6 1:16
 */
public interface GuestService {

    List<Guest> findAllGuest();

    void add(Guest guest);

    Guest findGuestByName(String name);

    void update(Guest guest);

    void delete(String name);
}
