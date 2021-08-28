package com.egc.apppersoninformation.Models;

public class Person {

    private String name;
    private String surname;
    private String identifiacionCard;

    public Person(String name, String surname, String identifiacionCard) {
        this.name = name;
        this.surname = surname;
        this.identifiacionCard = identifiacionCard;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getIdentifiacionCard() {
        return identifiacionCard;
    }

    public void setIdentifiacionCard(String identifiacionCard) {
        this.identifiacionCard = identifiacionCard;
    }
}
