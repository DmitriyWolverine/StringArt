package by.sda.stringart.bean.pictures;

import by.sda.stringart.bean.Entity;
import by.sda.stringart.bean.artists.Artist;

public abstract class AbstractPicture extends Entity{
	/**
	 *  Auto generated serial version ID
	 */
	private static final long serialVersionUID = 6030987378465035645L;
	private String name;
	private Artist author;
	private double price;
	private String style;
	
	public AbstractPicture() {
		super();
	}
	public AbstractPicture(int id) {
		super(id);
	}
	public AbstractPicture(String name, Artist author, double price, String style) {
		super();
		this.name = name;
		this.author = author;
		this.price = price;
		this.style = style;
	} 
	
	public AbstractPicture(int id, String name, Artist author, double price, String style) {
		super(id);
		this.name = name;
		this.author = author;
		this.price = price;
		this.style = style;
	}
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Artist getAuthor() {
		return author;
	}
	public void setAuthor(Artist author) {
		this.author = author;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
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
		result = prime * result + ((author == null) ? 0 : author.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		long temp;
		temp = Double.doubleToLongBits(price);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((style == null) ? 0 : style.hashCode());
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
		AbstractPicture other = (AbstractPicture) obj;
		if (author == null) {
			if (other.author != null)
				return false;
		} else if (!author.equals(other.author))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (Double.doubleToLongBits(price) != Double.doubleToLongBits(other.price))
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
		return "AbstractPicture Id = " + getId() +", name=" + name + ", author=" + author + ", price=" + price + ", style ="+style;
	} 
	
}
