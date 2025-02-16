package com.todocodeacademy.cities_service.repository;

import com.todocodeacademy.cities_service.dto.HotelDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@FeignClient(name = "hotels-service")
public interface IHotelsAPI {
 @GetMapping("hotels/{id_city}")
 public List<HotelDTO> getHotelsByCityId (@PathVariable("id_city") Long city_id);

}
