package com.test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import com.classes.Baralho;
import com.classes.Partida;
import com.test.StringEsperadas;

public class TestJogo {

	private Partida pr;

	@Before
	public void setUp() {
		pr = new Partida("apostador");
	}

	@Test
	public void testVerificaSePartidaListaBaralhoOrdenado() {
		assertEquals("N�o Listou Cartas Ordenadas",
				StringEsperadas.listaDeCartasOrdenada(), pr.listarBaralho());
	}

	@Test
	public void testPartidaApostadorComprandoAte21() {
		pr.iniciaPartida();
		while (pr.getPontuacaoApostador() < 21) {
			pr.jogadaApostador();
		}		
		assertEquals(msgErro_JogadorEstourou(), 21, pr.getPontuacaoApostador());
	}

	private String msgErro_JogadorEstourou() {
		StringBuilder msgErro= new StringBuilder();
		msgErro.append("\r\nCartas do Jogador:\r\n");
		msgErro.append(pr.listaCartasApostador());
		msgErro.append("Jogador Estorou,");
		return msgErro.toString();
	}

}
