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

    public String name;

    private String color;

    public String magName = GetMagName();

    String GetMagName() {
        char FirstChar = this.name.toLowerCase().charAt(0);
        char LastChar = this.name.toLowerCase().charAt(name.length() -1);

        String theMagName = color + FirstChar + LastChar;
        return theMagName;
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

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getMagName() {
        return magName;
    }

    public void setMagName(String magName) {
        this.magName = GetMagName();
    }
}