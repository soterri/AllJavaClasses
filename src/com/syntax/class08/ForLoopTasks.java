package com.syntax.class08;

public class ForLoopTasks {
	public static void main(String[] args) {
		
		//print numbers from 1 to 100
		
		for(int i=1; i<=100; i++) {
			System.out.println("1-100 -- "+ i);
		}
		System.out.println("---------------------------");
		//print numbers 100 to 1
		
		for(int i=100; i>=1; i--) {
			System.out.println("100-1 -- "+i);
		}
		System.out.println("***************************");
		//print even numbers 2o to 1 
		for(int i=20; i>=1;i--) {
			
			if(i%2==0) {
				System.out.println(i);
			}
			
		}
	}

}
