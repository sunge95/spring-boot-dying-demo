package com.dying.service;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.dying.model.Guest;
import com.dying.mapper.GuestMapper;
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
public class GuestServiceImp extends ServiceImpl<GuestMapper,Guest>
        implements GuestService {

    //方法一
//    @Autowired
//    private GuestMapper guestMapper;

//    @Override
//    public List<Guest> findAll() {
//        return guestMapper.selectList(null);
//    }

    //方法二 继承 ServiceImpl 类
}
