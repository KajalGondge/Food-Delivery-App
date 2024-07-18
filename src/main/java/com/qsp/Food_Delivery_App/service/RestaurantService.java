package com.qsp.Food_Delivery_App.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.qsp.Food_Delivery_App.dao.RestaurantDao;
import com.qsp.Food_Delivery_App.dto.Restaurant;
import com.qsp.Food_Delivery_App.repository.RestaurantRepo;

@Service
public class RestaurantService 
{
	@Autowired
	private RestaurantDao dao;
	
	public Restaurant saveRestaurant(Restaurant restaurant)
	{
		return dao.saveRestaurant(restaurant);
	}
	
	public Restaurant fetchRestaurant(long id)
	{
		return dao.fetchRestaurant(id)
	}
	
	public List<Restaurant> fetchAllRestaurants()
	{
		return dao.fetchAllRestaurants();
	}
	
	// BY USING DELELET(ID)
	public Restaurant deleteRestaurant(long id)
	{
		return dao.deleteRestaurant(id);
	}

	public Restaurant updateRestaurants(long id, Restaurant restaurant)
	{
		return dao.updateRestaurants(id, restaurant);

	}
	
	public Restaurant findByEmail(String email)
	{
		return dao.findByEmail(email);
	}
	
	public Restaurant findByPhone(long phone)
	{
		return dao.findByPhone(phone);
	}
	

	
	public List<Restaurant> findByName(String name)
	{
		return dao.findByName(name);
	}
}
