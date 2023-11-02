package staticExamples;

import java.util.Scanner;

public class Businessman {
	public static void main(String[] args) {
		Bank malya=new Bank();
		Bank nirvmodi=new Bank();
		Bank gandi=new Bank();
		
		malya.take();
		malya.calculateSI();
		malya.display();
		
		nirvmodi.take();
		nirvmodi.calculateSI();
		nirvmodi.display();
		
		gandi.take();
		gandi.calculateSI();
		gandi.display();
		
	}
}
class Bank
{
	private int p;
	private int t;
	static private int r =2;
	private int si;
	
	Scanner scan =new Scanner(System.in);
	public void take()
	{
		System.out.println("Enter the Principle Amount");
		p=scan.nextInt();
		System.out.println("Enter the Time");
		t=scan.nextInt();
	}
	public void calculateSI() {
		si=(p*t*r)/100;
		System.out.println("Principle : "+p+" | "+" Time  "+t+" | "+" Rate Of Intereset : "+r);
	}
	
	public void display() {
		System.out.println("Simple Interset : "+si);
	}
}
