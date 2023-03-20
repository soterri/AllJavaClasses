package Polymorphism;

public class FullTime extends Employee{

	int bonus;
	
	public void getPaid() {
		System.out.println("FT emp gets paid "+salary+" and bonus "+bonus);
	}
	public static void main(String[] args) {
		
		FullTime ft = new FullTime();
		ft.salary=10000;
		ft.bonus=150;
		ft.getPaid();
	}
}
