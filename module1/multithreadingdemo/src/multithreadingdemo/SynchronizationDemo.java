package multithreadingdemo;

import java.util.ArrayList;
import java.util.List;

public class SynchronizationDemo {

	public static void main(String[] args) {

		MyResource myResource = new MyResource();
		
		
		MyThreadTwo t2 = new MyThreadTwo(myResource);
		t2.setName("T1");

		MyThreadTwo t3 = new MyThreadTwo(myResource);
		t3.setName("T2");

		t2.start();

		t3.start();

	}

}

class MyThreadTwo extends Thread {

	private MyResource myResource;
	

	MyThreadTwo(MyResource myResource) {
		this.myResource = myResource;
		
	}

	public void run() {

		myResource.display();
	}
}

class MyResource {

	private List<String> courses;
	
	MyResource() {
	
		courses = new ArrayList<>();
		courses.add("java1");
		courses.add("java2");
		courses.add("java3");
		courses.add("java4");
		courses.add("java5");
		courses.add("java6");
		courses.add("java7");
		courses.add("java8");
		courses.add("java9");
		courses.add("java10");
	}

	void display() {

		synchronized(this) {
			courses.forEach(x -> System.out.println(Thread.currentThread().getName() + ": " + x));
		}
	}

}
