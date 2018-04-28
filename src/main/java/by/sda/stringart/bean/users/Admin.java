package by.sda.stringart.bean.users;

import java.util.ArrayList;
import java.util.List;

import by.sda.stringart.bean.orders.Order;

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
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((users == null) ? 0 : users.hashCode());
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
		Admin other = (Admin) obj;
		if (users == null) {
			if (other.users != null)
				return false;
		} else if (!users.equals(other.users))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Admin ID ="+ getId() +"users=" + users + ", getLogin()=" + getLogin() + ", getPass()=" + getPass() + ", getEmail()="
				+ getEmail() + ", getOrders()=" + getOrders() ;
	}
	

}
