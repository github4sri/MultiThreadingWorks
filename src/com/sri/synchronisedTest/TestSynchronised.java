/**
 * 
 */
package com.sri.synchronisedTest;

/**
 * @author Sri
 *
 *         Created on Apr 9, 2020
 */
public class TestSynchronised {

	private static int counter = 0;

	public static void main(String[] args) {
		process();
		System.out.println(counter);
	}

	public static synchronized void increment() {
		++counter;

	}

	public static void process() {

		Thread thread1 = new Thread(new Runnable() {

			@Override
			public void run() {
				for (int i = 0; i < 100; i++) {
					increment();
				}
			}
		});

		Thread thread2 = new Thread(new Runnable() {

			@Override
			public void run() {
				for (int i = 0; i < 100; i++) {
					increment();
				}
			}
		});

		thread1.start();
		thread2.start();

		try {
			thread1.join();
			thread2.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
