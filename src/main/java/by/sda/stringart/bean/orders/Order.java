package by.sda.stringart.bean.orders;

import java.util.Date;

import by.sda.stringart.bean.Entity;

public class Order extends Entity{
	
	/**
	 * Auto generated Serial version Id
	 */
	private static final long serialVersionUID = 3230322455892179380L;
	private String name;
	private String describtion;
	private Date appliedDate;
	private Date deadLineDate;
	private String status;
	
	public Order() {
		super();
	}

	public Order(int id) {
		super(id);
	}

	public Order(String name, String describtion, Date appliedDate, Date deadLineDate, String status) {
		super();
		this.name = name;
		this.describtion = describtion;
		this.appliedDate = appliedDate;
		this.deadLineDate = deadLineDate;
		this.status = status;
	}

	public Order(int id, String name, String describtion, Date appliedDate, Date deadLineDate, String status) {
		super(id);
		this.name = name;
		this.describtion = describtion;
		this.appliedDate = appliedDate;
		this.deadLineDate = deadLineDate;
		this.status = status;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescribtion() {
		return describtion;
	}

	public void setDescribtion(String describtion) {
		this.describtion = describtion;
	}

	public Date getAppliedDate() {
		return appliedDate;
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

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((appliedDate == null) ? 0 : appliedDate.hashCode());
		result = prime * result + ((deadLineDate == null) ? 0 : deadLineDate.hashCode());
		result = prime * result + ((describtion == null) ? 0 : describtion.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((status == null) ? 0 : status.hashCode());
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
		if (describtion == null) {
			if (other.describtion != null)
				return false;
		} else if (!describtion.equals(other.describtion))
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
		return "Order Id="+ getId() +" name=" + name + ", describtion=" + describtion + ", appliedDate=" + appliedDate
				+ ", deadLineDate=" + deadLineDate + ", status=" + status;
	}
	

}
