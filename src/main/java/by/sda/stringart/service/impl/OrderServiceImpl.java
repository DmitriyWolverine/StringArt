package by.sda.stringart.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import by.sda.stringart.bean.orders.Order;
import by.sda.stringart.dao.OrderDao;
import by.sda.stringart.dao.hibernate.impl.OrderDaoHibernateImpl;
import by.sda.stringart.service.OrderService;

@Service
public class OrderServiceImpl implements OrderService{

	@Autowired
	@Qualifier("orderDaoHibernateImpl")
	private OrderDao orderDao;
	
	
	public OrderServiceImpl() {
		super();
		this.orderDao = new OrderDaoHibernateImpl();
	}
	
	public OrderServiceImpl(OrderDao orderDao) {
		super();
		this.orderDao = orderDao;
	}

	@Override
	public void create(Order order) {
		orderDao.create(order);
	}

	@Override
	public void update(Order order) {
		orderDao.update(order);
	}

	@Override
	public void delete(Order order) {
		orderDao.delete(order);
	}

	@Override
	public Order read(int i) {
		return orderDao.read(i);
	}

	@Override
	public List<Order> getAll() {
		return orderDao.readAll();
	}

}
