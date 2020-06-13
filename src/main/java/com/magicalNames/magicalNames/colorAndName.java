package com.magicalNames.magicalNames;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class colorAndName {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String uName;

    private String[] color = {"Pink", "Red", "Orange", "Yellow", "Green", "Blue", "Brown", "White", "Gray"};

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return uName;
    }

    public void setName(String name) {
        this.uName = name;
    }

    public String[] getColor() {
        return color;
    }

    public void setColor(String[] color) {
        this.color = color;
    }
}