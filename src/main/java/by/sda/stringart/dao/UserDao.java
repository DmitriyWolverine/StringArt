package by.sda.stringart.dao;

import java.util.List;

import by.sda.stringart.bean.orders.Order;
import by.sda.stringart.bean.users.User;

public interface UserDao extends BaseDao<User>{
	void create(String login, String email, String password);
	List <Order> ordersList(User entity);

}
