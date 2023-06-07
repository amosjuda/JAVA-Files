package aprovados;

import java.util.Locale;
import java.util.Scanner;

public class system {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		double media = 0;
		
		System.out.print("How many students will be typed? ");
		int n = sc.nextInt();
		
		String[] name = new String[n];
		double[] firstNote = new double[n];
		double[] secondNote = new double[n];
		
		for (int i=0; i < n; i++) {
			System.out.println("Enter name, first and second note the " + (i + 1) + "º student: ");
			name[i] = sc.nextLine();
			sc.nextLine();
			firstNote[i] = sc.nextDouble();
			secondNote[i] = sc.nextDouble();
		}
		
		System.out.println("Students approved:");
		
		for (int i=0; i < n; i++) {
			media = (firstNote[i] + secondNote[i])/2;
			if(media >= 6.0) {
				System.out.printf("%s\n", name[i]);
			}
		}
		sc.close();
	}

}
