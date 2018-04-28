package by.sda.stringart.commands.impl;

import javax.servlet.http.HttpServletRequest;

import by.sda.stringart.commands.BaseCommand;
import by.sda.stringart.service.ArtistService;
import by.sda.stringart.service.impl.ArtistServiceImpl;
import static by.sda.stringart.commands.util.JspParametresPool.ARTISTS_LIST;
import static by.sda.stringart.commands.util.CommandsPool.SHOW_ARTISTS_LIST;;


public class ShowArtists implements BaseCommand{
	private ArtistService artistService;
	
	public ShowArtists() {
		super();
		artistService = new ArtistServiceImpl();
	}

	public ShowArtists(ArtistService service) {
		super();
		artistService = service;
	}

	@Override
	public String doAction(HttpServletRequest request) {
		request.setAttribute(ARTISTS_LIST, artistService.getAllArtists());
		return SHOW_ARTISTS_LIST;
	}

}
