package Figury;

import java.util.ArrayList;
import java.util.List;

public abstract class Figura {

	public abstract double obliczPole();
	
	public static void main(String[] args) {
		List<Figura> Figury = new ArrayList<>();
		Figury.add(new Prostokat(10, 2));
		Figury.add(new Prostokat(12, 6));
		Figury.add(new Prostokat(4, 18));
		Figury.add(new Prostokat(10, 12));

		Figury.add(new Okrag(4));
		Figury.add(new Okrag(6));
		Figury.add(new Okrag(3));

		Figury.add(new Trojkat(5, 2));
		Figury.add(new Trojkat(15, 3));
		Figury.add(new Trojkat(4, 7));

		
		for (Figura f : Figury)
		{
			System.out.println(f + " o polu " + f.obliczPole());
		}
 	}
}