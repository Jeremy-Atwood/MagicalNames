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

    String color  = colorList();

    public String colorList() {
        String[] color  = {"Pink", "Red", "Orange", "Yellow", "Green", "Blue", "Brown", "White", "Gray"};
        for (int i =0; i < color.length; i++) {
            String colors = color[i];
            return colors;
        }
        return this.colorList();
    }

    public String magName() {
            char FirstChar = name.toLowerCase().charAt(0);
            char LastChar = name.toLowerCase().charAt(name.length() -1);
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
        return this.magName();
    }

}