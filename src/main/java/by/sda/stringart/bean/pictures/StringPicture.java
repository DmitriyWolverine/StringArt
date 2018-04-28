package by.sda.stringart.bean.pictures;

import by.sda.stringart.bean.artists.Artist;

public class StringPicture extends AbstractPicture{
	/**
	 * Auto generated Serial version Id
	 */
	private static final long serialVersionUID = -2338064277600540695L;
	private String describtion;

	public StringPicture(String describtion) {
		super();
		this.describtion = describtion;
	}

	public StringPicture() {
		super();
	}

	public StringPicture(int id, String name, Artist author, double price, String style) {
		super(id, name, author, price, style);
	}

	public StringPicture(int id) {
		super(id);
	}

	public StringPicture(String name, Artist author, double price, String style) {
		super(name, author, price, style);
	}
	
	public StringPicture(int id, String name, Artist author, double price,  String style, String describtion) {
		super(id, name, author, price, style);
		this.describtion = describtion;
	}

	public String getDescribtion() {
		return describtion;
	}

	public void setDescribtion(String describtion) {
		this.describtion = describtion;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((describtion == null) ? 0 : describtion.hashCode());
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
		StringPicture other = (StringPicture) obj;
		if (describtion == null) {
			if (other.describtion != null)
				return false;
		} else if (!describtion.equals(other.describtion))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "StringPicture ID ="+ getId() + ", getName()=" + getName() + ", getAuthor()=" + getAuthor()
				+ ", getPrice()=" + getPrice() +", describtion=" + describtion  ;
	}
	
	
}
