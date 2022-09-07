package com.project.code.webservices.service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.project.code.webservices.Model.User;

@Component
public class UserDaoService {
	private static List<User> users = new ArrayList<>();
	static {
		users.add(new User(1,"Vj", LocalDate.now().minusYears(30)));
		users.add(new User(2,"Singh", LocalDate.now().minusYears(25)));
		users.add(new User(3,"Chauhan", LocalDate.now().minusYears(45)));
	}
	
	public List<User> findAll() {
		return users;
	}
	
	public User getUserWithId(Integer id) {
		return users.stream().filter(user -> user.getId().equals(id)).findFirst().orElse(null);
//		return users.get(id);
	}
	
	public User save(User user) {
		users.add(user);
		return user;
	}

	public void deleteById(Integer id) {
		java.util.function.Predicate<? super User> predicate = user->user.getId().equals(id);
		users.removeIf(predicate);
	}
}
