package com.dying.service;

import com.dying.mapper.GuestMapper;
import com.dying.mapper2.GuestMapper2;
import com.dying.model.Guest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class GuestServiceImpl implements GuestService {

    @Autowired
    private GuestMapper mapper;

    @Autowired
    private GuestMapper2 mapper2;

    @Override
    public List<Guest> getGuests() {
        return mapper.getGuests();
//        return mapper2.getGuests();
    }

    @Override
//    @Transactional
    public void add(Guest guest) {
        mapper.add(guest);
        int i = 1/0;
    }
}
