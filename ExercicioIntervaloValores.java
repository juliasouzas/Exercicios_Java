package javaestudos.aula3_estrutura_de_repeticao;

import java.util.Scanner;

public class ExercicioIntervaloValores {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite a quantide: ");
		int valor1 = sc.nextInt();
		
		int i, x = 0, in = 0, out = 0;
		for(i = 0; i < valor1; i++) {
			x = sc.nextInt();
			if (x >= 10 && x <= 20) {
				in = in + 1;
			} else {
				out = out + 1;
			}
		}
		
		System.out.println(in + " in");
		System.out.println(out + " out");
	}

}
