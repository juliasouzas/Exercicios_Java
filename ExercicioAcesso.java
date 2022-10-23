package javaestudos.aula3_estrutura_de_repeticao;

import java.util.Scanner;

public class ExercicioAcesso {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite sua senha: ");
		int senha = sc.nextInt();
		
		while (senha != 2002) {
			System.out.println("Senha inválida! Acesso negado!");
			System.out.println("Digite sua senha: ");
			senha = sc.nextInt();
		}
		
		System.out.println("Acesso liberado!");
		
		

	}

}
