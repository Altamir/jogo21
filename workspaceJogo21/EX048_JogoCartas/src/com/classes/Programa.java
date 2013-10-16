package com.classes;

public class Programa {

	public static void main(String[] args) {
		Baralho baralho = new Baralho();
		System.out.println("Listando baralho recem criado:");
		System.out.println(baralho.listarBaralho());
		
		System.out.println("Listando baralho apos embaralhar:");
		baralho.embaralhar();
		System.out.println(baralho.listarBaralho());
	}
}
