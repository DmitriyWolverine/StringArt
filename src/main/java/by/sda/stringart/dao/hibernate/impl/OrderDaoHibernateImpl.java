package by.sda.stringart.dao.hibernate.impl;

import java.math.BigDecimal;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import by.sda.stringart.bean.orders.Order;
import by.sda.stringart.bean.pictures.Picture;
import by.sda.stringart.bean.users.User;
import by.sda.stringart.dao.OrderDao;
import by.sda.stringart.dao.hibernate.SessionFactoryManager;

@Repository
public class OrderDaoHibernateImpl implements OrderDao{
	
	@Autowired
	@Qualifier("order")
	private Order order;
	
	public OrderDaoHibernateImpl() {
		super();
	}

	@Override
	public void create(Order entity) {
		Session session = SessionFactoryManager.getSessionFactory().openSession();
		session.beginTransaction();
		session.save(entity);
		session.getTransaction().commit();
		session.close();
	}

	@Override
	public Order read(int id) {
		Session session = SessionFactoryManager.getSessionFactory().openSession();
		Order order = (Order)session.get(Order.class, id);
		session.close();
		return order;
	}

	@Override
	public void update(Order entity) {
		Session session = SessionFactoryManager.getSessionFactory().openSession();
		session.beginTransaction();
		session.update(entity);
		session.getTransaction().commit();
		session.close();
	}

	@Override
	public void delete(Order entity) {
		Session session = SessionFactoryManager.getSessionFactory().openSession();
		session.delete(entity);
		session.close();
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Order> readAll() {
		Session session = SessionFactoryManager.getSessionFactory().openSession();
		Criteria criteria = session.createCriteria(Order.class);
		List<Order> orders = criteria.list();
		session.close();
		return orders;
	}

	@Override
	public void createOrderByParams(String name, User user, Picture picture, BigDecimal price) {
		Session session = SessionFactoryManager.getSessionFactory().openSession();
		session.beginTransaction();
		session.save( getDeterminedOrder(name,user,picture,price) );
		session.getTransaction().commit();
		session.close();
	}
	
	private Order getDeterminedOrder(String name, User user, Picture picture, BigDecimal price) {
		order.setName(name);
		order.setPicture(picture);
		order.setUser(user);
		order.setPrice(price);
		return order;
	}

} 