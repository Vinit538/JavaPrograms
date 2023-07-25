package JavaProgramsChallenge;
// Java to get Sum of Digits in an Integer
public class SumOfDigits {
	public static void main(String[] args) {
		int arr[]= {3,5,5,7};
		int Number=3557;
		int result=sumOfDigits(Number);
		int result1=sumOfDigi(arr);
		for(int i=0;i<=arr.length-1;i++)
		{
			System.out.print(arr[i]+",");
		}
		System.out.print(": "+result1);
		System.out.println();
		System.out.println("------------------------");
		
		System.out.println(Number+" :  "+ "Sum  : "+result);
	}
	public static int sumOfDigi(int var[])
	{
		int sum=0;
		for(int i=0;i<=var.length-1;i++)
		{
			sum=var[i]+sum;
		}
		return sum;
		
	}
	public static int sumOfDigits(int var)
	{
		int result=0;
		int lastDigit=0;
		while(var > 0)
		{
			lastDigit=var % 10;
			System.out.println("LastDigit : "+lastDigit );
			result=result + lastDigit;
			System.out.println("Sum : "+result);
			var /= 10;
		}
		return result;
	}
}
