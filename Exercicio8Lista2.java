package exercicios2;

import java.util.Scanner;

public class Exercicio8Lista2 {
	public static void main (String[]args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Qual o tempo gasto na viagem em horas: ");
        float tempo = scanner.nextFloat();
        
        System.out.print("Qual a velocidade média durante a viagem em km/h: ");
        float velocidadeMedia = scanner.nextFloat();
        
        float distancia = tempo * velocidadeMedia;
        
        float combustivel = distancia / 12;
        
        System.out.println("Velocidade média: " + velocidadeMedia + " km/h");
        System.out.println("Tempo gasto na viagem: " + tempo + " horas");
        System.out.println("Distância percorrida: " + distancia + " km");
        System.out.println("Quantidade de litros de combustível gasta: " + combustivel);
        
        scanner.close();
	}
}
