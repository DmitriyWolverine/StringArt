package by.sda.stringart.dao.hibernate.impl;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.springframework.stereotype.Repository;

import by.sda.stringart.bean.artists.Artist;
import by.sda.stringart.dao.ArtistDao;
import by.sda.stringart.dao.hibernate.SessionFactoryManager;

@Repository
public class ArtistDaoHibernateImpl implements ArtistDao{
	
	public ArtistDaoHibernateImpl() {
		super();
	}

	@Override
	public void create(Artist entity) {
		Session session = SessionFactoryManager.getSessionFactory().openSession();
		session.beginTransaction();
		session.save(entity);
		session.getTransaction().commit();
		session.close();
	}

	@Override
	public Artist read(int id) {
		Session session = SessionFactoryManager.getSessionFactory().openSession();
		Artist artist = (Artist)session.get(Artist.class, id);
		session.close();
		return artist;
	}

	@Override
	public void update(Artist entity) {
		Session session = SessionFactoryManager.getSessionFactory().openSession();
		session.beginTransaction();
		session.update(entity);
		session.getTransaction().commit();
		session.close();
	}

	@Override
	public void delete(Artist entity) {
		Session session = SessionFactoryManager.getSessionFactory().openSession();
		session.delete(entity);
		session.close();
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Artist> readAll() {
		Session session = SessionFactoryManager.getSessionFactory().openSession();
		Criteria criteria = session.createCriteria(Artist.class);
		List<Artist> artists = criteria.list();
		session.close();
		return artists;
	}

}
