package by.sda.stringart.dao;

import java.math.BigDecimal;

import by.sda.stringart.bean.orders.Order;
import by.sda.stringart.bean.pictures.Picture;
import by.sda.stringart.bean.users.User;

public interface OrderDao extends BaseDao<Order>{
	void createOrderByParams(String name, User user, Picture picture, BigDecimal price);
}
