package com.company;

import java.time.LocalDate;

public class Persona {
    private String name;
    private String lastName;
    private LocalDate DoB;

    public Persona(String name, String lastName, LocalDate DoB) {
        this.name = name;
        this.lastName = lastName;
        this.DoB = DoB;
    }
    public String getLastName(){
        return this.lastName;
    }
    public String getName(){
        return this.name;
    }

    public LocalDate getDoB() {
        return DoB;
    }
    public int getYoB() {
        return this.DoB.getYear();
    }

}