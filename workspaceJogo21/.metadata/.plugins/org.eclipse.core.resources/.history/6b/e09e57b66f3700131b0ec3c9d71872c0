package tests;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import com.classes.Baralho;
import com.classes.Jogador;

public class testJogador {

	private Jogador apostador;
	private Jogador banca;
	private Baralho deck;
	
	@Before
	public void setUp(){
		apostador = new Jogador("Jogador");
		banca = new Jogador("Banca");
		deck = new Baralho();
	}

	@Test
	public void testCriarJogadores() {
		apostador = new Jogador("Jogador");
		banca = new Jogador("Banca");
		
		assertEquals("Jogador", apostador.getNome());
		assertEquals("Banca", banca.getNome());		
	}
	
	@Test
	public void testPontuaçãoInicialJogador() {
		assertEquals(0,apostador.getPontuacao());
	}
	
	@Test
	public void testPontuacaoJogadorvalor2(){
		apostador.compraCarta(deck);;
		apostador.compraCarta(deck);
		assertEquals(3, apostador.getPontuacao());
	}
	
	@Test
	public void testComprarCarta(){
		apostador.compraCarta(deck);
		assertEquals("Às de Copas\r\n", apostador.listarCartas());
	}

}
