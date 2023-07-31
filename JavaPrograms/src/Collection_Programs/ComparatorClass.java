package Collection_Programs;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class ComparatorClass{
	public static void main(String[] args) {
		// array List with data 
		ArrayList<Object> al=new ArrayList<>();
		al.add(new Employee(100, "Ramesh", 100000));
		al.add(new Employee(50, "Suresh", 500000));
		al.add(new Employee(150, "Mahesh", 150000));
		System.out.println(al);
		System.out.println();
		//Creating object of the alpha class
		Alpha alpha=new Alpha();
		//Calling sort method which is present in Collections and passing to parameter arrayList, alpha class the method to sort 
		Collections.sort(al,alpha);
		System.out.println(al);
		
	}
	
}
//Class alpha implements comparator Generic type of object 
class Alpha implements Comparator<Object>
{

	//method the sort by id of the employee
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