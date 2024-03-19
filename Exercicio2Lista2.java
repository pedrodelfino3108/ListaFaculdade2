package exercicios2;

import java.util.Scanner;

public class Exercicio2Lista2 {
	public static void main(String[]args) {
	Scanner scanner = new Scanner(System.in);
	
    System.out.print("Qual o número total de eleitores: ");
    int totalEleitores = scanner.nextInt();
    
    System.out.print("Qual o número de votos brancos: ");
    int brancos = scanner.nextInt();
    
    System.out.print("Qual o número de votos nulos: ");
    int nulos = scanner.nextInt();
    
    System.out.print("Qual o número de votos válidos: ");
    int validos = scanner.nextInt();
    
    float percentualBrancos = (float) brancos / totalEleitores * 100;
    
    float percentualNulos = (float) nulos / totalEleitores * 100;
    
    float percentualValidos = (float) validos / totalEleitores * 100;
    
    System.out.println("Percentual de votos brancos: " + percentualBrancos + "%");
    System.out.println("Percentual de votos nulos: " + percentualNulos + "%");
    System.out.println("Percentual de votos válidos: " + percentualValidos + "%");
    
    scanner.close();
	}
}
