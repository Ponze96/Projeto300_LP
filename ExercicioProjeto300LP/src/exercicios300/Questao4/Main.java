package Questao4;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		int segundos;
		double resto, minutos, segundosCalc;
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Digite o valor em segundos");
		segundos = ler.nextInt();
		
		resto = segundos % 3600;
		minutos = resto / 60;
		segundosCalc = resto % 60;
		System.out.println(segundos / 3600 + " : " + minutos + " : " + segundos);
		
		
	}

}
