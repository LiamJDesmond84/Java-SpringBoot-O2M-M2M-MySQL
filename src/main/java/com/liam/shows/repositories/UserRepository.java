package com.liam.shows.repositories;

import java.util.List;
import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.liam.shows.models.User;

@Repository
public interface UserRepository extends CrudRepository<User, Long> {
	
	List<User> findAll();
	
	Optional<User> findByEmail(String email);
	
	boolean existsByEmail(String email);
//	User findByEmail(String email);

}
