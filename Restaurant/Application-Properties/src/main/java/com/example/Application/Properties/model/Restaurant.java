package com.example.Application.Properties.model;

public class Restaurant {
    private String id;
    private String name;
    private String address;
    private String phoneNo;
    private int totalStaff;
    private String specialty;

    public Restaurant(String id ,String name ,String address,String phoneNo ,int totalStaff,String specialty) {

        this.id = id;
        this.name = name;
        this.address = address;
        this.phoneNo = phoneNo;
        this.totalStaff= totalStaff;
        this.specialty = specialty;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getSpecialty() {
        return specialty;
    }

    public void setSpecialty(String specialty) {
        this.specialty = specialty;
    }

    public String getPhoneNo() {
        return phoneNo;
    }

    public void setPhoneNo(String phoneNo) {
        this.phoneNo = phoneNo;
    }

    public int getTotalStaff() {
        return totalStaff;
    }

    public void setTotalStaff(int totalStaff) {
        this.totalStaff = totalStaff;
    }
}
