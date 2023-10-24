package Figury;

public class Okrag extends Figura {
	
	private double promien;
	
	public double getPromien() {
		return promien;
	}

	public void setPromien(double promien) {
		this.promien = promien;
	}

	public Okrag(double r) {
		// TODO Auto-generated constructor stub
		promien = r;
	}
	
	@Override
	public double obliczPole() {
		// TODO Auto-generated method stub
		return Math.PI * Math.pow(promien, 2);
	}

	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Okrąg o promieniu:" + promien;
	}
}
