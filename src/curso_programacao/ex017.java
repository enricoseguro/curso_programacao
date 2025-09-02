package curso_programacao;

import java.util.Scanner;

public class ex017 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int alcool = 0;
		int gasolina = 0;
		int diesel = 0;
		int fim;
		int resposta = sc.nextInt();
		
		while (resposta != 4) {
			if (resposta == 1) {
				alcool ++;
				resposta = sc.nextInt();
			} else if (resposta == 2) {
				gasolina ++;
				resposta = sc.nextInt();
			} else if (resposta == 3) {
				diesel ++;
				resposta = sc.nextInt();
			} else {
				System.out.println("Resposta inválida");
				resposta = sc.nextInt();
			}
			
		}
		System.out.println("Muito obrigado!");
		System.out.println("Alcool: " + alcool);
		System.out.println("Gasolina: " + gasolina);
		System.out.println("Diesel: " + diesel);
		
		sc.close();
		
	}

}
