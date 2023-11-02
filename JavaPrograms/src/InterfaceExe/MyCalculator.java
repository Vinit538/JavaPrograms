package InterfaceExe;

public class MyCalculator implements Calculator,Calculator2 {

	@Override
	public void mul() {
		int a=20;
		int b=10;
		int c=a*b;
		System.out.println("My Calculator - Multiplication : "+c);

	}

	@Override
	public void div() {
		int a=20;
		int b=10;
		int c=a/b;
		System.out.println("My Calculator - Division  : "+c);

	}
	
	
	public void add()
	{
		int a=20;
		int b=10;
		int c=a+b;
		System.out.println("My Calculator - Addition  : "+c);
	}

}
