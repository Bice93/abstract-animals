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
		
		
		/*
			Scrivere un programma che istanzi animali che volano o nuotano e richiamare i metodi faiVolare / faiNuotare 
			passandoglieli come parametro.
		 */
		
		Delfino delfino2 = new Delfino();
		faiNuotare(delfino2);
		
		Passerotto passerotto2 = new Passerotto();
		faiVolare(passerotto2);
		
		faiNuotare(newDelfino);
		faiVolare(newPasserotto);
		
	}
	
	/*
	 *  Scrivere un programma avente 2 metodi :
			- void faiVolare(IVolante animale)
			- void faiNuotare(INuotante animale)
			
		Questi metodi prendono come parametro un animale che può o volare / nuotare e 
			richiamano il corrispondente metodo vola() / nuota().
	 */
	
	public static void faiVolare(IVolante animale) {
		animale.vola();
	}
	
	public static void faiNuotare(INuotante animale) {
		animale.nuota();
	}

}
