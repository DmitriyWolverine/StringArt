package by.sda.stringart.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import by.sda.stringart.bean.standarts.Standart;
import by.sda.stringart.dao.StandartDao;
import by.sda.stringart.dao.hibernate.impl.StandartDaoHibernateImpl;
import by.sda.stringart.service.StandartService;

@Service
public class StandartServiceImpl implements StandartService{
	
	@Autowired
	@Qualifier("standartDaoHibernateImpl")
	private StandartDao standartDao;
	
	public StandartServiceImpl() {
		super();
		standartDao = new StandartDaoHibernateImpl();
	}

	public StandartServiceImpl(StandartDao standartDao) {
		super();
		this.standartDao = standartDao;
	}

	@Override
	public void create(Standart standart) {
		standartDao.create(standart);
	}

	@Override
	public void update(Standart standart) {
		standartDao.update(standart);
	}

	@Override
	public void delete(Standart standart) {
		standartDao.delete(standart);
	}

	@Override
	public Standart read(int i) {
		return standartDao.read(i);
	}

	@Override
	public List<Standart> getAll() {
		return standartDao.readAll();
	}

}
