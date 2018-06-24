package by.sda.stringart.service;

import java.util.List;

public interface BaseService<T> {
	void create (T entity);
	void update (T entity);
	void delete (T entity);
	T read (int i);
	List<T> getAll();
}
