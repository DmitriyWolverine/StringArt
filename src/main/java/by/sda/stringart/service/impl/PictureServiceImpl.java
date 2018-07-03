package by.sda.stringart.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import by.sda.stringart.bean.pictures.Picture;
import by.sda.stringart.dao.PictureDao;
import by.sda.stringart.service.PictureService;

@Service
public class PictureServiceImpl implements PictureService{
	
	@Autowired
	@Qualifier("pictureDaoHibernateImpl")
	private PictureDao pictureDao;

	public PictureServiceImpl() {
		super();
	}
	
	public PictureServiceImpl(PictureDao pictureDao) {
		super();
		this.pictureDao = pictureDao;
	}

	@Override
	public void create(Picture entity) {
		pictureDao.create(entity);
	}

	@Override
	public void update(Picture entity) {
		pictureDao.update(entity);
	}

	@Override
	public void delete(Picture entity) {
		pictureDao.delete(entity);
	}

	@Override
	public Picture read(int i) {
		return pictureDao.read(i);
	}

	@Override
	public List<Picture> getAll() {
		return pictureDao.readAll();
	}

	@Override
	public List<Picture> getOneArtistPicturesList(int artistId) {
		return pictureDao.readOneArtistPictures(artistId);
	}
	

}
