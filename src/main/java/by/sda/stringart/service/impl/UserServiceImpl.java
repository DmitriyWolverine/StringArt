package by.sda.stringart.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import by.sda.stringart.bean.users.User;
import by.sda.stringart.dao.UserDao;
import by.sda.stringart.dao.hibernate.impl.UserDaoHibernateImpl;
import by.sda.stringart.service.UserService;

@Service
public class UserServiceImpl implements UserService{
	
	@Autowired
	@Qualifier("userDaoHibernateImpl")
	private UserDao userDao;
	

	public UserServiceImpl() {
		super();
		this.userDao = new UserDaoHibernateImpl();
	}

	public UserServiceImpl(UserDao userDao) {
		super();
		this.userDao = userDao;
	}

	@Override
	public void create(User user) {
		userDao.create(user);
	}
	
	@Override
	public void create(String login, String email, String password) {
		userDao.create(login, email, password);
	}

	@Override
	public void update(User user) {
		userDao.update(user);
	}

	@Override
	public void delete(User user) {
		userDao.delete(user);
	}

	@Override
	public User read(int i) {
		return userDao.read(i);
	}

	@Override
	public List<User> getAll() {
		return userDao.readAll();
	}

	@Override
	public boolean validateUser(String login, String password) {
		for(User user: userDao.readAll()) {
	    	  if( validateParams(user, login, password) ) {
	    		 return true;
	    	  }
	    }
		return false;
	}
	
	private boolean validateParams(User user, String login,  String password) {
		return login.equals(user.getLogin()) && password.equals(user.getPass()) ;
	}
}
