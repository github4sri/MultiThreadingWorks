/**
 * 
 */
package com.sri.concurrentExecutionThread;

/**
 * @author Sri
 *
 *         Created on Apr 9, 2020
 */
public class Runner2 extends Thread {

	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println("Runner2 by extending thread : " + i);
		}
	}
}
