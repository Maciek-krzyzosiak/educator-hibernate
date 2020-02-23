package com.bihuniak.educator.Human;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;


@Entity
public class Human {
    @Id
    @GeneratedValue
    private long id;

    private String firstName;
    private String lastName;
    @Enumerated(value = EnumType.STRING)
    private Sex sex;
    private LocalDate birthday;
    @Embedded
    private Address address;

    @ElementCollection
    private List<String> phones = new ArrayList<String>();

    @ElementCollection
    private List<Address> addresses = new ArrayList<Address>();

    public Human(String firstName, String lastName, Sex sex, LocalDate birthday, Address address, List<String> phones, List<Address> addresses) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.sex = sex;
        this.birthday = birthday;
        this.address = address;
        this.phones = phones;
        this.addresses = addresses;
    }

    public Human() {
    }
}
