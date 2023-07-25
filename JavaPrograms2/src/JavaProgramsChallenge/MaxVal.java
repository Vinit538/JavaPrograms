package JavaProgramsChallenge;
// Find the Max value in the array
public class MaxVal {
	public static void main(String[] args) {
		int arr[]= {2,9,6,17,15};
		maxVal(arr);
	}
	public static void maxVal(int a[])
	{
		int max=0;
		for(int i=0;i<=a.length-1;i++)
		{
			if(a[i]>max)
			{
				max=a[i];
			}
		}
		
		System.out.println("Max Value is : "+max);
	}
}
