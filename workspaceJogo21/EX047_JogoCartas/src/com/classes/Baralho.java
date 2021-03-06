package com.classes;

import java.util.ArrayList;
import java.util.Collections;

public class Baralho implements JogoDeCartas {

	private ArrayList<Carta> cartas;
	private int qtCartas = 0;
	private int topo = -1;

	public Baralho() {
		criarCartas();
	}

	public Carta getCarta(int numCarta) {
		return cartas.get(numCarta);
	}

	private void criarCartas() {
		cartas = new ArrayList<>();
		criaCartasDe(NAIPE.COPAS);
		criaCartasDe(NAIPE.ESPADAS);
		criaCartasDe(NAIPE.OURO);
		criaCartasDe(NAIPE.PAUS);
	}

	private void criaCartasDe(NAIPE naipe) {
		for (int valor = 1; valor < 14; valor++) {
			cartas.add(qtCartas, new Carta(valor, naipe));
			qtCartas++;
		}
	}

	@Override
	public void ordenar() {
		ArrayList<Carta> deCopas = new ArrayList<>();
		ArrayList<Carta> deEspadas = new ArrayList<>();
		ArrayList<Carta> deOuros = new ArrayList<>();
		ArrayList<Carta> dePaus = new ArrayList<>();

		separaPorNaipe(deCopas, deEspadas, deOuros, dePaus);

		ordenaDeck(dePaus);
		ordenaDeck(deOuros);
		ordenaDeck(deEspadas);
		ordenaDeck(deCopas);

		juntaCartasOrdenadas(deCopas, deEspadas, deOuros, dePaus);
	}

	private void juntaCartasOrdenadas(ArrayList<Carta> deCopas,
			ArrayList<Carta> deEspadas, ArrayList<Carta> deOuros,
			ArrayList<Carta> dePaus) {
		cartas.clear();
		cartas.addAll(deCopas);
		cartas.addAll(deEspadas);
		cartas.addAll(deOuros);
		cartas.addAll(dePaus);
	}

	private void separaPorNaipe(ArrayList<Carta> copas,
			ArrayList<Carta> espadas, ArrayList<Carta> ouros,
			ArrayList<Carta> paus) {
		for (Carta carta : cartas) {
			switch (carta.getNaipe()) {
			case COPAS:
				copas.add(carta);
				break;
			case ESPADAS:
				espadas.add(carta);
				break;
			case OURO:
				ouros.add(carta);
				break;
			case PAUS:
				paus.add(carta);
				break;
			default:
				break;
			}
		}
	}

	private void ordenaDeck(ArrayList<Carta> cartas) {
		Collections.sort(cartas);
	}

	@Override
	public void embaralhar() {
		desmarca_limpaTopo();
		Collections.shuffle(cartas);
	}

	@Override
	public Carta darCartas() {
		if (topo != qtCartas) {
			topo++;
			cartas.get(topo).usar();
			return cartas.get(topo);
		}
		return null;

	}

	@Override
	public String listarBaralho() {
		StringBuffer retorno = new StringBuffer();

		for (int i = 0; i < qtCartas; i++) {
			retorno.append(getCarta(i).toString());
			retorno.append("\r\n");
		}
		return retorno.toString();
	}

	private void desmarca_limpaTopo() {
		for (Carta carta : cartas) {
			carta.setUsada(false);
		}
		topo = -1;
	}

}
