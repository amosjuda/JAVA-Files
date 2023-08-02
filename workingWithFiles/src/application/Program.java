package application;

import java.io.File;
import java.util.Scanner;

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
//	public static void main(String[] args) {
//		String[] lines = new String[] {"Good morning","Good afternoon","Good night"};
//		
//		String path = "c:\\temp\\out.txt";
//		try(BufferedWriter bw = new BufferedWriter(new FileWriter(path, true))){
//			// this 'true' means you don't want recreate the file
//			for(String line : lines) {
//				bw.write(line);
//				bw.newLine();
//			}
//		} catch (IOException e){
//			e.printStackTrace();
//		}
//	}
// 5° class
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		
//		System.out.println("Enter a folder path: ");
//		String strPath = sc.nextLine();
//		
//		File path = new File(strPath);
//		
//		File[] folders = path.listFiles(File::isDirectory);
//		System.out.println("FOLDERS: ");
//		for(File folder : folders) {
//			System.out.println(folder);
//		}
//		
//		File[] files = path.listFiles(File::isFile);
//		System.out.println("FILES: ");
//		for(File file : files) {
//			System.out.println(file);
//		}
//		
//		boolean success = new File(strPath + "\\subdir").mkdir();
//		System.out.println("Directory created successfully: " + success);
//		sc.close();
//	}
// 6° class
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a file path: ");
		String strPath = sc.nextLine();
		
		File path = new File(strPath);
		
		System.out.println("getName: " + path.getName());
		System.out.println("getParent: " + path.getParent());
		System.out.println("getPath: " + path.getPath());
	}
}
