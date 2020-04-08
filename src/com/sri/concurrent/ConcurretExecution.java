package com.sri.concurrent;

/*
 * Concurrent execution of threads by implementing Runnable interface 
 */
public class ConcurretExecution {
	public static void main(String[] args) {
		System.out.println("Srikanth");
		Thread thread1 = new Thread(new Runner1());
		Thread thread2 = new Thread(new Runner2());

		thread1.start();
		thread2.start();
	}
}
