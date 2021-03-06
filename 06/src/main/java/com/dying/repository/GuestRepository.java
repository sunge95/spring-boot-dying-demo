package com.dying.repository;

import com.dying.model.Guest;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Description:
 *
 * @author:SunG
 * @date 2021/3/7 0:00
 */
@Repository
public interface GuestRepository extends JpaRepository<Guest,Long> {

}
