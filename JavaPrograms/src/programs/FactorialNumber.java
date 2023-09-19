package programs;

public class FactorialNumber {
	public static void main(String[] args) {
		int n=5;
		int result = findFactorial(n);
		System.out.println("the Factorial of "+n+" is : "+result);
	}
	public static int findFactorial(int n)
	{
		if(n==0)
		{
			return 1;
		}
		else
		{
			return n*findFactorial(n-1);
		}
	}
}
