package by.sda.stringart.service;

import java.util.List;

import by.sda.stringart.bean.artists.Artist;


public interface ArtistService {
	void createArtist (Artist artist);
	void updateArtist (Artist artist);
	void deleteArtist (Artist artist);
	Artist readArtist (int i);
	List<Artist> getAllArtists();

}
