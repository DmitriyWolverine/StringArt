package by.sda.stringart.bean;

import java.io.Serializable;

public abstract class Entity implements Serializable{
	/**
	 * Auto generated serial version ID
	 */
	private static final long serialVersionUID = 4962861016189344885L;
	private int id;
	
	public Entity() {
		super();
	}

	public Entity(int id) {
		super();
		this.id = id;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
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
		Entity other = (Entity) obj;
		return (id == other.id);
		
	}

	@Override
	public String toString() {
		return "Entity id=" + id;
	}

}
