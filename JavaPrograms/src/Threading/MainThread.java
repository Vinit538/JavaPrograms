package Threading;

import java.util.Scanner;
//multi threaded using runnable interface

public class MainThread {
	public static void main(String[] args) {
		try {
		System.out.println("Main activity Started");
		ClassThread1 ct1=new ClassThread1();
		ClassThread1 ct2=new ClassThread1();
		ClassThread1 ct3=new ClassThread1();
		Thread t1=new Thread(ct1);
		Thread t2=new Thread(ct2);
		Thread t3=new Thread(ct3);
		t1.setName("Bank");
		t2.setName("Print");
		t3.setName("Mul");
		t1.start();
		t2.start();
		t3.start();
		System.out.println(t1.isAlive());
		System.out.println(t2.isAlive());
		System.out.println(t3.isAlive());
		t1.join();
		t2.join();
		t3.join();
		System.out.println(t1.isAlive());
		System.out.println(t2.isAlive());
		System.out.println(t3.isAlive());
		System.out.println("Main activity Ended");
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}
	
}
class ClassThread1 implements Runnable
{
	public void run() {
		if(Thread.currentThread().getName().equals("Bank"))
		{
			banking();
		}
		else if(Thread.currentThread().getName().equals("Print"))
		{
			display();
		}
		else
		{
			Multiplay();
		}
	}
	
	
	
	
	public void banking()
	{
		try {
			System.out.println("Banking activity started");
			Scanner scan=new Scanner(System.in);
			System.out.println("Enter accno & password");
			int accNo=scan.nextInt();
			int pwd=scan.nextInt();
			System.out.println("Collect your money");
			System.out.println("Banking activity ended");
		}
		catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}

	public void display()
	{
		try {
			System.out.println("Printing activity started");
			for(int i=1;i<=5;i++)
			{
				System.out.println("Java Thread");
				Thread.sleep(5000);
			}
			System.out.println("Printing activity Ended");
		}
		catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}

	public void Multiplay()
	{
		try {
			System.out.println("Multiplication activity started");
			int a=123;
			int b=456;
			Thread.sleep(5000);
			int c=a*b;
			System.out.println(c);
			System.out.println("Multiplication activity Ended");
		}
		catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
}
