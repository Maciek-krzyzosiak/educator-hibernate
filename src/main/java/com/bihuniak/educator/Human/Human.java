package com.bihuniak.educator.Human;

import javax.persistence.*;
import java.time.LocalDate;


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

    public Human(String firstName, String lastName, Sex sex, LocalDate birthday, Address address) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.sex = sex;
        this.birthday = birthday;
        this.address= address;
    }

    public Human() {
    }
}
