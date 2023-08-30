package programs;

public class GCD_Of_Two_Numbers {
	public static void main(String[] args) {
		int m = 4;
		int n = 8;
		int result =findGcd(m,n);
		int result2=rfindGcd(m,n);
		System.out.println("The GCD Of two Numbers : "+result);
		System.out.println("The GCD Of two Numbers : "+result2);
	}
	//normal method
	public static int findGcd(int m,int n)
	{
		while (n!=0)
		{
			int rem=m%n;
			m=n;
			n=rem;
		}
		return m;
	}
	//using recursion method
	public static int rfindGcd(int m,int n)
	{
		if(n==0)
		{
			return m;
		}
		else
		{
			return rfindGcd(n,m% n);
		}
	}
}
