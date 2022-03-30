package multithreadingdemo;

public class InterthreadDemo {

	public static void main(String[] args) {
		
		NumberGenerator numGenerator = new NumberGenerator();
		
		EvenThread eThread = new EvenThread(numGenerator);
		eThread.setName("EVEN");
		
		OddThread oThread = new OddThread(numGenerator);
		oThread.setName("ODD");
		
		eThread.start();
		oThread.start();
		

	}

}

class EvenThread extends Thread {

	private NumberGenerator numGenerator;

	EvenThread(NumberGenerator numGenerator) {
		this.numGenerator = numGenerator;
	}

	public void run() {
		numGenerator.printEven();
	}
}

class OddThread extends Thread {

	private NumberGenerator numGenerator;

	OddThread(NumberGenerator numGenerator) {
		this.numGenerator = numGenerator;
	}

	public void run() {
		numGenerator.printOdd();
	}
}

class NumberGenerator {

	int counter = 1;

	synchronized void printEven() {
		while(counter <= 20) {
			
			if(counter % 2 == 1) {
				try {
					wait();
				} catch (InterruptedException e) {				
					e.printStackTrace();
				}
			}
			System.out.println(Thread.currentThread().getName()+ ": "+counter);
			counter++;
			notify();
		}
		
	}

	synchronized void printOdd() {
		
		while(counter <= 20) {
			if(counter % 2 == 0) {
				try {
					wait();
				} catch (InterruptedException e) {				
					e.printStackTrace();
				}
			}
			System.out.println(Thread.currentThread().getName()+ ": "+counter);
			counter++;
			notify();
		}
		
	}
}
