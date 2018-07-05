package by.sda.stringart.web.controller.commands;

import static by.sda.stringart.web.controller.util.JspPagesNames.*;
import static by.sda.stringart.web.controller.util.JspParametresPool.*;

import java.math.BigDecimal;

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

	private HttpSession getSession() {
		ServletRequestAttributes attr = (ServletRequestAttributes) RequestContextHolder.currentRequestAttributes();
		return attr.getRequest().getSession(true);
	}
	
	private boolean checkUserRole() {
		HttpSession session = getSession();
		return ( session.getAttribute(USER_TYPE_SIMPLEUSER) != null && session.getAttribute(USER_TYPE_SIMPLEUSER).getClass() == User.class) ;
	}
	
	@RequestMapping(value = "/to_artist_exhibition", method = RequestMethod.POST)
	public String toArtistExhibition(ModelMap model, @RequestParam int artistId) {
		if(!checkUserRole()) {
			return ACCESS_DENIED_PAGE;
		}
		model.addAttribute(ARTIST_NAME,artistService.read(artistId).getFullName());
		model.addAttribute(PICTURES_LIST,pictureService.getOneArtistPicturesList(artistId));
		return ARTIST_EXHIBITION_PAGE;
	}
	
	@RequestMapping(value = "/to_user_page", method = RequestMethod.POST)
	public String toUserPage(ModelMap model) {
		model.addAttribute(USER_LOGIN,((User)getSession().getAttribute(USER_TYPE_SIMPLEUSER)).getLogin());
		model.addAttribute(ARTISTS_LIST,artistService.getAll());
		return USER_PAGE;
	}
	
	@RequestMapping(value = "/to_create_order_page", method = RequestMethod.POST)
	public String toCreateOrderPage(ModelMap model, @RequestParam int pictureId) {
		if(!checkUserRole()) {
			return ACCESS_DENIED_PAGE;
		}
		model.addAttribute(PICTURE,pictureService.read(pictureId));
		model.addAttribute(STANDARTS_LIST, standartService.getAll());
		return ORDER_CREATION_PAGE;
	}
	
	@RequestMapping(value = "/create_order", method = RequestMethod.POST)
	public String createOrder(@RequestParam String pictureId, @RequestParam String title, @RequestParam String price) {
		if(!checkUserRole()) {
			return ACCESS_DENIED_PAGE;
		}
		BigDecimal realPrice = BigDecimal.valueOf(Double.parseDouble(price));
		int realId = Integer.parseInt(pictureId);
		orderService.createOrderByParams(title, (User)getSession().getAttribute(USER_TYPE_SIMPLEUSER), pictureService.read(realId), realPrice);
		return ORDER_SUCCESSFULLY_CREATED;
	}
	
	
	@RequestMapping(value = "/to_user_orders", method = RequestMethod.POST)
	public String toUserOrders(ModelMap model) {
		User u = (User) getSession().getAttribute(USER_TYPE_SIMPLEUSER);
		model.addAttribute(USER_LOGIN,(u.getLogin()));
		model.addAttribute(ORDERS_LIST, userService.getAllOrders(u));
		return USER_ORDERSS_PAGE;
	}
}
