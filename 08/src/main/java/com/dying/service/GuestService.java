package com.dying.service;

import com.dying.model.Guest;

import java.util.List;

/**
 * Description:
 *
 * @author SunG
 * @date 2021/3/7 0:02
 */
public interface GuestService {
    List<Guest> findAll();
}
