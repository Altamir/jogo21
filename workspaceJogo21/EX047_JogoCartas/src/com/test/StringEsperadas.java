package com.test;

import com.classes.NAIPE;

public class StringEsperadas {
	
	public static String listaDeCartasOrdenada() {
		return lista().toString();
		
	}
	
	private static StringBuffer lista() {
		StringBuffer esperado = new StringBuffer();
		esperado.append(stringPara(NAIPE.COPAS));
		esperado.append(stringPara(NAIPE.ESPADAS));
		esperado.append(stringPara(NAIPE.OURO));
		esperado.append(stringPara(NAIPE.PAUS));
		return esperado;
	}

	private static String stringPara(NAIPE naipe) {
		StringBuffer esperado = new StringBuffer();

		esperado.append("�s de " + naipe.toString() + "\r\n");
		for (int i = 2; i < 11; i++) {
			esperado.append(i + " de " + naipe.toString() + "\r\n");
		}
		esperado.append("Valete de " + naipe.toString() + "\r\n");
		esperado.append("Dama de " + naipe.toString() + "\r\n");
		esperado.append("Rei de " + naipe.toString() + "\r\n");
		return esperado.toString();
	}

}
