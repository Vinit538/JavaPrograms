package InterfaceExe;

import java.util.Scanner;

public class MyCalculator2 implements Calculator,Calculator2 {

	Scanner scan =new Scanner(System.in);
	@Override
	public void mul() {
		System.out.println("Enter 2 numbers for Multiplication");
		int x=scan.nextInt();
		int y=scan.nextInt();
		int z=x*y;
		System.out.println(z);

	}

	@Override
	public void div() {
		System.out.println("Enter 2 numbers for Division ");
		int x=scan.nextInt();
		int y=scan.nextInt();
		int z=x/y;
		System.out.println(z);

	}

}
