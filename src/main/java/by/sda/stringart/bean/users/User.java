package by.sda.stringart.bean.users;

import java.util.List;

import by.sda.stringart.bean.Entity;
import by.sda.stringart.bean.orders.Order;

public class User extends Entity{
	/**
	 *Auto generated serial version ID
	 */
	private static final long serialVersionUID = -1590134441794880246L;
	private String login;
	private String pass;
	private String email;
	private List<Order> orders;
	
	public User() {
		super();
	}
	public User(int id) {
		super(id);
	}
	
	public User(String login, String pass) {
		super();
		this.login = login;
		this.pass = pass;
	}
	public User(String login, String pass, String email, List<Order> orders) {
		super();
		this.login = login;
		this.pass = pass;
		this.email = email;
		this.orders = orders;
	}
	
	public String getLogin() {
		return login;
	}
	public void setLogin(String login) {
		this.login = login;
	}
	public String getPass() {
		return pass;
	}
	public void setPass(String pass) {
		this.pass = pass;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public List<Order> getOrders() {
		return orders;
	}
	public void setOrders(List<Order> orders) {
		this.orders = orders;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((email == null) ? 0 : email.hashCode());
		result = prime * result + ((login == null) ? 0 : login.hashCode());
		result = prime * result + ((orders == null) ? 0 : orders.hashCode());
		result = prime * result + ((pass == null) ? 0 : pass.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		User other = (User) obj;
		if (email == null) {
			if (other.email != null)
				return false;
		} else if (!email.equals(other.email))
			return false;
		if (login == null) {
			if (other.login != null)
				return false;
		} else if (!login.equals(other.login))
			return false;
		if (orders == null) {
			if (other.orders != null)
				return false;
		} else if (!orders.equals(other.orders))
			return false;
		if (pass == null) {
			if (other.pass != null)
				return false;
		} else if (!pass.equals(other.pass))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "User ID=" +getId()+", login=" + login + ", pass=" + pass + ", email=" + email + ", orders=" + orders;
	}
	
}
