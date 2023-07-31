package Collection_Programs;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Set;
import java.util.TreeMap;

public class HashMapExe {
	public static void main(String[] args) {
		Employee e1=new Employee(100,"Ramesh", 100000);
		Employee e2=new Employee(50, "Suresh", 500000);
		Employee e3=new Employee(150,"Mahesh", 150000);	
		Employee e4=new Employee(90,"Rajesh", 50000);
		System.out.println("-----------------Hash Map----------------------");
		System.out.println();
		//Hash Map 
		HashMap<Integer, Employee> hm=new HashMap<Integer, Employee>();
		hm.put(101, e1);
		hm.put(105, e3);
		hm.put(102, e2);
		hm.put(90, e4);
		System.out.println(hm);
		System.out.println("-------------------Linked Hash Map--------------------");
		System.out.println();
		//Linked Hash Map
		LinkedHashMap<Integer, Employee> lhm=new LinkedHashMap<Integer,Employee>();
		//adding all Hash Map object to linked hash map
		lhm.putAll(hm);
		System.out.println(lhm);
		System.out.println();
		System.out.println("-------------------- Tree Map-------------------");
		System.out.println();
		//Tree Map
		TreeMap< Integer, Employee> tm= new TreeMap<Integer,Employee>();
		//adding all Linked Hash Map object to Tree map
		tm.putAll(lhm);
		System.out.println(tm);
		System.out.println();
		System.out.println();
		System.out.println("-----------Display by the keys of Tree Map----------------------------");
		System.out.println();
		Set<Integer> s=tm.keySet();
		Iterator<Integer> itr1=s.iterator();
		while (itr1.hasNext()) {
			System.out.println(itr1.next());
		}
		System.out.println();
		System.out.println("-----------Display by the value of Tree Map----------------------------");
		System.out.println();
		Collection<Employee> s1=tm.values();
		Iterator<Employee> itr=s1.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
	}
}

