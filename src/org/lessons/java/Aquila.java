package org.lessons.java;

public class Aquila extends Animale implements IVolante {
	
	public void verso() {
		System.out.println("Aaaaaaaaaa");
	}
	
	public void mangia() {
		System.out.println("Carne!");
	}

	@Override
	public void vola() {
		System.out.println("Vooolaaaaaaaaa!");	
	}
	

}
