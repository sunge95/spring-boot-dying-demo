package com.dying.service;

import com.dying.model.Guest;

import java.util.List;

public interface GuestService {

    List<Guest> getGuests();

    void add(Guest guest);
}
