package multithreadingdemo;

public class ThreadOne extends Thread {
	
	public void run() {
		for(int i=1;i<=50;i++) {
			System.out.println(Thread.currentThread().getName()+" : "+i);
		}		
	}
}
