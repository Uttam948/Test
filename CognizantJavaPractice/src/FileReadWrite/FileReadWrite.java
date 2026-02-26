package FileReadWrite;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;


public class FileReadWrite {

	public static void main(String[] args) throws IOException  {
		// TODO Auto-generated method stub
		
		String pathEmp = "C:\\Users\\asus\\Desktop\\JavaPractice\\CognizantJavaPractice\\src\\FileReadWrite\\employee.txt";
		
		try {
			BufferedReader reader = new BufferedReader(new FileReader(pathEmp));
			String Line = null;
			while((Line = reader.readLine()) != null) {
				
				
			}
			
		} catch (FileNotFoundException e) {
			System.out.println("file not found" + e);
			
			e.printStackTrace();
		}
			String pathDepart = "C:\\Users\\asus\\Desktop\\JavaPractice\\CognizantJavaPractice\\src\\FileReadWrite\\department.txt";
			

			try {
				BufferedReader reader = new BufferedReader(new FileReader(pathDepart));
				String Line = null;
				while((Line = reader.readLine()) != null) {
					System.out.println(Line);
				}
				
			} catch (FileNotFoundException e) {
				System.out.println("file not found" + e);
				
				e.printStackTrace();
			}
		}
	}


