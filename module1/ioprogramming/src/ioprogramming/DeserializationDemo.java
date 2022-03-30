package ioprogramming;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class DeserializationDemo {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
	
		FileInputStream fis = new FileInputStream("student.ser");
		ObjectInputStream ois = new ObjectInputStream(fis);
		
		Student st = (Student) ois.readObject();
		
		System.out.println("Student Id: "+st.getStudentId());
		System.out.println("Student Name: "+st.getStudentName());
		
		ois.close();
		fis.close();
	}

}
