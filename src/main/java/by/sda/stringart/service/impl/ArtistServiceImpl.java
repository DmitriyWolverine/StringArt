package by.sda.stringart.service.impl;

import java.util.List;

import by.sda.stringart.bean.artists.Artist;
import by.sda.stringart.dao.ArtistDao;
import by.sda.stringart.dao.hibernate.ArtistDaoHibernateImpl;
import by.sda.stringart.service.ArtistService;

public class ArtistServiceImpl implements ArtistService{
	
	private ArtistDao artistDao;
	
	public ArtistServiceImpl() {
		super();
		this.artistDao = new ArtistDaoHibernateImpl();
	}
	
	public ArtistServiceImpl(ArtistDao artistDao) {
		super();
		this.artistDao = artistDao;
	}
	
	@Override
	public void createArtist(Artist artist) {
		artistDao.create(artist);
	}

	@Override
	public void updateArtist(Artist artist) {
		artistDao.update(artist);
	}

	@Override
	public void deleteArtist(Artist artist) {
		artistDao.delete(artist);
	}

	@Override
	public Artist readArtist(int i) {
		return artistDao.read(i);
	}

	@Override
	public List<Artist> getAllArtists() {
		return artistDao.readAll();
	}

}
