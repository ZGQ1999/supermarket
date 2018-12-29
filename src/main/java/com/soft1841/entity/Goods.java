package com.soft1841.entity;

/**
 * 商品类
 *2018.12.26
 */

public class Goods {
    private long id;
    private long type_id;
    private String name;
    private  String stock;
    private double price;
    private String picture;
    private String discription;

    public Goods () {
        this.id = id;
        this.type_id = type_id;
        this.name = name;
        this.price = price;
        this.picture = picture;
        this.discription = discription;
        this.stock=stock;
    }

    public static Object getGoodsName () {
        return null;
    }

    public long getId () {
        return id;
    }

    public void setId (long id) {
        this.id = id;
    }

    public long getType_id () {
        return type_id;
    }

    public void setType_id (long type_id) {
        this.type_id = type_id;
    }

    public String getName () {
        return name;
    }

    public void setName (String name) {
        this.name = name;
    }

    public String getStock () {
        return stock;
    }

    public void setStock (String stock) {
        this.stock = stock;
    }

    public double getPrice () {
        return price;
    }

    public void setPrice (double price) {
        this.price = price;
    }

    public String getPicture () {
        return picture;
    }

    public void setPicture (String picture) {
        this.picture = picture;
    }

    public String getDiscription () {
        return discription;
    }

    public void setDiscription (String discription) {
        this.discription = discription;
    }

    @Override
    public String toString () {
        return "Goods{" +
                "id=" + id +
                ", type_id=" + type_id +
                ", name='" + name + '\'' +
                ", stock='" + stock + '\'' +
                ", price=" + price +
                ", picture='" + picture + '\'' +
                ", discription='" + discription + '\'' +
                '}';
    }
}

