package multithreadingdemo;

public class RunnableDemo {

	public static void main(String[] args) {
		
	System.out.println("Main starts...");
		
		MyThread mt = new MyThread();
		
		Thread t1 = new Thread(mt);
		
		t1.start();
		
		for(int i=51;i<=100;i++) {
			System.out.println(i+" ");
		}
		
		System.out.println("Main ends...");

	}

}

