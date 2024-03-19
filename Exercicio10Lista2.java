package exercicios2;

import java.util.Scanner;

public class Exercicio10Lista2 {
 public static void main(String[]args) {
	 Scanner scanner = new Scanner(System.in);
	 
	 System.out.print("Digite o valor para a variável A: ");
     String A = scanner.next();
     
     System.out.print("Digite o valor para a variável B: ");
     String B = scanner.next();
     
     String temp = A;
     A = B;
     B = temp;
     
     System.out.println("Valores trocados:");
     System.out.println("A: " + A);
     System.out.println("B: " + B);
     
     scanner.close();
 }
}
