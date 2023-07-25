package JavaProgramsChallenge;

import java.util.Scanner;

public class SumOfDigitsRecursion {
	public static void main(String[] args) {
		int n;
			Scanner sc=new Scanner(System.in);
			System.out.println("enter the number");
			n=sc.nextInt();
			SumOfDigitsRecursion sd=new SumOfDigitsRecursion();
			int result=sd.add(n);
			System.out.println(" sum "+result);
			System.out.println("-----------------");
		
	}
	int add(int n)
	{
		int sum=n%10;
		if(n==0)
		{
			return 0;
		}
		else {
			return sum+add(n/10);
		}
	}
}
