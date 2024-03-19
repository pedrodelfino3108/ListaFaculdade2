package exercicios2;

import java.util.Scanner;

public class Exercicio9Lista2 {
	public static void main (String[]args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite o valor da prestação: ");
        float valor = scanner.nextFloat();
        
        System.out.print("Digite a taxa de juros (%): ");
        float taxa = scanner.nextFloat();
        
        System.out.print("Digite o tempo em atraso da prestação (em meses): ");
        float tempo = scanner.nextFloat();
        
        float prestacao = valor + (valor * taxa / 100) * tempo;
        
        System.out.println("O valor da prestação em atraso é: " + prestacao);

        scanner.close();
	}
}
