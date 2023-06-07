package aplication.exercise;

import java.util.Locale;
import java.util.Scanner;
import util.exercise.price;

public class program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("What is the dollar price? ");
		double dollarValue = sc.nextDouble();
		
		System.out.print("How many dollars will be bought? ");
		double dollarPrice = sc.nextDouble();
		
		double result = price.currencyConverter(dollarValue, dollarPrice);
		System.out.printf("Amount to be paid in reais = %.2f%n", result);
		
		sc.close();
	}
}
