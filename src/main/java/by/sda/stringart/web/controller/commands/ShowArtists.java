package by.sda.stringart.web.controller.commands;

import static by.sda.stringart.web.controller.util.JspParametresPool.*;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import by.sda.stringart.service.impl.ArtistServiceImpl;

@Controller
public class ShowArtists {
	
	
	 @RequestMapping(value = "/show_artists", method = RequestMethod.POST)
	   public String printArtist(ModelMap model ) {
	      model.addAttribute(ARTISTS_LIST, new ArtistServiceImpl().getAll());
	      return "artistsList";
	   }
}
