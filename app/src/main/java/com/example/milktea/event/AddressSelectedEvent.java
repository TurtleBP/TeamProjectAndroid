package com.example.milktea.event;

import com.example.milktea.model.Address;

public class AddressSelectedEvent {

    private Address address;

    public AddressSelectedEvent(Address address) {
        this.address = address;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }
}
