package ioprogramming;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterDemo {

	public static void main(String[] args) {		

		FileWriter fw = null;
		BufferedWriter bw = null;
		
		String txt = "kdjfkd dfjdf dkfj fkdjfd kfjkd fkdfjd dkjfdfdfjdk fdkfjdf.";
		
		try {
			
			fw =new FileWriter("sample.txt");
			bw = new BufferedWriter(fw);
			
			bw.write(txt);
			
			System.out.println("done");
			
		} catch (IOException e) {			
			e.printStackTrace();
		}
		finally {
			try {
				bw.close();
				fw.close();
			} catch (IOException e) {				
				e.printStackTrace();
			}
			
		}
	}

}
