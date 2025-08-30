package curso_programacao;

import java.util.Scanner;

public class ex02 {

	public static void main(String[] args) {

		/*Faça um programa para ler dois valores inteiros, e depois mostrar na tela a soma desses números com uma 
mensagem explicativa, conforme exemplos. */
		
		int n1, n2, tot;
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o primeiro número: ");
		n1 = sc.nextInt();
		System.out.println("Digite o segundo número: ");
		n2 = sc.nextInt();
		tot = n1 + n2;
		System.out.printf("A soma de %d + %d = %d.", n1, n2, tot);
		
	}

}
