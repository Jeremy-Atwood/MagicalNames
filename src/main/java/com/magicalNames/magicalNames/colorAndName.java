package com.magicalNames.magicalNames;
//extends StringManipulation
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class colorAndName extends input {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

//    public String magName;

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
        char FirstChar = this.name.toLowerCase().charAt(0);
        char LastChar = this.name.toLowerCase().charAt(name.length() -1);

        String theMagName = color + FirstChar + LastChar;
        return theMagName;
    }

}