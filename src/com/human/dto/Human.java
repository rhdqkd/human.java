package com.human.dto;

public class Human {
	public String name ="";
	public int age=0;
	public double height=0;
	//»ý¼ºÀÚ
	public Human() {
		
	}
	
	public Human(String name, int age, double height) {
		super();
		this.name = name;
		this.age = age;
		this.height = height;
	}
	//toString

	@Override
	public String toString() {
		return "Human [name=" + name + ", age=" + age + ", height=" + height + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + age;
		long temp;
		temp = Double.doubleToLongBits(height);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((name == null) ? 0 : name.hashCode());
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
		Human other = (Human) obj;
		if (age != other.age)
			return false;
		if (Double.doubleToLongBits(height) != Double.doubleToLongBits(other.height))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
}
