package com.todocodeacademy.hotels_service.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter @Setter @AllArgsConstructor @NoArgsConstructor
public class Hotel {
    private Long id;
    private String name;
    private int number_stars;
    private Long id_city;
}
