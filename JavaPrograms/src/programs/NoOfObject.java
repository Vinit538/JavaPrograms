package programs;

public class NoOfObject {
	public static void main(String[] args) {
		Employee e1=new Employee();
		System.out.println("Employee Object created "+e1.count+"  time"+" : "+e1);
		Employee e2=new Employee();
		System.out.println("Employee Object created "+e2.count+"  time2"+" : "+e2);
		Employee e3=new Employee();
		System.out.println("Employee Object created "+e3.count+"  time3"+" : "+e3);
	}
}

class Employee {
	//static variable with 0 value
	static int count=0;
	//constructor 
	public Employee()
	{
		//count incremented when it called employee object
		count++;
	}
}