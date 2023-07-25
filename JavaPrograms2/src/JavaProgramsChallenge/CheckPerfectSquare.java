package JavaProgramsChallenge;

import java.util.Scanner;

public class CheckPerfectSquare {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Number");
		double num=sc.nextDouble();
		if(checkPerfectSquare(num))
			System.out.println("Yes the given number is perfect square");
		else
			System.out.println("No the given number is not perfect square");
	}

	static boolean checkPerfectSquare(double num) {
		for (int i = 1; i * i <= num; i++) {
			if((num % i == 0) && (num / i==i))
			{
				return true;
			}
		}
		return false;
	}
}
