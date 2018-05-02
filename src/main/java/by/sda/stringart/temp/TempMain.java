package by.sda.stringart.temp;

import by.sda.stringart.bean.artists.Artist;
import by.sda.stringart.service.ArtistService;
import by.sda.stringart.service.impl.ArtistServiceImpl;

public class TempMain {

	public static void main(String[] args) {
		ArtistService service = new ArtistServiceImpl();
		System.out.println(service.getAllArtists());
		Artist a = service.readArtist(3);
		a.setName("Viktor");
		service.updateArtist(a);

	}

}
