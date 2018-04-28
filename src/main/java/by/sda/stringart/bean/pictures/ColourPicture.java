package by.sda.stringart.bean.pictures;

import by.sda.stringart.bean.artists.Artist;

public class ColourPicture extends AbstractPicture{

	/**
	 * Auto generated serial version id
	 */
	private static final long serialVersionUID = -7523102261859183231L;

	public ColourPicture() {
		super();
	}

	public ColourPicture(int id, String name, Artist author, double price, String style) {
		super(id, name, author, price, style);
	}

	public ColourPicture(int id) {
		super(id);
	}

	public ColourPicture(String name, Artist author, double price, String style) {
		super(name, author, price, style);
	}

	@Override
	public String toString() {
		return "ColourPicture Id="+  getId() + ", Name=" + getName() + ", Author=" + getAuthor() + ", Price=" + getPrice()+ ", Style=" + getStyle()  ;
	}
	
}
