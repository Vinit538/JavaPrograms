package programs;

public class Searching_Program {
	public static void main(String[] args) {
		int arr[] = { 18, 23, 25, 42, 86 };
		for (Object x : arr) {
			System.out.print(x + ",");
		}
		System.out.println();
		int key=42;
		linearSearch(arr,key);
		binarySearch(arr, key);
	}
	//Linear Search 
	public static void linearSearch(int arr[],int key)
	{
		
		System.out.println("-----Linear Search-----");
		for(int i=0;i<=arr.length-1;i++)
		{
			if(arr[i]==key)
			{
				System.out.println("Key Found @ Index : "+i+" in Linear Search");
				return;
			}
		}
		System.out.println("Key not Found ");
	}
	//Binary Search
	public static void binarySearch(int arr[],int key)
	{
		int low=0;
		int high=arr.length-1;
		while(low<=high)
		{
			int mid=(low+high)/2;
			if(key==arr[mid])
			{
				System.out.println("Key Found @ Index : "+mid+" in Binary Search");
				return;
			}
			else if(key > arr[mid])
			{
				low=mid+1;
				high=high;
			}
			else
			{
				high=mid-1;
				low=low;
			}
		}
		System.out.println("Key not Found");
	}
}
