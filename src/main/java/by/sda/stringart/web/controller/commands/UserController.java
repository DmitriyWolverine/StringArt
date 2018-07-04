package by.sda.stringart.web.controller.commands;

import static by.sda.stringart.web.controller.util.JspPagesNames.*;
import static by.sda.stringart.web.controller.util.JspParametresPool.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import by.sda.stringart.service.ArtistService;
import by.sda.stringart.service.OrderService;
import by.sda.stringart.service.PictureService;
import by.sda.stringart.service.StandartService;
import by.sda.stringart.service.UserService;

@Controller
public class UserController {
	
	@Autowired
	@Qualifier("artistServiceImpl")
	private ArtistService artistService;
	@Autowired
	@Qualifier("userServiceImpl")
	private UserService userService;
	
	@Autowired
	@Qualifier("pictureServiceImpl")
	private PictureService pictureService;
	
	@Autowired
	@Qualifier("orderServiceImpl")
	private OrderService orderService;
	
	@Autowired
	@Qualifier("standartServiceImpl")
	private StandartService standartService;
	
	
	
	public UserController(ArtistService artistService, UserService userService, PictureService pictureService,
			OrderService orderService, StandartService standartService) {
		super();
		this.artistService = artistService;
		this.userService = userService;
		this.pictureService = pictureService;
		this.orderService = orderService;
		this.standartService = standartService;
	}

	@RequestMapping(value = "/to_artist_exhibition", method = RequestMethod.POST)
	public String toArtistExhibition(ModelMap model, @RequestParam int artistId) {
		model.addAttribute(ARTIST_NAME,artistService.read(artistId).getFullName());
		model.addAttribute(PICTURES_LIST,pictureService.getOneArtistPicturesList(artistId));
		return ARTIST_EXHIBITION_PAGE;
	}
	
	@RequestMapping(value = "/to_create_order_page", method = RequestMethod.POST)
	public String createOrder(ModelMap model, @RequestParam int pictureId) {
		model.addAttribute(PICTURE,pictureService.read(pictureId));
		model.addAttribute(STANDARTS_LIST, standartService.getAll());
		return ORDER_CREATION_PAGE;
	}
	
	
}
