package interviewQuestions;

public class IQ8 {
	public static void main(String[] args) {
		
		/*Write a java program to print the first 10 numbers of Fibonacci series
		 */
		
		int a,b,c;
		a=0;
		b=1;
		
		for(int i=0; i<=10; i++) {
			
			System.out.println(a+" ");
			c=a+b;
			a=b;
			b=c;
		}
	}

}

//first print the value, perform the addition, reassign 