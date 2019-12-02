package com.example.basic.MicroServices.Users;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

import org.springframework.stereotype.Component;

@Component
public class UsersDaoService {
private static List<Users> s=new ArrayList<Users>();
private static int usersCount = 3;
static {
	s.add(new Users(1,"deepak",new Date()));
	s.add(new Users(2,"deepak1",new Date()));
	s.add(new Users(3,"deepak2",new Date()));
}

public List<Users> findAll() {
	return s;
}

public Users save(Users user) {
	if (user.getId() == null) {
		user.setId(++usersCount);
	}
	s.add(user);
	return user;
}

public Users findOne(int id) {
	for (Users user : s) {
		if (user.getId() == id) {
			return user;
		}
	}
	return null;
}

public Users deleteById(int id) {
	Iterator<Users> iterator = s.iterator();
	while (iterator.hasNext()) {
		Users user = iterator.next();
		if (user.getId() == id) {
			iterator.remove();
			return user;
		}
	}
	return null;
}
}
