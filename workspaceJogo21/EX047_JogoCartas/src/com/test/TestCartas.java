package com.test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import com.classes.Carta;
import com.classes.NAIPE;

public class TestCartas {

	private Carta carta;

	@Before
	public void setUp() {
		carta = new Carta(2, NAIPE.OURO);
	}

	@Test
	public void testRetornoToString() {
		assertEquals("2 de Ouro", carta.toString());
	}

	@Test
	public void testEstadoDaCartaNaoUsada() {
		assertFalse(carta.foiUsada());
	}
	
	@Test
	public void testEstadoDaCartaUsada() {
		carta.usar();
		assertTrue(carta.foiUsada());
	}

}
