package com.example.mywardrobe.models;

public class Clothes {

    private int photo;
    private String name;
    private String describe;

    public Clothes(int photo, String name, String describe) {
        this.photo = photo;
        this.name = name;
        this.describe = describe;
    }

    public int getPhoto() {
        return photo;
    }

    public void setPhoto(int photo) {
        this.photo = photo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescribe() {
        return describe;
    }

    public void setDescribe(String describe) {
        this.describe = describe;
    }
}
