package com.guru.javaConcepts.shallowAndDeepCopy.usingCopyConstructor;

public class Address {
    public String city;

    public Address(String city) {
        this.city = city;
    }

    public Address(Address address) {
        this.city = address.city;
    }
}
