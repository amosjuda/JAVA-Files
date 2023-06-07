package exercise2;

import java.util.Locale;
import java.util.Scanner;

import exercise2entities.entities2;

public class program2 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		entities2 product = new entities2();
		
		System.out.print("Name: ");
		product.name = sc.nextLine();
		
		System.out.print("Gross salary: ");
		product.grossSalary = sc.nextDouble();
		
		System.out.print("Tax: ");
		product.tax = sc.nextDouble();
		
		System.out.println();
		System.out.print("Employee: " + product);
		
		System.out.println();
		System.out.print("Which percentage to increase salary? ");
		double percentage = sc.nextDouble();
		product.increaseSalary(percentage);
		
		System.out.println();
		System.out.print("Update data: " +  product);
		
		sc.close();
	}
}
