package com.example.taskone.model.entities;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.time.LocalDate;
import java.util.Date;
@Entity
@Table
public class Employee {
    @Id
    private Long id;
    private String name;
    private String title;
    private String dateOfBarth;


    public Employee() {
    }

    public Employee(Long id, String name, String title, String dateOfBarth) {
        this.id = id;
        this.name = name;
        this.title = title;
        this.dateOfBarth = dateOfBarth;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDateOfBarth() {
        return dateOfBarth;
    }

    public void setDateOfBarth(String dateOfBarth) {
        this.dateOfBarth = dateOfBarth;
    }
}
