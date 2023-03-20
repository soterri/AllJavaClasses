package com.syntax.class08;

public class OddNumsFrom20to50 {
	public static void main(String[] args) {
		
		//print odd #s bw 20 and 50
		
		for(int i=21; i<=50; i+=2) {
			System.out.println(i);
		}
		//using modulus
		System.out.println();
		for(int i=20; i<=50; i++) {
			if(i%2==1) {
				System.out.println(i);
			}
		}

	}
}
