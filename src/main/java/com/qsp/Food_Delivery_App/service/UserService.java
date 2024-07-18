package com.qsp.Food_Delivery_App.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import com.qsp.Food_Delivery_App.dao.UserDao;
import com.qsp.Food_Delivery_App.dto.Users;
import com.qsp.Food_Delivery_App.repository.UserRepo;

public class UserService
{
	@Autowired
	private UserDao dao;
	
	public Users saveUsers(Users users)
	{
		return dao.saveUsers(users);
	}
	
	public Users fetchUsers(long id)
	{
		return dao.fetchUsers(id);
	}
	
	public List<Users> fetchAllUsers()
	{
		return dao.fetchAllUsers();
	}
	
	// BY USING DELELET(ID)
	public Users deleteUsers(long id)
	{
		return dao.deleteUsers(id);
	}
	
	public Users updateUsers(long id, Users users)
	{
		return dao.updateUsers(id, users);

	}
	
	public Users findByEmail(String email)
	{
		return dao.findByEmail(email);
	}
	
	public Users findByPhone(long phone)
	{
		return dao.findByPhone(phone);
	}
	

	
	public List<Users> findByName(String name)
	{
		return dao.findByName(name);
	}
	
}
