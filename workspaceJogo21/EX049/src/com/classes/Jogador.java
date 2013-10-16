package com.classes;

import java.util.ArrayList;

public class Jogador {

	private String nome;
	private Pontuacao pontuacao;
	private ArrayList<Carta> cartas;

	public Jogador(String nome) {
		this.nome = nome;
		this.pontuacao = new Pontuacao();
		this.cartas = new ArrayList<>();
	}

	public String getNome() {
		return nome;
	}

	public int getPontuacao() {	
		return pontuacao.getPontuacao();
	}
	
	private void setPontuaco(int valor){
		pontuacao.incremnetaEm(valor);
	}

	public void compraCarta(JogoDeCartas deck) {
		cartas.add(deck.darCartas());
		atualizaPontuacao();
	}

	private void atualizaPontuacao() {
		pontuacao.limpa();
		for (Carta carta : cartas) {
			setPontuaco(carta.getValor());
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
