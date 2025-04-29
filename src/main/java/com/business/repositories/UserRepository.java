package com.business.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import com.business.entities.User;

public interface UserRepository extends JpaRepository<User, Integer>
{

}
