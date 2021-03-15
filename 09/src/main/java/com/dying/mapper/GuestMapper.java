package com.dying.mapper;


import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.dying.model.Guest;

/**
 *  如果 BaseMapper 后面没有加泛型 异常
 *  org.apache.ibatis.binding.BindingException:
 *  Invalid bound statement (not found): com.dying.mapper.GuestMapper.selectList] with root cause
 */

public interface GuestMapper extends BaseMapper<Guest> {

}
