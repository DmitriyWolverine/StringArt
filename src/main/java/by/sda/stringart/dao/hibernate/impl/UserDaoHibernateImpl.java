package by.sda.stringart.dao.hibernate.impl;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.springframework.stereotype.Repository;

import by.sda.stringart.bean.users.User;
import by.sda.stringart.dao.UserDao;
import by.sda.stringart.dao.hibernate.SessionFactoryManager;

@Repository
public class UserDaoHibernateImpl implements UserDao{
	
	public UserDaoHibernateImpl() {
		super();
	}

	@Override
	public void create(User entity) {
		Session session = SessionFactoryManager.getSessionFactory().openSession();
		session.beginTransaction();
		session.save(entity);
		session.getTransaction().commit();
		session.close();
	}

	@Override
	public User read(int id) {
		Session session = SessionFactoryManager.getSessionFactory().openSession();
		User user = (User) session.get(User.class, id);
		session.close();
		return user;
	}

	@Override
	public void update(User entity) {
		Session session = SessionFactoryManager.getSessionFactory().openSession();
		session.beginTransaction();
		session.update(entity);
		session.getTransaction().commit();
		session.close();
	}

	@Override
	public void delete(User entity) {
		Session session = SessionFactoryManager.getSessionFactory().openSession();
		session.delete(entity);
		session.close();
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<User> readAll() {
		Session session = SessionFactoryManager.getSessionFactory().openSession();
		Criteria criteria = session.createCriteria(User.class);
		List<User> users = criteria.list();
		session.close();
		return users;
	}

}
