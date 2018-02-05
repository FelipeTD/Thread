package demo1;

import java.util.concurrent.Semaphore;

public class App {
	
	public static void main (String args []) throws InterruptedException {
		
		Semaphore sem = new Semaphore(1);
		
		sem.acquire();
		
		System.out.println("Avaliable permits: " + sem.availablePermits());
		
	}

}
