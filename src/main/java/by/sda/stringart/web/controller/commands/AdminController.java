package by.sda.stringart.web.controller.commands;

import static by.sda.stringart.web.controller.util.JspPagesNames.*;
import static by.sda.stringart.web.controller.util.JspParametresPool.*;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import by.sda.stringart.bean.users.User;
import by.sda.stringart.service.ArtistService;
import by.sda.stringart.service.OrderService;
import by.sda.stringart.service.PictureService;
import by.sda.stringart.service.StandartService;
import by.sda.stringart.service.UserService;

@Controller
public class AdminController {
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
	
	public AdminController(ArtistService artistService, UserService userService, PictureService pictureService,
			OrderService orderService, StandartService standartService) {
		super();
		this.artistService = artistService;
		this.userService = userService;
		this.pictureService = pictureService;
		this.orderService = orderService;
		this.standartService = standartService;
	}
	
	private boolean checkAdminRole() {
		ServletRequestAttributes attr = (ServletRequestAttributes) RequestContextHolder.currentRequestAttributes();
		HttpSession session = attr.getRequest().getSession(true);
		return ( session.getAttribute(USER_TYPE_ADMIN) != null && session.getAttribute(USER_TYPE_ADMIN).getClass() == User.class) ;
	}
	
	@RequestMapping(value = "/to_advanced_artist_exhibition", method = RequestMethod.POST)
	public String toArtistExhibition(ModelMap model, @RequestParam int artistId) {
		if(!checkAdminRole()) {
			return ACCESS_DENIED_PAGE;
		}
		model.addAttribute(ARTIST_NAME,artistService.read(artistId).getFullName());
		model.addAttribute(PICTURES_LIST,pictureService.getOneArtistPicturesList(artistId));
		return ARTIST_EXHIBITION_ADMIN_PAGE;
	}
}
