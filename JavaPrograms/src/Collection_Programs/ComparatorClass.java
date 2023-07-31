package Collection_Programs;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;

public class ComparatorClass{
	public static void main(String[] args) {
		ArrayList<Object> al=new ArrayList<>();
		al.add(new Employee(100, "Ramesh", 100000));
		al.add(new Employee(50, "Suresh", 500000));
		al.add(new Employee(150, "Mahesh", 150000));
		System.out.println(al);
		System.out.println();
		Alpha alpha=new Alpha();
		Collections.sort(al,alpha);
		System.out.println(al);
		
	}
	
}
class Alpha implements Comparator<Object>
{

	@Override
	public int compare(Object x, Object y) {
		if(((Employee)(x)).id > ((Employee)(y)).id)
		{
			return 1;
		}
		else
		{
			return -1;
		}
	}
	
}




class Employee
{
	int id;
	String name;
	int salary;
	
	public Employee(int id, String name, int salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}
	
	
}