package by.sda.stringart.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import by.sda.stringart.bean.artists.Artist;
import by.sda.stringart.dao.ArtistDao;
import by.sda.stringart.service.ArtistService;

@Service
public class ArtistServiceImpl implements ArtistService{

	@Autowired
	@Qualifier("artistDaoHibernateImpl")
	private ArtistDao artistDao;
	
	public ArtistServiceImpl() {
		super();
	}
	

	public ArtistServiceImpl(ArtistDao artistDao) {
		super();
		this.artistDao = artistDao;
	}

	@Override
	public void create(Artist artist) {
		artistDao.create(artist);
	}

	@Override
	public void update(Artist artist) {
		artistDao.update(artist);
	}

	@Override
	public void delete(Artist artist) {
		artistDao.delete(artist);
	}

	@Override
	public Artist read(int i) {
		return artistDao.read(i);
	}

	@Override
	public List<Artist> getAll() {
		return artistDao.readAll();
	}

	

}
