package com.classes;

public enum NAIPE {
OURO("Ouro"),COPAS("Copas"),ESPADAS("Espadas"),PAUS("Paus");

	public String nome;
	
	private NAIPE(String nome) {
		this.nome = nome;
	}
	
	public String toString() {
		return nome;
	}

}
