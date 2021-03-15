package com.dying.service;

import com.dying.mapper.GuestMapper;
import com.dying.model.Guest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.*;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Description:
 * @CacheConfig(cacheNames = "guests") 设置通用缓存名
 * 下面的缓存就不用写了
 *
 * @author:SunG
 * @date 2021/3/14 17:50
 */
@CacheConfig(cacheNames = "guests")
@Service
public class GuestServiceImpl implements GuestService {

    @Autowired
    private GuestMapper mapper;

    /**
     * @Caching 组合注解
     *  如果一个方法包含 cacheable cacheput cacheevict 可以用这个注解
     * @return
     */
    @Caching(cacheable = {},put = {},evict = {})
    @Override
    public List<Guest> getGuests() {
        return mapper.getGuests();
    }

                //快捷键：ctrl + shift + /
    @Cacheable(/*cacheNames = "guests",*/  key = "#id" /*,condition = "#id>1" */)
    @Override
    public Guest getGuestById(int id) {
        System.out.println("查询第" + id + "位嘉宾");
        return mapper.getGuestById(id);
    }

    /**
     * 设置key的值和cacheale保持一致
     * 方式一  拿到参数的id —— key = "#guest.id"
     * 方式二  拿到结果的id —— key = "#result.id"
     *
     * @param guest
     * @return
     */
    @CachePut(/*cacheNames = "guests", */ key = "#guest.id")
    @Override
    public Guest updateGuest(Guest guest) {
        System.out.println("更新第" + guest.getId() + "位嘉宾");
        mapper.updateGuest(guest);
        return guest;
    }

    @CacheEvict(/* cacheNames = "guests", */key = "#guest.id")
    @Override
    public void deleteGuest(int id) {
        System.out.println("删除第" + id + "位嘉宾");
        mapper.deleteGuest(id);
    }

    /**
     * @CacheEvict 属性
     * allEntries  删除所有实例
     * beforeInvocation  在方法调用之前  执行清除缓存逻辑
     */
    @CacheEvict(/* cacheNames = "guests", */ allEntries = true ,beforeInvocation = true )
    @Override
    public void deleteAllGuest() {
        System.out.println("删除所有嘉宾");
        mapper.deleteAllGuest();

        int i = 1/0;
    }
}
