package programs;

public class TypeCasting {
	public static void main(String[] args) {
		//Implicit Type Casting
		System.out.println("-----Implicit Type Casting-----");
		byte a1=10;
		int a2=40;
		System.out.println("byte value of a1 : "+a1);
		System.out.println("int value of a2 : "+a2);
		short b1;
		double b2;
		b1=a1;
		b2=a2;
		System.out.println("After Typecasting ");
		System.out.println("short value of b1 : "+b1);
		System.out.println("double value of b2 : "+b2);
		//Explicitly Type Casting
		System.out.println("-----Explicitly Type Casting-----");
		int a3=90;
		double a4=3.147;
		System.out.println("int value of a3 : "+a3);
		System.out.println("double value of a4 : "+a4);
		short b3;
		int b4;
		b3=(short)a3;
		b4=(int)a4;
		System.out.println("After Typecasting ");
		System.out.println("short value of b3 : "+a3);
		System.out.println("int value of b4 : "+b4);
	}
}
