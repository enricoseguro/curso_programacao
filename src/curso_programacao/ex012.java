package curso_programacao;

import java.util.Scanner;

public class ex012 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int quant;
		int item;
		double total;
		
		System.out.println("Digite o código do item requirido e a quantidade.");
		item = sc.nextInt();
		quant = sc.nextInt();
		
		if (item == 1) {
			total = quant * 4;
			System.out.println("Total: " + total);
		} else if (item == 2) {
			total = quant * 4.50;
			System.out.println("Total: " + total);
		} else if (item == 3) {
			total = quant * 5;
			System.out.println("Total: " + total);
		} else if (item == 4) {
			total = quant * 2;
			System.out.println("Total: " + total);
		} else if (item == 5) {
			total = quant * 1.50;
			System.out.println("Total: " + total);
		} else {
			System.out.println("Item não consta no cardápio, tente novamente.");
		}
		
		sc.close();
	}

}
