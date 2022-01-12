package com.example.module_4_minitest_3012.model;

import javax.persistence.*;
import java.util.List;

@Entity
public class Nation {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
@OneToMany(targetEntity = City.class)
    List<City> cityList;

    public List<City> getCityList() {
        return cityList;
    }

    public void setCityList(List<City> cityList) {
        this.cityList = cityList;
    }

    public Nation(String name, List<City> cityList) {
        this.name = name;
        this.cityList = cityList;
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

    public Nation(Long id, String name) {
        this.id = id;
        this.name = name;
    }

    public Nation() {
    }
}
