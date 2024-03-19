package exercicios2;

import java.util.Scanner;

public class Exercicio3Lista2 {
	public static void main(String[]args) {
	Scanner scanner = new Scanner(System.in);
	
    System.out.print("Digite o salário mensal atual do funcionário: ");
    float salarioAtual = scanner.nextInt();


    System.out.print("Digite o percentual de reajuste (%): ");
    float percentualReajuste = scanner.nextInt();


    float valorReajuste = salarioAtual * (percentualReajuste / 100);


    float novoSalario = salarioAtual + valorReajuste;


    System.out.println("O novo salário do funcionário é: R$" + novoSalario);

    scanner.close();
	}
}