package com.bihuniak.educator.Company;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Department {

    @Id
    @GeneratedValue
    private long id;
}