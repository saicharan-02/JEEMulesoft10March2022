package multithreadingdemo;

public class JoinDemo {

	public static void main(String[] args) {
		
		System.out.println("Main starts...");
		
		ThreadTwo t2 = new ThreadTwo();
		t2.start();
		
		try {
			t2.join();
		} catch (InterruptedException e) {			
			e.printStackTrace();
		}
		
		for(int i =21; i<=40;i++) {
			System.out.println(i+ " ");
		}

		System.out.println("Main ends...");
	}

}

class ThreadTwo extends Thread {
	
	public void run() {
		for(int i =1; i<=20;i++) {
			System.out.println(i+ " ");
		}
	}
}
