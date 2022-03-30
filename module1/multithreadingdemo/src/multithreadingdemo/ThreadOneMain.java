package multithreadingdemo;

public class ThreadOneMain {

	public static void main(String[] args) {
		
		System.out.println("Main starts...");
		
		ThreadOne threadOne = new ThreadOne();
		threadOne.setName("TOne");
		threadOne.start(); // indirectly calls run() method		
		
		for(int i=51;i<=100;i++) {
			System.out.println(Thread.currentThread().getName()+" : "+i);
		}
		
		System.out.println("Main ends...");
	}

}

