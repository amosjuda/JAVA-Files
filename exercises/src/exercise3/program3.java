package exercise3;

import java.util.Locale;
import java.util.Scanner;

import exercise3entities.entities3;

public class program3 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		entities3 product = new entities3();
		
		System.out.println("Insert your name-");
		product.name = sc.nextLine();
		
		System.out.println("Enter your 3 notes-");
		product.t1 = sc.nextDouble();
		product.t2 = sc.nextDouble();
		product.t3 = sc.nextDouble();
		
		System.out.printf("FINAL GRADE: %.2f%n", product.finalGrade());
		
		if(product.finalGrade() < 60.00) {
			System.out.println("FAILED");
			System.out.printf("MISSING %.2f POINTS%n", product.missingPoints());
		} else {
			System.out.println("PASS");
		}
		sc.close();
	}
}
