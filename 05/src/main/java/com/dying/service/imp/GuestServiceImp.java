package com.dying.service.imp;

import com.dying.bean.Guest;
import com.dying.dao.GuestDao;
import com.dying.service.GuestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Description:
 *
 * @author:SunG
 * @date 2021/3/6 19:58
 */
@Service
public class GuestServiceImp implements GuestService {

    @Autowired
    private GuestDao guestDao;
    @Override
    public List<Guest> findAllGuest() {
        return guestDao.findAllGuest();
    }

    @Override
    public void add(Guest guest) {
        guestDao.add(guest);
    }

    @Override
    public Guest findGuestByName(String name) {
        return guestDao.findGuestByName(name);
    }

    @Override
    public void update(Guest guest) {
        guestDao.update(guest);
    }

    @Override
    public void delete(String name) {
        guestDao.delete(name);
    }
}
