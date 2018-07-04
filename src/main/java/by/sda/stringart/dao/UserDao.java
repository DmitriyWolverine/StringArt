package by.sda.stringart.dao;

import by.sda.stringart.bean.users.User;

public interface UserDao extends BaseDao<User>{
	void create(String login, String email, String password);

}
