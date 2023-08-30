package programs;

public class FindingMissingNumber {
	public static void main(String[] args) {
		int a[]= {1,2,3,4,6};
		int result=missingNumber(a);
		System.out.println("The missing Number is : "+result);
	}
	public static int missingNumber(int arr[])
	{
		int n=arr.length+1;
		int totalSum=(n*(n+1))/2;
		int actualSum=0;
		for(int i=0;i<=arr.length-1;i++)
		{
			actualSum=actualSum + arr[i];
		}
		
		return totalSum - actualSum;
	}
}
