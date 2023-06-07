package matrizesApplicattion;

import java.util.Locale;
import java.util.Scanner;

public class program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int Nnumbers = 0;
		
		int n = sc.nextInt();
		int[][] mat = new int[n][n];// criando uma matriz
		
		for(int i = 0; i<n; i++) {
			for(int j = 0; j<n; j++) {
				mat[i][j] = sc.nextInt();
			}
		}
		
		System.out.println("Main diagonal: ");
		for(int i = 0; i<n; i++) {
			for(int j = 0; j<n; j++) {
				if(mat[i] == mat[j]) {
					System.out.print(mat[i][j]);
				}
				if(mat[i][j] < 0) {
					Nnumbers++;
				}
			}
		}
		System.out.println("Negative numbers = " + Nnumbers);	
		
		
		
		sc.close();
	}
}
