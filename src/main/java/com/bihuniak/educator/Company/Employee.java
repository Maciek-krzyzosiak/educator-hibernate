package com.bihuniak.educator.Company;

import javax.persistence.*;

@Entity
public class Employee {

    @Id
    @GeneratedValue
    private long id;

    private String surname;
    private String position;

    @OneToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private Department department;

    public Employee() {
    }

    public Employee(String surname, String position, Department department) {
        this.surname = surname;
        this.position = position;
        this.department = department;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", surname='" + surname + '\'' +
                ", position='" + position + '\'' +
                ", department=" + department +
                '}';
    }
}
