package com.qsp.Food_Delivery_App.dao;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.qsp.Food_Delivery_App.dto.Users;
import com.qsp.Food_Delivery_App.repository.UserRepo;

@Repository
public class UserDao 
{
		@Autowired
		private UserRepo repo;
		
		public Users saveUsers(Users users)
		{
			return repo.save(users);
		}
		
		public Users fetchUsers(long id)
		{
			Optional<Users> optional=repo.findById(id);
			
			if(optional.isPresent())
			{
				return optional.get();
			}
			return null;
		}
		
		public List<Users> fetchAllUsers()
		{
			return repo.findAll();
		}
		
		// BY USING DELELET(ID)
		public Users deleteUsers(long id)
		{
			Optional<Users>optional=repo.findById(id);
			
			if(optional.isPresent())
			{
				repo.deleteById(id);
				return optional.get();
			}
			return null;
		}
		
		
		
		public Users updateUsers(long id, Users users)
		{
			Optional<Users> optional=repo.findById(id);
			
			if(optional.isPresent())
			{
				users.setId(id);
				return repo.save(users);
			}
			return null;

		}
		
		public Users findByEmail(String email)
		{
			return repo.findUsersByEmail(email);
		}
		
		public Users findByPhone(long phone)
		{
			return repo.findUsersByPhone(phone);
		}
		
	
		
		public List<Users> findByName(String name)
		{
			return repo.findUsersByName(name);
		}
		
		
		
		
		
		
		
		
		
}
