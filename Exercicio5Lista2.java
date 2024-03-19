package exercicios2;

import java.util.Scanner;

public class Exercicio5Lista2 {
	public static void main (String[]args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite a temperatura em graus Celsius: ");
        float celsius = scanner.nextInt();
        		
        float fahrenheit = (9 * celsius + 160) / 5;
        
        System.out.println("A temperatura em graus Fahrenheit é: " + fahrenheit);

        scanner.close();
       
	} 
}
