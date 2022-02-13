package com.liam.shows.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.liam.shows.models.Show;
import com.liam.shows.models.User;
import com.liam.shows.repositories.ShowRepository;

@Service
public class ShowService {
	
	@Autowired
	private ShowRepository showRepo;
	
	// Get All
			public List<Show> getAll() {
				return showRepo.findAll();
			}
			
			// Get One
			public Show getOne(Long id) {
				return showRepo.findById(id).orElse(null);
			}
			
			// Create
			public Show createOne(Show show) {
				return showRepo.save(show);
			}
			
			
			// Update
			public Show updateOne(Show show) {
				return showRepo.save(show);
			}
			
			// Delete
			public void deleteOne(Long id) {
				showRepo.deleteById(id);
			}
			
			
			
			// Many to Many
			
//			// Add -thing-
//			public void addExtra(User user, Show show) {
//				
//				// Get array list of Users from main object
//				List<User> adders = show.getLikers();
//				
//				// Add User to list
//				adders.add(user);
//
//				showRepo.save(show);
//			}
			
//			// Remove -thing-
//			public void removeExtra(User user, Show show) {
//				
//				// Get array list of Users from main object
//				List<User> adders = show.getLikers();
//				
//				// Add User to list
//				adders.remove(user);
//
//				showRepo.save(show);
//			}

}
