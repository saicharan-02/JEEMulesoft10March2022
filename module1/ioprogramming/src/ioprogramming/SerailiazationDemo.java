package ioprogramming;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SerailiazationDemo {

	public static void main(String[] args) throws IOException {
		
		Student student = new Student(10,"Krishna");
		
		FileOutputStream fos = new FileOutputStream("student.ser");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		
		oos.writeObject(student);
		System.out.println("student is saved onto the file");
		
		oos.close();
		fos.close();
		
		

	}

}
