package ExceptionsII;

public class Recap {

	public static void main(String[] args) throws InterruptedException {
		
		int num = 1;
		
		//runtime - unchecked exception
		int[] nums = {12,13};
		
		try { 
		System.out.println(nums[2]);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("trying to access element outside of boundary");
			//e.printStackTrace();
			System.out.println(e.getMessage());
		}
		//compile time - checked exception being checked by compiler that must be handled and compiler
		//provides 2 kw that you can use either handle it or throws it 
		Thread.sleep(1000);//THREAD is name of class SLEEP is a method that is being called
		System.out.println("end of code");
	}
}
