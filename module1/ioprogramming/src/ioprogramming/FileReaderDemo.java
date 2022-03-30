package ioprogramming;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderDemo {

	public static void main(String[] args) {
		
		FileReader  fr= null;
		BufferedReader  br= null;
		
		try {
			fr = new FileReader("sample.txt");
			br = new BufferedReader(fr);
			
			String st = "";
			
			while((st = br.readLine()) != null) {
				System.out.println(st);
			}
			
		}
		catch(IOException e) {
			
		}
		finally {
			try {
				fr.close();
				br.close();
			} catch (IOException e) {				
				e.printStackTrace();
			}
			
		}

	}

}
