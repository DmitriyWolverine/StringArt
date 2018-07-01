package by.sda.stringart.bean.artists;

import java.io.Serializable;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

import by.sda.stringart.bean.pictures.Picture;
import by.sda.stringart.bean.util.Style;

@Component
@Entity
@Table(name = "artists")
public class Artist implements Serializable{
	/**
	 * Auto generated serial version ID
	 */
	private static final long serialVersionUID = 8505484142381275306L;
	@Id 
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Column(name = "name")
	private String name;
	@Column(name = "surname")
	private String surname;
	@Column(name = "birthday")
	private Date birthday;
	
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name = "style_id")
	private Style style;
	
	@OneToMany(mappedBy = "artist", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	private Set<Picture> pictures;

	public Artist() {
		super();
		pictures = new HashSet<>();
	}

	public Artist(int id) {
		super();
		this.id = id;
		pictures = new HashSet<>();
	}

	public Artist(int id, String name, String surname, Date birthday, Style style) {
		super();
		this.id = id;
		this.name = name;
		this.surname = surname;
		this.birthday = birthday;
		this.style = style;
		pictures = new HashSet<>();
	}

	public Artist(int id, String name, String surname, Date birthday, Style style, Set<Picture> pictures) {
		super();
		this.id = id;
		this.name = name;
		this.surname = surname;
		this.birthday = birthday;
		this.style = style;
		this.pictures = pictures;
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

	public Style getStyle() {
		return style;
	}

	public void setStyle(Style style) {
		this.style = style;
	}
	
	public Set<Picture> getPictures() {
		return pictures;
	}

	public void setPictures(Set<Picture> pictures) {
		this.pictures = pictures;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((birthday == null) ? 0 : birthday.hashCode());
		result = prime * result + id;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((style == null) ? 0 : style.hashCode());
		result = prime * result + ((surname == null) ? 0 : surname.hashCode());
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
		Artist other = (Artist) obj;
		if (birthday == null) {
			if (other.birthday != null)
				return false;
		} else if (!birthday.equals(other.birthday))
			return false;
		if (id != other.id)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
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
		return "Author Id = " + id+", name = " + name + ", surname = " + surname + ", birthday = " + birthday + ", " + style;
	}
	
	
}
