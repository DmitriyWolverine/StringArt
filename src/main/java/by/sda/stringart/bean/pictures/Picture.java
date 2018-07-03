package by.sda.stringart.bean.pictures;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;


import org.springframework.stereotype.Component;

import by.sda.stringart.bean.artists.Artist;
import by.sda.stringart.bean.standarts.Standart;
import by.sda.stringart.bean.users.User;
import by.sda.stringart.bean.util.Style;

@Component
@Entity
@Table(name = "pictures")
public class Picture implements Serializable{
	
	/**
	 *  Auto generated serial version ID
	 */
	private static final long serialVersionUID = 6030987378465035645L;
	@Id 
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Column(name = "name")
	private String name;
	@Column(name = "price")
	private String price;
	
    @ManyToOne
    @JoinColumn(name = "artist_id")
	private Artist artist;

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "style_id")
	private Style style;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "standart_id")
	private Standart standart;
	
	@ManyToMany(mappedBy = "pictures")
	private List<User> users;
	
	@Column(name = "image")
	private String image;
	
	@Column(name = "photo")
	private String photo;
	
	public Picture() {
		super();
	}
	public Picture(int id) {
		this.id = id;
	}
	public Picture(String name, Artist artist, String price, Style style) {
		super();
		this.name = name;
		this.artist = artist;
		this.price = price;
		this.style = style;
	} 
	
	public Picture(int id, String name, Artist artist, String price, Style style) {
		this.id = id;
		this.name = name;
		this.artist = artist;
		this.price = price;
		this.style = style;
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
	public Artist getArtist() {
		return artist;
	}
	public void setArtist(Artist artist) {
		this.artist = artist;
	}
	
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}
	
	public Style getStyle() {
		return style;
	}
	public void setStyle(Style style) {
		this.style = style;
	}

	public List<User> getUsers() {
		return users;
	}
	public void setUsers(List<User> users) {
		this.users = users;
	}
	
	public Standart getStandart() {
		return standart;
	}
	public void setStandart(Standart standart) {
		this.standart = standart;
	}
	public String getImage() {
		return image;
	}
	public void setImage(String image) {
		this.image = image;
	}
	
	public String getPhoto() {
		return photo;
	}
	public void setPhoto(String photo) {
		this.photo = photo;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((artist == null) ? 0 : artist.hashCode());
		result = prime * result + id;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((price == null) ? 0 : price.hashCode());
		result = prime * result + ((style == null) ? 0 : style.hashCode());
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
		Picture other = (Picture) obj;
		if (artist == null) {
			if (other.artist != null)
				return false;
		} else if (!artist.equals(other.artist))
			return false;
		if (id != other.id)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (price == null) {
			if (other.price != null)
				return false;
		} else if (!price.equals(other.price))
			return false;
		if (style == null) {
			if (other.style != null)
				return false;
		} else if (!style.equals(other.style))
			return false;
		return true;
	}
	
	@Override
	public String toString() {
		return "Picture Id = " + id +", name=" + name + ", author=" + artist + ", price=" + price + ", "+style;
	} 
	
}
