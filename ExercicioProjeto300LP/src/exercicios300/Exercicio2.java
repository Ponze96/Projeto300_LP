package exercicios300;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		
		String [] meses = new String[12];
		int mes;
		meses[0] = "Janeiro";
		meses[1] = "Fevereiro";
		meses[2] = "Marco";
		meses[3] = "Abril";
		meses[4] = "Maio";
		meses[5] = "Junho";
		meses[6] = "Julho";
		meses[7] = "Agosto";
		meses[8] = "Setembro";
		meses[9] = "Outubro";
		meses[10] = "Novembro";
		meses[11] = "Dezembro";
		
		Scanner ler = new Scanner(System.in);
		System.out.println("Digite o numero correspondente ao mes : ");
		mes = ler.nextInt();
		System.out.println("O mês é: " + meses(mes-1));
	}

}
