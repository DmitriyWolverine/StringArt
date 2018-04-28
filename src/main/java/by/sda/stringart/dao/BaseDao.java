package by.sda.stringart.dao;

import java.util.List;

import by.sda.stringart.bean.Entity;

public interface BaseDao <T extends Entity> {
	void create(T entity);
	T read(int id);
	void update(T entity);
	void delete(T entity);
	List<T> readAll();
}