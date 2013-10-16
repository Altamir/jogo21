package com.test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import com.classes.Baralho;

public class TestBaralho {

	private Baralho baralho;

	@Before
	public void setUp() {
		baralho = new Baralho();
	}

	@Test
	public void testCriarBaralho() {
		assertEquals(baralho, baralho);
	}

	@Test
	public void tesPrimeiraCarta() {
		assertEquals("�s de Copas", baralho.getCarta(0).toString());
	}

	@Test
	public void testListaBarallho() {
		baralho.ordenar();
		assertEquals(StringEsperadas.listaDeCartasOrdenada(),
				baralho.listarBaralho());
	}

	@Test
	public void testaEmbaralhar() {
		baralho.embaralhar();
		assertNotEquals(StringEsperadas.listaDeCartasOrdenada(),
				baralho.listarBaralho());
	}
	
	@Test 
	public void testOrdenarBaralho(){
		baralho.embaralhar();
		baralho.ordenar();
		assertEquals(StringEsperadas.listaDeCartasOrdenada(), baralho.listarBaralho());
	}

}
