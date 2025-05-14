package com.syntax.class08;

public class NestedLoopClock {

	public static void main(String[] args) {
		
		for (int h=0; h<12; h++) {
			
			for(int m=0; m<60; m++) {
				
				if(m<10) {
					System.out.println(h+":0"+m);
				}else {
				
				System.out.println(h+":"+m);
			}
		}
		}
	}
}
