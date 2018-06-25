package by.sda.stringart.bean.users;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.JoinColumn;


import org.springframework.stereotype.Component;

import by.sda.stringart.bean.orders.Order;
import by.sda.stringart.bean.pictures.Picture;


@Component
@Entity
@Table(name = "users")
public class User implements Serializable{
	/**
	 *Auto generated serial version ID
	 */
	private static final long serialVersionUID = -1590134441794880246L;
	@Id 
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Column(name = "login")
	private String login;
	@Column(name = "password")
	private String pass;
	@Column(name = "email")
	private String email;
	
	@OneToMany(mappedBy = "user", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	private List<Order> orders;
	
	@ManyToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	@JoinTable(
			name = "orders",
			joinColumns = @JoinColumn(name = "client_id"),
			inverseJoinColumns = @JoinColumn (name = "picture_id")
			)
	private List<Picture> pictures;
	
	
	public User() {
		super();
	}
	public User(int id) {
		this.id = id;
	}
	
	public User(String login, String pass) {
		super();
		this.login = login;
		this.pass = pass;
	}
	
	public User(String login, String email, String pass) {
		super();
		this.login = login;
		this.email = email;
		this.pass = pass;
	}
	
	public User(String login, String pass, String email, List<Order> orders) {
		super();
		this.login = login;
		this.pass = pass;
		this.email = email;
		this.orders = orders;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
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
	public List<Picture> getPictures() {
		return pictures;
	}
	public void setPictures(List<Picture> pictures) {
		this.pictures = pictures;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((email == null) ? 0 : email.hashCode());
		result = prime * result + id;
		result = prime * result + ((login == null) ? 0 : login.hashCode());
		result = prime * result + ((orders == null) ? 0 : orders.hashCode());
		result = prime * result + ((pass == null) ? 0 : pass.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		User other = (User) obj;
		if (email == null) {
			if (other.email != null)
				return false;
		} else if (!email.equals(other.email))
			return false;
		if (id != other.id)
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
		return "User ID=" +id+", login=" + login + ", pass=" + pass + ", email=" + email + ", orders=" + orders;
	}
	
}
