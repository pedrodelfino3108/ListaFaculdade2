package exercicios2;

import java.util.Scanner;

public class Exercicio7Lista2 {
	public static void main(String[]args) {
	Scanner scanner = new Scanner(System.in);
	
    double pi = Math.PI;
    
    System.out.print("Digite o raio da lata de óleo: ");
    double raio = scanner.nextDouble();
    
    System.out.print("Digite a altura da lata de óleo: ");
    double altura = scanner.nextDouble();	
    
    double volume = pi * raio * raio * altura;
    
    System.out.println("O volume da lata de óleo é: " + volume);

    scanner.close();
	
	}

}
