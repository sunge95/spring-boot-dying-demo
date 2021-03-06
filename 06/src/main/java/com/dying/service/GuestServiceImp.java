package com.dying.service;

import com.dying.model.Guest;
import com.dying.repository.GuestRepository;
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
    private GuestRepository repository;

    @Override
    public List<Guest> findAll() {
        System.out.println(repository.findAll());
        return repository.findAll();
    }
}
