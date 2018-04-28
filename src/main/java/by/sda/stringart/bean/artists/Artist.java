package by.sda.stringart.bean.artists;

import java.util.Date;

import by.sda.stringart.bean.Entity;

public class Artist extends Entity{
	/**
	 * Auto generated serial version ID
	 */
	private static final long serialVersionUID = 8505484142381275306L;
	private String name;
	private String surname;
	private Date birthday;
	private String style;
	
	public Artist() {
		super();
	}
	
	public Artist(int id) {
		super(id);
	}
	
	public Artist(String name, String surname, Date birthday, String style) {
		super();
		this.name = name;
		this.surname = surname;
		this.birthday = birthday;
		this.style = style;
	}
	public Artist(int id, String name, String surname, Date birthday, String style) {
		super(id);
		this.name = name;
		this.surname = surname;
		this.birthday = birthday;
		this.style = style;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public Date getBirthday() {
		return birthday;
	}

	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}

	public String getStyle() {
		return style;
	}

	public void setStyle(String style) {
		this.style = style;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((birthday == null) ? 0 : birthday.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((style == null) ? 0 : style.hashCode());
		result = prime * result + ((surname == null) ? 0 : surname.hashCode());
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
		Artist other = (Artist) obj;
		if (birthday == null) {
			if (other.birthday != null)
				return false;
		} else if (!birthday.equals(other.birthday))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (style == null) {
			if (other.style != null)
				return false;
		} else if (!style.equals(other.style))
			return false;
		if (surname == null) {
			if (other.surname != null)
				return false;
		} else if (!surname.equals(other.surname))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Author Id=" + getId()+", name=" + name + ", surname=" + surname + ", birthday=" + birthday + ", style=" + style;
	}
	
	
}
