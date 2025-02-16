package com.todocodeacademy.cities_service.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;


public class CityDTO {
    private Long id_city;
    private String name;
    private String continent;
    private String country;
    private String province;
    private List<HotelDTO> hotelList;

    public CityDTO() {
    }

    public CityDTO(Long id_city, String name, String continent, String country, String province, List<HotelDTO> hotelList) {
        this.id_city = id_city;
        this.name = name;
        this.continent = continent;
        this.country = country;
        this.province = province;
        this.hotelList = hotelList;
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

    public List<HotelDTO> getHotelList() {
        return hotelList;
    }

    public void setHotelList(List<HotelDTO> hotelList) {
        this.hotelList = hotelList;
    }
}
