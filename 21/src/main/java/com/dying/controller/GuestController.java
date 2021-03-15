package com.dying.controller;

import com.dying.model.Guest;
import com.dying.service.GuestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Description:
 *
 * @author:SunG
 * @date 2021/3/14 17:41
 */
@RestController
@RequestMapping("/guest")
public class GuestController {

    @Autowired
    private GuestService guestService;

    @GetMapping("")
    public List<Guest> getGuests(){
        List<Guest> result = guestService.getGuests();
        return result;
    }

    @GetMapping("/{id}")
    public Guest getGuest(@PathVariable(name = "id") int id){
        Guest guest = guestService.getGuestById(id);
        return guest;
    }

    @GetMapping("/update")
    public Guest updateGuest(Integer id,String name,String role){
        Guest newGuest = new Guest(id, name, role);
        guestService.updateGuest(newGuest);
        return newGuest;
    }

    @GetMapping("/delete/{id}")
    public String deleteGuest(@PathVariable(name = "id") int id) {
        if (id != 0) {
            guestService.deleteGuest(id);
        } else {
            guestService.deleteAllGuest();
        }
        return "Success";
    }
}
