package by.sda.stringart.dao.hibernate.impl;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.springframework.stereotype.Repository;

import by.sda.stringart.bean.standarts.Standart;
import by.sda.stringart.dao.StandartDao;
import by.sda.stringart.dao.hibernate.SessionFactoryManager;

@Repository
public class StandartDaoHibernateImpl implements StandartDao{
	
	public StandartDaoHibernateImpl() {
		super();
	}

	@Override
	public void create(Standart entity) {
		Session session = SessionFactoryManager.getSessionFactory().openSession();
		session.beginTransaction();
		session.save(entity);
		session.getTransaction().commit();
		session.close();
	}

	@Override
	public Standart read(int id) {
		Session session = SessionFactoryManager.getSessionFactory().openSession();
		Standart standart = (Standart)session.get(Session.class, id);
		session.close();
		return standart;
	}

	@Override
	public void update(Standart entity) {
		Session session = SessionFactoryManager.getSessionFactory().openSession();
		session.beginTransaction();
		session.update(entity);
		session.getTransaction().commit();
		session.close();
	}

	@Override
	public void delete(Standart entity) {
		Session session = SessionFactoryManager.getSessionFactory().openSession();
		session.delete(entity);
		session.close();
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Standart> readAll() {
		Session session = SessionFactoryManager.getSessionFactory().openSession();
		Criteria criteria = session.createCriteria(Standart.class);
		List<Standart> standarts = criteria.list();
		session.close();
		return standarts;
	}

}
