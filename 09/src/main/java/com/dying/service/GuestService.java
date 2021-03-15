package com.dying.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.dying.model.Guest;

import java.util.List;

/**
 * Description:
 *
 * @author SunG
 * @date 2021/3/7 0:02
 */
public interface GuestService extends IService<Guest> {

    // 方法一
//    List<Guest> findAll();

    // 方法二
    // 添加 IService<Guest> 接口
}
