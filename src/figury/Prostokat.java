package Figury;

public class Prostokat extends Figura {
	
	private double width;
	
	public double getWidth() {
		return width;
	}
	public void setWidth(double width) {
		this.width = width;
	}
	public double getHeight() {
		return height;
	}
	public void setHeight(double height) {
		this.height = height;
	}

	private double height;
	
	public Prostokat(double a, double b) {
		// TODO Auto-generated constructor stub
		width = a;
		height = b;
	}
	@Override
	public double obliczPole() {
		// TODO Auto-generated method stub
		return width * height;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Prostokąt o bokach: " + width + ", " + height;
	}

}
