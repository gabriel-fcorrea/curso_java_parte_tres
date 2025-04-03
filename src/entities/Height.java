package entities;

public class Height {

	private double height;
	private char gender;

	public Height(double height, char gender) {
		super();
		this.height = height;
		this.gender = gender;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public char getGender() {
		return gender;
	}

	public void setGender(char gender) {
		this.gender = gender;
	}

}
