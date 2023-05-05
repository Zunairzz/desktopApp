package com.example.loginfrom;

public class Person {

    private int id;
    private String name;
    private String about;
    private String phoneNo;

    public Person(int id, String name, String about, String phoneNo) {
        this.id = id;
        this.name = name;
        this.about = about;
        this.phoneNo = phoneNo;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAbout() {
        return about;
    }

    public void setAbout(String about) {
        this.about = about;
    }

    public String getPhoneNo() {
        return phoneNo;
    }

    public void setPhoneNo(String phoneNo) {
        this.phoneNo = phoneNo;
    }
}
