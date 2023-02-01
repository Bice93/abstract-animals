package org.lessons.java;

public class Passerotto extends Animale implements IVolante {
	
	public void verso() {
		System.out.println("Cipcip");
	}
	
	public void mangia() {
		System.out.println("Insetti, Semi!");
	}

	@Override
	public void vola() {
		System.out.println("Vooolaaaaaaaaa!");
	}
	
	

}
