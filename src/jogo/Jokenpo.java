package jogo;

import java.util.Random;
import java.util.Scanner;

public class Jokenpo {

	public static void main(String[] args) {
		
		int escolha, numeroSorteado;
		String opcaoDesejada, opcaoPC;
		
		Scanner leitor = new Scanner(System.in);
		
		Random sorteio = new Random();
		numeroSorteado = sorteio.nextInt(3) + 1;
		
		System.out.println("**J O K E N P O**");
		System.out.println();
		System.out.println("Escolha uma das opções abaixo:");
		System.out.println("1- Pedra");
		System.out.println("2- Papel");
		System.out.println("3- Tesoura");
		System.out.println();
		
		System.out.print("Digite o número da opção desejada: ");
		escolha = leitor.nextInt();
		leitor.close();
		System.out.println();
		
		if(escolha == 1) {
			opcaoDesejada = "Pedra";
			System.out.println("Você escolheu: " + opcaoDesejada);
		} else if(escolha == 2) {
			opcaoDesejada = "Papel";
			System.out.println("Você escolheu: " + opcaoDesejada);
		} else if(escolha == 3) {
			opcaoDesejada = "Tesoura";
			System.out.println("Você escolheu: " + opcaoDesejada);
		} else {
			System.out.println("Opção inválida.");
		}
		
		if(numeroSorteado == 1) {
			opcaoPC = "Pedra";
			System.out.println("O PC escolheu: " + opcaoPC);
		} else if(numeroSorteado == 2) {
			opcaoPC = "Papel";
			System.out.println("O PC escolheu: " + opcaoPC);
		} else {
			opcaoPC = "Tesoura";
			System.out.println("O PC escolheu: " + opcaoPC);
		} 
			
		
		if(escolha == numeroSorteado) {
			System.out.println("Empate! :|");
		} else if(escolha == 1 && numeroSorteado == 3 || escolha == 3 && numeroSorteado == 2 || escolha == 2 && numeroSorteado == 1) {
			System.out.println("Você ganhou! :)");
		} else if(escolha == 3 && numeroSorteado == 1 || escolha == 2 && numeroSorteado == 3 || escolha == 1 && numeroSorteado == 2) {
			System.out.println("Você perdeu! :(");
		} else {
			System.out.println("Tente novamente!");
		}
		
	}

}
