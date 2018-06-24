package by.sda.stringart.dao.hibernate.impl;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.springframework.stereotype.Repository;

import by.sda.stringart.bean.util.Style;
import by.sda.stringart.dao.StyleDao;
import by.sda.stringart.dao.hibernate.SessionFactoryManager;

@Repository
public class StyleDaoHibernateImpl implements StyleDao{
	
	public StyleDaoHibernateImpl(){
		super();
	}

	@Override
	public void create(Style entity) {
		Session session = SessionFactoryManager.getSessionFactory().openSession();
		session.beginTransaction();
		session.save(entity);
		session.getTransaction().commit();
		session.close();
	}

	@Override
	public Style read(int id) {
		Session session = SessionFactoryManager.getSessionFactory().openSession();
		Style style = (Style)session.get(Style.class, id);
		session.close();
		return style;
	}

	@Override
	public void update(Style entity) {
		Session session = SessionFactoryManager.getSessionFactory().openSession();
		session.beginTransaction();
		session.update(entity);
		session.getTransaction().commit();
		session.close();
	}

	@Override
	public void delete(Style entity) {
		Session session = SessionFactoryManager.getSessionFactory().openSession();
		session.delete(entity);
		session.close();
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Style> readAll() {
		Session session = SessionFactoryManager.getSessionFactory().openSession();
		Criteria criteria = session.createCriteria(Style.class);
		List<Style> styles = criteria.list();
		session.close();
		return styles;
	}


}
