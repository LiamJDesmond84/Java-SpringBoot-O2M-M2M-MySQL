package com.liam.shows.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.liam.shows.models.Rating;
import com.liam.shows.repositories.RatingRepository;

@Service
public class RatingService {

	@Autowired
	private RatingRepository ratingRepo;
	
	// Get All
	public List<Rating> getAll() {
		return ratingRepo.findAll();
	}
	
	// Get One
	public Rating getOne(Long id) {
		return ratingRepo.findById(id).orElse(null);
	}
	
	// Create
	public Rating createOne(Rating rating) {
		return ratingRepo.save(rating);
	}
	
	
	// Update
	public Rating updateOne(Rating rating) {
		return ratingRepo.save(rating);
	}
	
	// Delete
	public void deleteOne(Long id) {
		ratingRepo.deleteById(id);
	}
	
}
