package javaestudos.aula3_estrutura_de_repeticao;

import java.util.Scanner;

public class ExercicioSomaWhile {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt();
		
		int soma = 0;
		while (x != 0){
			soma = soma + x; // ou soma += x;
			x = sc.nextInt();
		}
			
		System.out.println("A soma dos números digitados foi: " + soma);
		
	}
	

}
