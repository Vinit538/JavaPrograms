package Collection_Programs;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Set;
import java.util.TreeMap;

public class MapViewExe {
	public static void main(String[] args) {
		//HashMap
		HashMap<Integer,Integer> hm=new HashMap<>();
		System.out.println("----------------HashMap--------------");
		System.out.println();
		hm.put(105, 86);
		hm.put(103, 42);
		hm.put(102, 23);
		hm.put(101, 18);
		hm.put(104, 25);
		System.out.println(hm);
		System.out.println();
		System.out.println("----------------Linked HashMap--------------");
		System.out.println();
		LinkedHashMap<Integer,Integer> lhm=new LinkedHashMap<Integer, Integer>();
		lhm.put(105, 86);
		lhm.put(103, 42);
		lhm.put(102, 23);
		lhm.put(101, 18);
		lhm.put(104, 25);
		System.out.println(lhm);
		System.out.println();
		System.out.println("---------------Tree Map---------------");
		System.out.println();
		TreeMap<Integer,Integer> tm=new TreeMap<>();
		tm.put(105, 86);
		tm.put(103, 42);
		tm.put(102, 23);
		tm.put(101, 18);
		tm.put(104, 25);
		System.out.println(tm);
		System.out.println();
		System.out.println("-----------------Map view----------------------");
		System.out.println();
		System.out.println("------------Key sets of hash Map--------------");
		System.out.println();
		//by the below keyset() we get the hash Map only keys values
		Set<Integer> s=hm.keySet();
		System.out.println(s);
		//it will get the values of hashMap
		Collection<Integer> s1=tm.values();
		System.out.println(s1);
		System.out.println("---------------------------------------");
		System.out.println();
		Iterator<Integer> itr=s1.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
		
	}

}
