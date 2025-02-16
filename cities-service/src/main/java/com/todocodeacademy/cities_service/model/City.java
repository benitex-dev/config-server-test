package com.todocodeacademy.cities_service.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


public class City {
    private Long   id_city;
    private String name;
    private String continent;
    private String country;
    private String province;

    public City() {
    }

    public City(Long id_city, String name, String continent, String country, String province) {
        this.id_city = id_city;
        this.name = name;
        this.continent = continent;
        this.country = country;
        this.province = province;
    }

    public Long getId_city() {
        return id_city;
    }

    public void setId_city(Long id_city) {
        this.id_city = id_city;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getContinent() {
        return continent;
    }

    public void setContinent(String continent) {
        this.continent = continent;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }
}
