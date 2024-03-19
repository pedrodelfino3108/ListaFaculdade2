package exercicios2;

import java.util.Scanner;

public class Exercicio6Lista2 {
	public static void main (String[]args) {
		Scanner scanner = new Scanner (System.in);
		
        System.out.print("Digite a temperatura em graus Fahrenheit: ");
        float fahrenheit = scanner.nextInt();
        
        float celsius = (fahrenheit - 32) * (5.0f / 9.0f);
        
        System.out.println("A temperatura em graus Celsius é: " + celsius);

        scanner.close();
	}
}
