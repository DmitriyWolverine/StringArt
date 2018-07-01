package by.sda.stringart.bean.users;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Table;


import org.springframework.stereotype.Component;

import by.sda.stringart.bean.orders.Order;

@Component
@Entity
@Table(name = "users")
public class Admin extends User{
	/**
	 * Auto generated serial version id
	 */
	private static final long serialVersionUID = -6920877905331574891L;
	private List<User> users;

	public Admin() {
		super();
		users = new ArrayList<>();
	}

	public Admin(int id) {
		super(id);
		users = new ArrayList<>();
	}

	public Admin(String login, String pass, String email, List<Order> orders) {
		super(login, pass, email, orders);
	}

	public Admin(String login, String pass) {
		super(login, pass);
	}
	public Admin(String login, String pass, String email, List<Order> orders, List<User> users) {
		super(login, pass, email, orders);
		this.users=users;
	}

	public List<User> getUsers() {
		return users;
	}

	public void setUsers(List<User> users) {
		this.users = users;
	}

	@Override
	public int hashCode() {
		return super.hashCode();
	}

	@Override
	public boolean equals(Object obj) {
		return super.equals(obj);
	}

	@Override
	public String toString() {
		return "Admin ID = "+ getId() +"users = " + users + ", getLogin() = " + getLogin() + ", getPass() = " + getPass() + ", getEmail() = "
				+ getEmail() + ", getOrders() = " + getOrders() ;
	}
	

}
