package com.classes;

import java.util.ArrayList;

public class Jogador {

	private String nome;
	private int pontuacao;
	private ArrayList<Carta> cartas;

	public Jogador(String nome) {
		this.nome = nome;
		this.pontuacao = 0;
		this.cartas = new ArrayList<>();
	}

	public String getNome() {
		return nome;
	}

	public int getPontuacao() {	
		return pontuacao;
	}
	
	
	public void compraCarta(JogoDeCartas deck) {
		cartas.add(deck.darCartas());
		atualizaPontuacao();
	}

	private void atualizaPontuacao() {
		pontuacao = 0;
		for (Carta carta : cartas) {
			pontuacao += carta.getValor();
		}		
	}

	public String listarCartas() {
		StringBuffer retorno = new StringBuffer();

		for (Carta carta : cartas) {
			retorno.append(carta.toString());
			retorno.append("\r\n");
		}		
		return retorno.toString();
	}

}
