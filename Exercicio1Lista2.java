package exercicios2;

import java.util.Scanner;

public class Exercicio1Lista2 {
	public static void main (String[]args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Qual a quantidade de anos");
		int anos = scanner.nextInt();
		
		System.out.println("Qual a quantidade de meses");
		int meses = scanner.nextInt();
		
		System.out.println("Qual a quantidade de dias");
		int dias = scanner.nextInt();
		
		int idade = anos * 365 + meses * 30 + dias;	
		
		System.out.println("A idade da pessoa é: "+ idade);
		
		
		scanner.close();
		}
}
