package exercicios300;
import java.util.Scanner;
public class Exercicio1 {
	

	public static void main(String[] args) {
			
		float[] notas = new float[10];
		float soma=0;
		Scanner ler = new Scanner(System.in);
		for(int i=0; i<10; i++)
		{
			System.out.println("Digite a nota" + (+1));
			notas[i] = ler.nextFloat();
			soma=soma+notas[i];
			// existe outra forma de fazer a soma que seria soma+=notas[i];
						
		}
		// não é necessario criar a variavel float basta colocar soma/10;
		float media=soma/10;
		System.out.printf("O valor da media é %.2f", media);
		
	}

}
