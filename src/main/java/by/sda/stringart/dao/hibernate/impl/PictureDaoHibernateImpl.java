package by.sda.stringart.dao.hibernate.impl;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.springframework.stereotype.Repository;

import by.sda.stringart.bean.pictures.Picture;
import by.sda.stringart.dao.PictureDao;
import by.sda.stringart.dao.hibernate.SessionFactoryManager;

@Repository
public class PictureDaoHibernateImpl implements PictureDao{
	
	public PictureDaoHibernateImpl() {
		super();
	}

	@Override
	public void create(Picture entity) {
		Session session = SessionFactoryManager.getSessionFactory().openSession();
		session.beginTransaction();
		session.save(entity);
		session.getTransaction().commit();
		session.close();
	}

	@Override
	public Picture read(int id) {
		Session session = SessionFactoryManager.getSessionFactory().openSession();
		Picture picture = (Picture)session.get(Picture.class, id);
		session.close();
		return picture;
	}

	@Override
	public void update(Picture entity) {
		Session session = SessionFactoryManager.getSessionFactory().openSession();
		session.beginTransaction();
		session.update(entity);
		session.getTransaction().commit();
		session.close();
	}

	@Override
	public void delete(Picture entity) {
		Session session = SessionFactoryManager.getSessionFactory().openSession();
		session.delete(entity);
		session.close();
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Picture> readAll() {
		Session session = SessionFactoryManager.getSessionFactory().openSession();
		Criteria criteria = session.createCriteria(Picture.class);
		List<Picture> pictures = criteria.list();
		session.close();
		return pictures;
	}

}
