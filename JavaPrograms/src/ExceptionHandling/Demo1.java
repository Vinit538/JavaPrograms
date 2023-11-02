package ExceptionHandling;

import java.util.Scanner;
import java.lang.Math;
public class Demo1 {
	public static void main(String[] args) throws Exception {
		int year=0;
		if(year/4==((double)year/4))
		{
			System.out.println("Is leap year");
		}
		else
		{
			System.out.println("Is Not leap year");
		}
		
	}
}



//
//import java.util.Scanner;
//
//public class Demo1 {
//	public static void main(String[] args) throws Exception {
//		Scanner scan =new Scanner(System.in);
//		System.out.println("Program started ");
//			try {
//				System.out.println("Enter the array length");
//				int arr[]=new int[scan.nextInt()];
//				System.out.println("Enter array elements");
//				for(int i=0;i<=arr.length-1;i++)
//				{
//					arr[i]=scan.nextInt();
//				}
//				for(Object x:arr )
//				{
//					System.out.print(x +" ");
//				}
//				System.out.println();
//				
//			}
//			catch (ArithmeticException e) {
//				System.out.println("Arithmetic exception : /by 0");
//			}
//			catch (NegativeArraySizeException e) {
//				System.out.println("Neagtive Array size ... Exception : Give postive Array Size");
//			}
//			catch(ArrayIndexOutOfBoundsException e)
//			{
//				System.out.println("Array boundary Surpased : give valid  postion elements ");
//			}
//			catch(Exception e)
//			{
//				System.out.println("Some other problem occured please give some time");
//			}
//		System.out.println("Connecton terminated");
//	}
//}
