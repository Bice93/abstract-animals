package org.lessons.java;

public class Delfino extends Animale implements INuotante {
	
	public void verso() {
		System.out.println("Wiiiiiiii");
	}
	
	public void mangia() {
		System.out.println("Pesce, Crostacei!");
	}

	@Override
	public void nuota() {
		System.out.println("Nuotaaaaaa!");
	}

}
