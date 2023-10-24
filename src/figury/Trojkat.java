package Figury;

public class Trojkat extends Figura {
	private double height;
	
	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public double getBase() {
		return base;
	}

	public void setBase(double base) {
		this.base = base;
	}

	private double base;
	
	public Trojkat(double h, double b) {
		// TODO Auto-generated constructor stub
		height = h;
		base = b;
	}
	
	@Override
	public double obliczPole() {
		// TODO Auto-generated method stub
		return (height * base) / 2;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Trójkąt o podstawie: " + base + ", " + height;
	}

}
