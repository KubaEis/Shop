package library;

import autosaloon.Magazine;

public class Library {
	private Book[] items;
	private Magazine[] magazines;

	public void addItems(int pocetK, int pocetM) {
		items = new Book[pocetK];
		for (int i=0; i<pocetK; i++){
			items[i] = new Book();
		}
		magazines = new Magazine[pocetM];
		for (int i=0; i<pocetM; i++){
			magazines[i] = new Magazine();
		}
	}

	public void printInfo(){
		System.out.println("-----INFO O KNIHOVNE-----");
		for (int i=0; i<items.length; i++){
			items[i].printInfo();
		}
		for (int i=0; i<magazines.length; i++){
			magazines[i].printInfo();
		}
		System.out.println("-----");
	}
}
