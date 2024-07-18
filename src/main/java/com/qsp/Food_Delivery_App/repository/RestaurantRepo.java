package com.qsp.Food_Delivery_App.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.qsp.Food_Delivery_App.dto.Restaurant;

public interface RestaurantRepo extends JpaRepository<Restaurant, Long>{

	Restaurant findUsersByEmail(String email);

	Restaurant findUsersByPhone(long phone);

	List<Restaurant> findUsersByName(String name);

}
