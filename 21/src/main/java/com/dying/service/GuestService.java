package com.dying.service;

import com.dying.model.Guest;

import java.util.List;

/**
 * Description:
 *
 * @author:SunG
 * @date 2021/3/14 17:47
 */
public interface GuestService {
    List<Guest> getGuests();

    Guest getGuestById(int id);

    /**
     * 使用缓存时  会把方法的返回值放入缓存中存储
     * 此时的返回值是特殊的   不是原来的void or int
     * @return
     */
    Guest updateGuest(Guest guest);

    void deleteGuest(int id);

    void deleteAllGuest();
}
