package com.coding.web.repositories;

import org.springframework.data.repository.CrudRepository;

import com.coding.web.models.User;

public interface IUserRepository extends CrudRepository<User, Long>{
	 User findByEmail(String email);
}
