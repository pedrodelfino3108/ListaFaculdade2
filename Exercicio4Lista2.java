package exercicios2;

import java.util.Scanner;

public class Exercicio4Lista2 {
	public static void main(String[]args) {
	Scanner scanner = new Scanner(System.in);
	
    System.out.print("Qual o custo de fábrica do carro: ");
    float custoFabrica = scanner.nextFloat();

    float percentualDistribuidor = 0.28f; // 28%
    float percentualImpostos = 0.45f; // 45%

    float custoDistribuidor = custoFabrica * percentualDistribuidor;
    float custoImpostos = custoFabrica * percentualImpostos;
    float custoFinal = custoFabrica + custoDistribuidor + custoImpostos;

    System.out.println("O custo final ao consumidor é: R$" + custoFinal);

    scanner.close();
	}
}