package sessao10.MemoriaArraysListas;

import java.util.Scanner;

public class Matrizes {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
				
		int n = sc.nextInt();
		int[][] matriz = new int[n][n];
		
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				matriz[i][j] = sc.nextInt();
			}
		}

		System.out.println("Main diagonal: ");
		for(int i = 0; i< matriz.length;i++ ) {
			System.out.print(matriz[i][i] + " ");
		}
		System.out.println();
		
		
		int count = 0;
		for(int i = 0; i < matriz.length; i++) {
			for(int j =0; j < matriz[i].length; j++) {
				if (matriz[i][j] < 0) {
					count++;
				}
			}
		}
		
		System.out.println("Negative numbers = " + count);
		
		sc.close();
	}

}
