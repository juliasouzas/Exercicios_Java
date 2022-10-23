package javaestudos.aula3_estrutura_de_repeticao;

import java.util.Scanner;

public class ExercicioPlanoCartesiano {

	public static void main(String[] args) {
	
		int cordX, cordY;
		
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("Digite a cordenada X: ");
		cordX = sc.nextInt();
		
		System.out.println("Digite a cordenada Y: ");
		cordY = sc.nextInt();
		
		if (cordX == 0 || cordY == 0) {
			System.out.println("Valor inválido! Programa finalizado.");	
		} else {
			while ((cordX != 0 && cordY != 0)) {
				if (cordX > 0 && cordY > 0) {
					System.out.println("Primeiro quadrante!");
				} else if (cordX < 0 && cordY > 0) {
					System.out.println("Segundo quadrante!");
				} else if (cordX < 0 && cordY < 0) {
					System.out.println("Terceiro quadrante!");		
				} else if (cordX > 0 && cordY < 0) {
					System.out.println("Quarto quadrante!");
				}
		
				System.out.println();
				System.out.println("Digite 0 para finalizar sua aplicação ou digite qualquer outro número para continuar!");
				cordX = sc.nextInt();
				if (cordX == 0) {
					System.out.println("Programa finalizado!");
				} else {
					System.out.println("Digite a cordenada X: ");
					cordX = sc.nextInt();
					System.out.println("Digite a cordenada Y: ");
					cordY = sc.nextInt();
				}
				
			}	
			
		}
		
		
		
				
	}

}
