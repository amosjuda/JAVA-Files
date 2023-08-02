package application;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

//import java.io.BufferedReader;
//import java.io.FileReader;
//import java.io.IOException;

//import java.io.File;
//import java.io.IOException;
//import java.util.Scanner;

public class Program {
// 1° class
//	public static void main(String[] args) {
//		// to read the content inside the file
//		File file= new File("c:\\temp\\in.txt");
//		Scanner sc = null;
//		
//		try {
//			sc = new Scanner(file);
//			while(sc.hasNextLine()) {
//				System.out.println(sc.nextLine());
//			}
//		} catch(IOException e) {
//			System.out.println("Error: " + e.getMessage());
//		} finally {
//			if(sc != null) {
//				sc.close();
//			}
//		}
//	}
// 2° class	
//	public static void main(String[] args) {
//		String path = "c:\\temp\\in.txt";
//		FileReader fr = null;
//		BufferedReader br = null;
//		
//		try {
//			fr = new FileReader(path);
//			br = new BufferedReader(fr);
//			
//			String line = br.readLine();
//			
//			while(line != null) {
//				System.out.println(line);
//				line = br.readLine();
//			}
//		} catch(IOException e) {
//			System.out.println("Error: " + e.getMessage());
//		} finally {
//			try {
//				if(br != null) {
//					br.close();
//				}
//				if(fr != null) {
//					fr.close();
//				}
//			}
//			catch(IOException e) {
//				e.printStackTrace();
//			}
//		}
//	}
// 3° class
//	public static void main(String[] args) {
//		String path = "c:\\temp\\in.txt";
//		
//		try(BufferedReader br = new BufferedReader(new FileReader(path))){
//			String line = br.readLine();
//			
//			while(line != null) {
//				System.out.println(line);
//				line = br.readLine();
//			}
//		} catch(IOException e) {
//			System.out.println("Error: " + e.getMessage());
//		} 
//	}
// 4° class
	public static void main(String[] args) {
		String[] lines = new String[] {"Good morning","Good afternoon","Good night"};
		
		String path = "c:\\temp\\out.txt";
		try(BufferedWriter bw = new BufferedWriter(new FileWriter(path, true))){
			// this 'true' means you don't want recreate the file
			for(String line : lines) {
				bw.write(line);
				bw.newLine();
			}
		} catch (IOException e){
			e.printStackTrace();
		}
	}
}
