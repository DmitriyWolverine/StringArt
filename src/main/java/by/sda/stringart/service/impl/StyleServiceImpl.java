package by.sda.stringart.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import by.sda.stringart.bean.util.Style;
import by.sda.stringart.dao.StyleDao;
import by.sda.stringart.service.StyleService;

@Service
public class StyleServiceImpl implements StyleService{
	
	@Autowired
	@Qualifier("styleDaoHibernateImpl")
	private StyleDao styleDao;

	public StyleServiceImpl() {
		super();
	}
	
	public StyleServiceImpl(StyleDao styleDao) {
		super();
		this.styleDao = styleDao;
	}

	@Override
	public void create(Style entity) {
		styleDao.create(entity);
	}

	@Override
	public void update(Style entity) {
		styleDao.update(entity);
	}

	@Override
	public void delete(Style entity) {
		styleDao.delete(entity);
	}

	@Override
	public Style read(int i) {
		return styleDao.read(i);
	}

	@Override
	public List<Style> getAll() {
		return styleDao.readAll();
	}

}
