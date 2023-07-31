package Collection_Programs;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.TreeMap;
import java.util.TreeSet;

public class HashMapExe {
	public static void main(String[] args) {
		Employee e1=new Employee(100, "Ramesh", 100000);
		Employee e2=new Employee(50, "Suresh", 500000);
		Employee e3=new Employee(150, "Mahesh", 150000);		
		//Hash Map 
		HashMap<Integer, Employee> hm=new HashMap<Integer, Employee>();
		hm.put(101, e1);
		hm.put(102, e2);
		hm.put(103, e3);
		System.out.println(hm);
		System.out.println("---------------------------------------");
		System.out.println();
		//linked hash Map
		LinkedHashMap<Integer, Employee> lhm=new LinkedHashMap<Integer,Employee>();
		lhm.put(101,e1);
		lhm.put(102,e2);
		lhm.put(103,e3);
		System.out.println(lhm);
		System.out.println("---------------------------------------");
		System.out.println();
		//TreeMap
		TreeMap<Integer, Employee> tm=new TreeMap<>();
		tm.put(101, e1);
		tm.put(102, e2);
		tm.put(103, e3);
		System.out.println(tm);
	}
}

