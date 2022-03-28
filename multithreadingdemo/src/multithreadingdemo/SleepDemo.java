package multithreadingdemo;

public class SleepDemo {

	public static void main(String[] args) {
		
		System.out.println("Main starts...");
		
		for(int i=1;i<=10;i++) {			
			System.out.println(i+" ");
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {				
				e.printStackTrace();
			}
		}		
		
		System.out.println("Main ends...");

	}

}
