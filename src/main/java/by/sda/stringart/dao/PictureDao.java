package by.sda.stringart.dao;

import java.util.List;

import by.sda.stringart.bean.pictures.Picture;

public interface PictureDao extends BaseDao<Picture>{
	List<Picture> readOneArtistPictures(int artistId);

}
