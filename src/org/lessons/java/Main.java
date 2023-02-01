package org.lessons.java;

public class Main {

	public static void main(String[] args) {
		//istanziare alcuni animali e utilizzare i metodi implementati
		
		Cane newCane = new Cane();
		newCane.dormi();
		newCane.verso();
		newCane.mangia();
		System.out.println("\n");

		Passerotto newPasserotto = new Passerotto();
		newPasserotto.dormi();
		newPasserotto.verso();
		newPasserotto.mangia();
		newPasserotto.vola();;
		System.out.println("\n");
		
		Aquila newAquila = new Aquila();
		newAquila.dormi();
		newAquila.verso();
		newAquila.mangia();
		newAquila.vola();;
		System.out.println("\n");
		
		Delfino newDelfino = new Delfino();
		newDelfino.dormi();
		newDelfino.verso();
		newDelfino.mangia();
		newDelfino.nuota();
		System.out.println("\n");
	}

}
