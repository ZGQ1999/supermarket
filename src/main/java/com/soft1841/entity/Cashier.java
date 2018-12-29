package com.soft1841.entity;

/**
 * 收银员类
 * 2018.12.26
 */

public class Cashier {
    private Long id;
    private String name;
    private String number;
    private String password;
    private String picture;

    public Cashier () {
        this.id = id;
        this.name = name;
        this.number = number;
        this.password = password;
        this.picture = picture;
    }

    public Long getId () {
        return id;
    }

    public void setId (Long id) {
        this.id = id;
    }

    public String getName () {
        return name;
    }

    public void setName (String name) {
        this.name = name;
    }

    public String getNumber () {
        return number;
    }

    public void setNumber (String number) {
        this.number = number;
    }

    public String getPassword () {
        return password;
    }

    public void setPassword (String password) {
        this.password = password;
    }

    public String getPicture () {
        return picture;
    }

    public void setPicture (String picture) {
        this.picture = picture;
    }

    @Override
    public String toString () {
        return "Cashier{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", number='" + number + '\'' +
                ", password='" + password + '\'' +
                ", picture='" + picture + '\'' +
                '}';
    }
}
