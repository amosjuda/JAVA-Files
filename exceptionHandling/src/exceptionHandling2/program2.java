package exceptionHandling2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class program2 {

	public static void main(String[] args) {
		File file = new File("C:\\temp\\in.txt");
		Scanner sc = null;
		
		try {
			sc = new Scanner(file);
			while (sc.hasNextLine()) {
				System.out.println(sc.nextLine());
			}
		}
		catch(FileNotFoundException e) {
			System.out.println("Error opening file: " + e.getMessage());
		}
		finally { // independent of command catch is used or no the command finally is executed
			if(sc != null) {
				sc.close();
			}
			System.out.println("Finally block executed");
		}
	}
}