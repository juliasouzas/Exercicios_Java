package javaestudos.aula3_estrutura_de_repeticao;

import java.util.Scanner;

public class ExercicioFor1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner (System.in);
		
		int valor1;
		
		System.out.println("Digite um valor inteiro: ");
		valor1 = sc.nextInt();
		
		int i;
		for (i = 1; i < valor1; i++) { // para i menor que o valor digitado (condição), i vai crescer de um em um até o valor digitado. 
			if (i % 2 != 0) { // se o resto da divisão de i (que vai crescendo) for diferente de 0 (número ímpar) ele imprime na tela.
				System.out.println(i);
			}
			
			
		}

	}

}
