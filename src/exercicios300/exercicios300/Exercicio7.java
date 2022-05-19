package exercicios300;
import java.util.Scanner;
public class Exercicio7 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		double a, b, c;
		System.out.println("Digite a primeira medida");
		a = ler.nextDouble();
		System.out.println("Digite a segunda medida");
		b = ler.nextDouble();
		System.out.println("Digite a terceira medida");
		c = ler.nextDouble();
		
		if(a < (b + c ) && b < (a + c ) && c < (a + b)) {
			
		}
		
		else {
			System.out.println("As medidas nao formam um triangulo");
		}
	}

}
