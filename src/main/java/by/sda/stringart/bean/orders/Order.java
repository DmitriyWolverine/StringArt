package by.sda.stringart.bean.orders;

import java.io.Serializable;
import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import by.sda.stringart.bean.pictures.Picture;
import by.sda.stringart.bean.users.User;

@Component
@Scope("prototype")
@Entity
@Table(name = "orders")
public class Order implements Serializable{
	
	/**
	 * Auto generated Serial version Id
	 */
	private static final long serialVersionUID = 3230322455892179380L;
	@Id 
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Column(name = "name")
	private String name;
	@Column(name = "get_date")
	private Date appliedDate;
	@Column(name = "done_date")
	private Date deadLineDate;
	@Column(name = "status")
	private String status;
	@Column(name = "price")
	private BigDecimal price;
	
	@ManyToOne
	@JoinColumn(name = "client_id")
	private User user;
	
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name = "picture_id")
	private Picture picture;
	
	
	public Order() {
		super();
	}

	public Order(int id) {
		this.id = id;
	}

	public Order(String name, Date appliedDate, Date deadLineDate, String status) {
		super();
		this.name = name;
		this.appliedDate = appliedDate;
		this.deadLineDate = deadLineDate;
		this.status = status;
	}

	public Order(int id, String name,Date appliedDate, Date deadLineDate, String status) {
		this.id = id;
		this.name = name;
		this.appliedDate = appliedDate;
		this.deadLineDate = deadLineDate;
		this.status = status;
	}
	
	public Order(String name,  User user, Picture picture,BigDecimal price) {
		super();
		this.name = name;
		this.price = price;
		this.user = user;
		this.picture = picture;
	}

	public Order(String name, BigDecimal price){
		super();
		this.name = name;
		this.price = price;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getAppliedDate() {
		return appliedDate;
	}
	public String getAppliedDateNoTime() {
		SimpleDateFormat dateFormat = new SimpleDateFormat("dd MMMM yyyy", Locale.ENGLISH);
		return dateFormat.format(appliedDate);
	}
	
	public void setAppliedDate(Date appliedDate) {
		this.appliedDate = appliedDate;
	}

	public Date getDeadLineDate() {
		return deadLineDate;
	}

	public void setDeadLineDate(Date deadLineDate) {
		this.deadLineDate = deadLineDate;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public BigDecimal getPrice() {
		return price;
	}

	public void setPrice(BigDecimal price) {
		this.price = price;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}
	
	public Picture getPicture() {
		return picture;
	}

	public void setPicture(Picture picture) {
		this.picture = picture;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((appliedDate == null) ? 0 : appliedDate.hashCode());
		result = prime * result + ((deadLineDate == null) ? 0 : deadLineDate.hashCode());
		result = prime * result + id;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((status == null) ? 0 : status.hashCode());
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
		Order other = (Order) obj;
		if (appliedDate == null) {
			if (other.appliedDate != null)
				return false;
		} else if (!appliedDate.equals(other.appliedDate))
			return false;
		if (deadLineDate == null) {
			if (other.deadLineDate != null)
				return false;
		} else if (!deadLineDate.equals(other.deadLineDate))
			return false;
		if (id != other.id)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (status == null) {
			if (other.status != null)
				return false;
		} else if (!status.equals(other.status))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Order Id = "+ id +" name = " + name +  ", appliedDate = " + appliedDate
				+ ", deadLineDate = " + deadLineDate + ", status = " + status;
	}
	

}
