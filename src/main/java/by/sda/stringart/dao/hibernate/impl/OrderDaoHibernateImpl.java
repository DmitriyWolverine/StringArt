package by.sda.stringart.dao.hibernate.impl;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.springframework.stereotype.Repository;

import by.sda.stringart.bean.orders.Order;
import by.sda.stringart.dao.OrderDao;
import by.sda.stringart.dao.hibernate.SessionFactoryManager;

@Repository
public class OrderDaoHibernateImpl implements OrderDao{

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

} 