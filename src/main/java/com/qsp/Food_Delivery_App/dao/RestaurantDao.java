package com.qsp.Food_Delivery_App.dao;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.qsp.Food_Delivery_App.dto.Restaurant;
import com.qsp.Food_Delivery_App.dto.Users;
import com.qsp.Food_Delivery_App.repository.RestaurantRepo;

@Repository
public class RestaurantDao
{

		@Autowired
		private RestaurantRepo repo;
		
		public Restaurant saveRestaurant(Restaurant restaurant)
		{
			return repo.save(restaurant);
		}
		
		public Restaurant fetchRestaurant(long id)
		{
			Optional<Restaurant> optional=repo.findById(id);
			
			if(optional.isPresent())
			{
				return optional.get();
			}
			return null;
		}
		
		public List<Restaurant> fetchAllRestaurants()
		{
			return repo.findAll();
		}
		
		// BY USING DELELET(ID)
		public Restaurant deleteRestaurant(long id)
		{
			Optional<Restaurant>optional=repo.findById(id);
			
			if(optional.isPresent())
			{
				repo.deleteById(id);
				return optional.get();
			}
			return null;
		}
		
		
		
		public Restaurant updateRestaurants(long id, Restaurant restaurant)
		{
			Optional<Restaurant> optional=repo.findById(id);
			
			if(optional.isPresent())
			{
				restaurant.setId(id);
				return repo.save(restaurant);
			}
			return null;

		}
		
		public Restaurant findByEmail(String email)
		{
			return repo.findUsersByEmail(email);
		}
		
		public Restaurant findByPhone(long phone)
		{
			return repo.findUsersByPhone(phone);
		}
		
	
		
		public List<Restaurant> findByName(String name)
		{
			return repo.findUsersByName(name);
		}
}