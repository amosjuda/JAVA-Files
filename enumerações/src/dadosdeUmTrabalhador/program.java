package dadosdeUmTrabalhador;

import java.util.Locale;
import java.util.Scanner;

import entities.Department;
import entities.Worker;
import entities.enums.WorkerLevel;

public class program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter departament's name: ");
		String departmentName = sc.nextLine();
		
		System.out.println("Enter worker data:");
		System.out.print("Name: ");
		String workerName = sc.nextLine();
		System.out.print("Level: ");
		String workerLevel = sc.nextLine();
		System.out.print("Base salary: ");
		double baseSalary = sc.nextDouble();
		
		Worker worker = new Worker(workerName, WorkerLevel.valueOf(workerLevel), baseSalary, new Department(departmentName));
		
		System.out.print("How many contracts to this worker? ");
		int manyContracts = sc.nextInt();
		
		for(int i = 0; i < manyContracts; i++) {
			System.out.println("Enter contract #"+ i +" data:");
			System.out.print("Date (DD/MM/YYYY): ");
			
			System.out.print("Value per hour: ");
			
			System.out.print("Duration (hours): ");
		
		}
		System.out.println();
		
		System.out.print("Enter month and year to calculate income(MM/YYYY): ");
		
		System.out.println("Name: ",);
		System.out.println("Departament: ", );
		System.out.printf("Income for "+ +": %.2f",);
		
		
		sc.close();
	}
}
