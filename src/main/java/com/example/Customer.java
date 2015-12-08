package com.example;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import org.hibernate.annotations.GenericGenerator;

@Entity
public class Customer {

    @Id
    @GeneratedValue(generator = "system-uuid")
    @GenericGenerator(name = "system-uuid", strategy = "uuid2")
    private String id;

    @Override
    public String toString() {
        return "Customer [id=" + id + "]";
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

}
