package com.bihuniak.educator.Human;

import javax.persistence.Embeddable;
import javax.persistence.Embedded;

@Embeddable
public class Address {
    private String street;
    private String city;
    private String country;
    @Embedded
    private PostCode postCode;

    public Address(String street, String city, String country, PostCode postCode) {
        this.street = street;
        this.city = city;
        this.country = country;
        this.postCode = postCode;
    }

    public Address() {
    }
}
