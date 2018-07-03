package by.sda.stringart.service;

import java.util.List;

import by.sda.stringart.bean.pictures.Picture;


public interface PictureService extends BaseService<Picture>{
	List<Picture> getOneArtistPicturesList(int artistId);
}
