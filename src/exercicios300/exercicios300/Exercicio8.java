package exercicios300;
import java.util.Scanner;
public class Exercicio8 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int idade;
		System.out.println("Informe a idade da pessoa: ");
		idade = ler.nextInt();
		
		if(idade < 16) 
				System.out.printf("\n Nao eleitor. \n");
			else if ((idade >= 18) && (idade <=65))
				System.out.printf("\n Eleitor obrigatorio. \n");
				else
					System.out.println("\n Eleitor Facultativo. \n");
			
	}

}
