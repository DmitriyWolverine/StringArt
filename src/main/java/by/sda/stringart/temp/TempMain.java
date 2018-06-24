package by.sda.stringart.temp;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import by.sda.stringart.bean.artists.Artist;
import by.sda.stringart.bean.pictures.Picture;
import by.sda.stringart.bean.util.Style;
import by.sda.stringart.service.ArtistService;
import by.sda.stringart.service.PictureService;
import by.sda.stringart.service.StyleService;

public class TempMain {

	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		ApplicationContext context = new ClassPathXmlApplicationContext("/WEB-INF/app-context.xml");
		Style style = (Style) context.getBean("style");
		style.setId(1);
		style.setName("freeStyle");
		//проверка работы spring-context
		System.out.println(style);
		
		StyleService service = (StyleService) context.getBean("styleServiceImpl");
		Style s = service.read(3);
		System.out.println(s);
		
		
		PictureService pictureService = (PictureService) context.getBean("pictureServiceImpl") ;
		System.out.println(pictureService.read(1));
		
		Artist artist = (Artist) context.getBean("artist");
		artist.setId(4);
		artist.setSurname("Malevich");
		artist.setStyle(style);
		System.out.println(artist);
		
		ArtistService aService = (ArtistService) context.getBean("artistServiceImpl");
		for(Artist a: aService.getAll() )
			System.out.println(a) ;
	
	}

}
