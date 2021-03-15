package com.dying.service;

import com.dying.mapper.GuestMapper;
import com.dying.model.Guest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;

/**
 * Description:
 *
 * @author:SunG
 * @date 2021/3/7 0:04
 */
@Service
public class GuestServiceImp implements GuestService {

    @Autowired
    private GuestMapper guestMapper;

    @Override
    public List<Guest> findAll() {
        return guestMapper.selectAll();
    }
}
