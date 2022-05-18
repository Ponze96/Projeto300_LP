package exercicios300;
import java.util.Scanner;
public class Exercicio10 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Digite o ano : ");
		int ano = 0;

		
		if(((ano % 4 == 0) && (ano % 100 != 0)) || (ano % 400 == 0))
			System.out.println("O ano é ano bissexto.");
			else 				
				System.out.println(" NAO é ano bissexto. ");
	}

}
