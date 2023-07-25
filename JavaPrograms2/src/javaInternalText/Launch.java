package javaInternalText;
public class Launch {
	public void method(byte x,short y)
	{
		System.out.println("byte,short"+x+y);
	}
	public void method(short x,int y)
	{
		System.out.println("short,int"+x+y);
	}
	public void method(int x,long y)
	{
		System.out.println("int,long"+x+y);
	}
	
	public static void main (String[] args) 
	  {
		byte p=65;
		Launch a=new Launch();
		char q=(char)p;
		a.method(p, q);
	  }
	}
