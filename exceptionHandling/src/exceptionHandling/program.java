package exceptionHandling;

import java.util.InputMismatchException;
import java.util.Scanner;

public class program {

	public static void main(String[] args) {
		
		method1();
		
		System.out.println("End of program");
		
	}
	public static void method1() {
		System.out.println("***METHOD1 START***");
		method2();
		System.out.println("***METHOD1 END***");
	}
	public static void method2() {
		System.out.println("***METHOD2 START***");
		Scanner sc = new Scanner(System.in);
		try {
			String[] vect = sc.nextLine().split(" "); // .split("") -> read data from a vector separating them by a space on the same Line
			int position = sc.nextInt();
			System.out.println(vect[position]);
			} 
		catch(ArrayIndexOutOfBoundsException e) {
				System.out.println("Invalid position!");
				e.printStackTrace(); // serves to show all the method calls that resulted in that exception
				sc.next();
			} 
		catch (InputMismatchException e) {
				System.out.println("Input error");
			}
		sc.close();
		System.out.println("***METHOD2 END***");
	}
}
