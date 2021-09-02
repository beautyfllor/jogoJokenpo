package jogo;

import java.util.Random;
import java.util.Scanner;

public class Jokenpo {

	public static void main(String[] args) {
		
		int escolha, numeroSorteado;
		String opçãoDesejada, opçãoPC;
		
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
			opçãoDesejada = "Pedra";
			System.out.println("Você escolheu: " + opçãoDesejada);
		} else if(escolha == 2) {
			opçãoDesejada = "Papel";
			System.out.println("Você escolheu: " + opçãoDesejada);
		} else if(escolha == 3) {
			opçãoDesejada = "Tesoura";
			System.out.println("Você escolheu: " + opçãoDesejada);
		} else {
			System.out.println("Opção inválida.");
		}
		
		if(numeroSorteado == 1) {
			opçãoPC = "Pedra";
			System.out.println("O PC escolheu: " + opçãoPC);
		} else if(numeroSorteado == 2) {
			opçãoPC = "Papel";
			System.out.println("O PC escolheu: " + opçãoPC);
		} else {
			opçãoPC = "Tesoura";
			System.out.println("O PC escolheu: " + opçãoPC);
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
