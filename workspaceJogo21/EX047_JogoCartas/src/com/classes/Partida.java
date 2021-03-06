package com.classes;

import com.classes.Baralho;
import com.classes.JogoDeCartas;

public class Partida {

	private Jogador apostador;
	private JogoDeCartas baralho;
	private Jogador banca;

	public Partida(String apostador) {
		this.apostador = new Jogador(apostador);
		this.banca = new Jogador("Banca");
		this.baralho = new Baralho();
	}

	public void iniciaPartida() {
		baralho.embaralhar();	
	}

	public void jogadaApostador() {
		apostador.compraCarta(baralho);
	}
	
	public void jogadaBanca() {
		banca.compraCarta(baralho);
	}
	
	public int getPontuacaoApostador(){
		return apostador.getPontuacao();		
	}
	
	public int getPontuacaoBanca() {
		return banca.getPontuacao();
	}
	
	public String listaCartasApostador() {
		return apostador.listarCartas();
	}
	
	public String listaCartasBanca() {
		return banca.listarCartas();
	}

	public String listarBaralho() {
		return baralho.listarBaralho();
	}
	
	public String getNomeApostador(){
		return apostador.getNome();
	}

}
