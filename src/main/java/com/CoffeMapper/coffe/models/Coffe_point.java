package com.CoffeMapper.coffe.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Coffe_point {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Integer coffe_point_id;
    private String name;
    private String logo;
    private String description;
    private String email;
    private String address;
    private Integer brand_id;
    private String work_time;


    public Integer getCoffe_point_id() {
        return coffe_point_id;
    }

    public void setCoffe_point_id(Integer coffe_point_id) {
        this.coffe_point_id = coffe_point_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLogo() {
        return logo;
    }

    public void setLogo(String logo) {
        this.logo = logo;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Integer getBrand_id() {
        return brand_id;
    }

    public void setBrand_id(Integer brand_id) {
        this.brand_id = brand_id;
    }

    public String getWork_time() {
        return work_time;
    }

    public void setWork_time(String work_time) {
        this.work_time = work_time;
    }


}