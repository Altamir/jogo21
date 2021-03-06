package com.classes.jogo;

import java.util.Scanner;

import com.classes.Partida;

public class Game {

	private static Partida partida;
	private static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {		
		jogar();
	}


	private static void jogar() {
		while (quiserJogar()) {
			criaPartida();
			boasVindas();
			iniciaPartida();
			jogadaApostador();
			jogadaBanca();
		}
	}


	private static boolean quiserJogar() {		
		System.out.println("Quer jogar? S/n");
		String resp = scn.nextLine();
		return resp.equals("S");
	}


	private static void iniciaPartida() {
		partida.iniciaPartida();
	}

	private static void jogadaBanca() {
		
		if (partida.getPontuacaoApostador() <= 21) {
			partida.jogadaBanca();
			imprimeDadosBanca();
			while (bancaDeveJogar()) {
				partida.jogadaBanca();
				imprimeDadosBanca();				
			}
			imprimeResultadoFinal();
		} 
		
	}


	private static void imprimeResultadoFinal() {
		System.out.println("-----------------------------------------------------------------------------");
		System.out.println("---------                  Resultado Final                    ---------------");
		System.out.println("-----------------------------------------------------------------------------");
		System.out.println("-        Apostador                             Banca                        -");
		System.out.println("-           "+partida.getPontuacaoApostador()+"                                   "
		+partida.getPontuacaoBanca() +"                         -");
		System.out.println("-----------------------------------------------------------------------------");
	}


	private static boolean bancaDeveJogar() {
		return (partida.getPontuacaoBanca() < 22) && (partida.getPontuacaoBanca() < partida.getPontuacaoApostador());
	}

	private static void imprimeDadosBanca() {
		System.out.println("A pontua��o da Banca: "
				+ partida.getPontuacaoBanca());
		System.out.println("Cartas da Banca: ");
		System.out.println(partida.listaCartasBanca());	
	}


	private static void jogadaApostador() {
		String resp = "S";

		partida.jogadaApostador();

		while (resp.equals("S") && partida.getPontuacaoApostador() <= 21) {
			imprimeDadosApostador();
			System.out.println("Gostaria de comprar uma carta? S/n ");
			resp = scn.nextLine();
			if (resp.equals("S")) {
				partida.jogadaApostador();
			}
		}
		imprimeDadosApostador();
		if (partida.getPontuacaoApostador() > 21) {
			System.out.println("......Voce Estorou.......");
			System.out.println(".....A Banca Ganhou.......");
		}
	}

	private static void imprimeDadosApostador() {
		System.out.println(partida.getNomeApostador() + " sua pontua��o:"
				+ partida.getPontuacaoApostador());
		System.out.println("Suas cartas:");
		System.out.println(partida.listaCartasApostador());
	}

	private static void criaPartida() {
		partida = new Partida(criaApostador());
	}


	private static void boasVindas() {
		if (!partida.getNomeApostador().equals("")) {
			System.out.println("Ola " + partida.getNomeApostador()
					+ " Bem vindo ao Jogo de 21.\r\n");
			System.out.println(partida.getNomeApostador() + " Vamos come�ar!");

		} else {
			while (partida.getNomeApostador().equals("") || partida.getNomeApostador().equals(null) ) {
				System.out.println("Jogador n�o foi criado com sucesso.....");
				criaPartida();
			}
			boasVindas();
		}
	}

	private static String criaApostador() {
		System.out.println("Digite seu nome: ");		 
		return scn.nextLine();
	}

}
