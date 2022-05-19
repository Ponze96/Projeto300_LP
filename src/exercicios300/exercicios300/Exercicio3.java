package exercicios300;
import java.util.Scanner;
public class Exercicio3 {

	public static void main(String[] args) {
		int num, ultimo, meio, primeiro;
		Scanner ler = new Scanner(System.in);
		System.out.println("Digite um numero com 3 digitos");
		num = ler.nextInt();
		ultimo = num/100;
		System.out.println("ultimo");
		meio = (num % 100) / 10;
		System.out.println("meio");
		primeiro = (num%10)%10;
		System.out.println("primeiro");
		
		System.out.println(ultimo + " " + meio + " " + " " + primeiro);
	
		
	}

}
