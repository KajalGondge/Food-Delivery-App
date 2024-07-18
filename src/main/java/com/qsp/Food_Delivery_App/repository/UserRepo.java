package com.qsp.Food_Delivery_App.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.qsp.Food_Delivery_App.dto.Users;

public interface UserRepo extends JpaRepository<Users, Long>{

	Users findUsersByEmail(String email);

	Users findUsersByPhone(long phone);

	List<Users> findUsersByName(String name);

}
