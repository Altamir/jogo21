package com.classes;


//    JogoDeCartas que possui os métodos:
//      ordenar(), embaralhar(), darCartas(), listarBaralho().

public interface JogoDeCartas {
	public void ordenar(); 
	public void embaralhar();
	public Carta darCartas();
	public String listarBaralho();
	
}
