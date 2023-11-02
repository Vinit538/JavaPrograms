package Threading;

import java.util.Scanner;

//single thread program 
public class Demo {
	public static void main(String[] args) {
		try
		{
			System.out.println("Banking activity started");
			Scanner scan=new Scanner(System.in);
			System.out.println("Enter accno & password");
			int accNo=scan.nextInt();
			int pwd=scan.nextInt();
			System.out.println("Collect your money");
			System.out.println("Banking activity ended");
			
			System.out.println("Printing activity started");
			for(int i=1;i<=5;i++)
			{
				System.out.println("Java Thread");
				Thread.sleep(5000);
			}
			System.out.println("Printing activity Ended");
			System.out.println("Multiplication activity started");
			int a=123;
			int b=456;
			Thread.sleep(5000);
			int c=a*b;
			System.out.println(c);
			System.out.println("Multiplication activity Ended");

		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}
