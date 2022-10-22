package javaestudos.aula3_estrutura_de_repeticao;

import java.util.Scanner;

public class ExericioFor3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite um valor: ");
		int valor1 = sc.nextInt();
		
		int i;
		double div = 0, x, y;
		
		for (i = 0; i < valor1; i++) {
			x = sc.nextInt();
			y = sc.nextInt();
			if (y == 0) {
				System.out.println("Divisão Impossível");
			} else {
				div = x / y;
				System.out.printf("%.1f%n", div);
			}
				
			
		}
		
		
	
		
		
	}

}
