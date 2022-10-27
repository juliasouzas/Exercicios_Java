package javaestudos.aula3_estrutura_de_repeticao;

import java.util.Scanner;

public class ExercicioAcesso {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int senha = 123456;
		
		System.out.println("Digite sua senha: ");
		senha = sc.nextInt();
		
		while (senha != 2022) {
			System.out.println("Senha inválida! Acesso negado!");
			System.out.println("Digite sua senha novamente: ");
			senha = sc.nextInt();
		}
		
		System.out.println("Acesso liberado!");
		
		

	}

}
