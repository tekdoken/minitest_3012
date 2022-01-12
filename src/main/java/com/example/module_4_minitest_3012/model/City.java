package com.example.module_4_minitest_3012.model;

import javax.persistence.*;

@Entity
public class City {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private Long acreage;
    private Long population;
    private Long GDP;
    @Column(length = 10000)
    private String introduce;
    @ManyToOne
    @JoinColumn(name = "nation_id")
    private Nation nation;

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

    public Long getAcreage() {
        return acreage;
    }

    public void setAcreage(Long acreage) {
        this.acreage = acreage;
    }

    public Long getPopulation() {
        return population;
    }

    public void setPopulation(Long population) {
        this.population = population;
    }

    public Long getGDP() {
        return GDP;
    }

    public void setGDP(Long GDP) {
        this.GDP = GDP;
    }

    public String getIntroduce() {
        return introduce;
    }

    public void setIntroduce(String introduce) {
        this.introduce = introduce;
    }

    public Nation getNation() {
        return nation;
    }

    public void setNation(Nation nation) {
        this.nation = nation;
    }

    public City(String name, Long acreage, Long population, Long GDP, String introduce, Nation nation) {
        this.name = name;
        this.acreage = acreage;
        this.population = population;
        this.GDP = GDP;
        this.introduce = introduce;
        this.nation = nation;
    }

    public City() {
    }

    public City(Long id, String name, Long acreage, Long population, Long GDP, String introduce, Nation nation) {
        this.id = id;
        this.name = name;
        this.acreage = acreage;
        this.population = population;
        this.GDP = GDP;
        this.introduce = introduce;
        this.nation = nation;
    }
}
