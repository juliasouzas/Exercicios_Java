package javaestudos.aula3_estrutura_de_repeticao;

import java.util.Scanner;

public class ExercicioValorMetroQuadrado {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Valor da largura: ");
		double largura = sc.nextDouble();
		
		System.out.println("Valor do comprimento: ");
		double comprimento = sc.nextDouble();
		
		System.out.println("Valor do metro quadrado: ");
		double metroQuadrado = sc.nextDouble(); // valor do metro quadrado de um terreno
		
		
		double area = largura * comprimento; 
		double preco = area * metroQuadrado;
		
		System.out.printf("Area = %.2f%n", area);
		System.out.printf("Preço = %.2f%n", preco);
		
		
		
	}

}
