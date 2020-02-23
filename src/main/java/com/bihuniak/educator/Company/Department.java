package com.bihuniak.educator.Company;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Department {

    @Id
    @GeneratedValue
    private long id;

    private String name;
    private String address;
    private int floor;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "departmentId")
    private List<Employee> employees = new ArrayList<Employee>();

    public Department() {
    }

    public Department(String name, String address, int floor, List<Employee> employees) {
        this.name = name;
        this.address = address;
        this.floor = floor;
        this.employees = employees;
    }


    @Override
    public String toString() {
        return "Department{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", floor=" + floor +
                '}';
    }
}