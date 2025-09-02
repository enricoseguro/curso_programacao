package curso_programacao;

import java.util.Scanner;
import java.lang.Math;

public class ex024 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		for (int i = 1; i <= n; i++) {
			
			double quadrado = Math.pow(i, 2);
			double cubo = Math.pow(i, 3);
			
			System.out.println(i + " " + Math.round(quadrado) + " " + Math.round(cubo));
		}
		
		sc.close();
	}
}
