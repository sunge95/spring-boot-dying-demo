package com.dying.service;

import com.dying.bean.Guest;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Description:
 *
 * @author SunG
 * @date 2021/3/6 19:57
 */
public interface GuestService {
    List<Guest> findAllGuest();

    void add(Guest guest);

    Guest findGuestByName(String name);

    void update(Guest guest);

    void delete(String name);
}
