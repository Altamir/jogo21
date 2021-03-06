package com.classes;

public class Carta implements Comparable<Carta> {

	private int valor;
	private NAIPE naipe;
	private boolean usada;

	public Carta(int valor, NAIPE naipe) {
		this.valor = valor;
		this.naipe = naipe;
		this.usada = false;
	}

	public boolean foiUsada() {		
		return usada;
	}

	public void usar() {
		this.usada = true;
	}
	protected void setUsada(boolean estado) {
		this.usada = estado;
	}

	@Override
	public String toString() {
		return valorToString() + " de " + naipe.toString();
	}

	private String valorToString() {
		return geraStringDoValor();
	}

	private String geraStringDoValor() {
		String valorTemp = null;
		if (valor > 1 && valor < 11) {
			valorTemp = String.valueOf(valor);
		} else {
			valorTemp = escolheNomeEntreAsValeteDamaRei(valorTemp);
		}
		return valorTemp;
	}

	private String escolheNomeEntreAsValeteDamaRei(String valorTemp) {
		switch (valor) {
		case 1:
			valorTemp = "�s";
			break;
		case 11:
			valorTemp = "Valete";
			break;
		case 12:
			valorTemp = "Dama";
			break;
		case 13:
			valorTemp = "Rei";
			break;
		}
		return valorTemp;
	}

	public NAIPE getNaipe() {
		return naipe;
	}

	public int getValor() {
		int valorRetorno;
		switch (valor) {
		case 11:
			valorRetorno = 10;
			break;
		case 12:
			valorRetorno = 10;
			break;
		case 13:
			valorRetorno = 10;
			break;
		default:
			valorRetorno = valor;
			break;

		}
		return valorRetorno;
	}

	@Override
	public int compareTo(Carta outraCarta) {
		if (this.valor < outraCarta.valor) {
			return -1;
		}
		if (this.valor > outraCarta.valor) {
			return 1;
		}
		return 0;
	}

}
