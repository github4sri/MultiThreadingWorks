/**
 * 
 */
package com.sri.concurrentExecutionThread;

/**
 * @author Sri
 *
 *         Created on Apr 9, 2020
 */
public class ConcurrentExtendsThread {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Runner1 runner1 = new Runner1();
		Runner2 runner2 = new Runner2();

		runner1.start();
		runner2.start();
		
		try {
			runner1.join();
			runner2.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("Tasks are completed..");

	}

}
