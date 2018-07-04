package by.sda.stringart.service;

import by.sda.stringart.bean.users.User;

public interface UserService extends BaseService<User>{
	
	void create (String login, String email, String password);
	boolean validateUser(String login, String password);
	User readByLogin(String login);
}
