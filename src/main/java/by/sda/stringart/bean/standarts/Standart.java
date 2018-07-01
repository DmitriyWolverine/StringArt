package by.sda.stringart.bean.standarts;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

@Component
@Entity
@Table(name = "standarts")
public class Standart implements Serializable{

	/**
	 * Auto generated serial version ID
	 */
	private static final long serialVersionUID = -8640470176165262108L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Column(name = "name")
	private String name;
	@Column(name = "height")
	private int heigth;
	@Column(name = "width")
	private int width;
	
	public Standart() {
		super();
	}
	
	public Standart(int id, String name, int heigth, int width) {
		super();
		this.id = id;
		this.name = name;
		this.heigth = heigth;
		this.width = width;
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
	public int getHeigth() {
		return heigth;
	}
	public void setHeigth(int heigth) {
		this.heigth = heigth;
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + heigth;
		result = prime * result + id;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + width;
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
		Standart other = (Standart) obj;
		if (heigth != other.heigth)
			return false;
		if (id != other.id)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return (width != other.width);
	}

	@Override
	public String toString() {
		return "Standart [id=" + id + ", name=" + name + ", heigth=" + heigth + ", width=" + width + "]";
	}

	
}
