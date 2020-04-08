package com.sri.sequential;

public class SequentialExecution {
	public static void main(String[] args) {

		Runner1 runner1 = new Runner1();
		Runner2 runner2 = new Runner2();

		runner1.executeRunner1();
		System.out.println("Srikanth");
		runner2.executeRunner2();
	}
}
