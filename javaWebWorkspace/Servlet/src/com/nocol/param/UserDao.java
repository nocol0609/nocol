package com.nocol.param;

public interface UserDao {

	void saveUser(User user);

	User findUserByName(String name);
}
