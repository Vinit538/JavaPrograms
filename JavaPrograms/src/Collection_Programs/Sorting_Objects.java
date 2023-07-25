package Collection_Programs;

import java.util.ArrayList;
import java.util.Collections;
import java.util.TreeSet;

//Sorting of simple objects
public class Sorting_Objects {
	public static void main(String[] args) {
		ArrayList<Integer> al=new ArrayList<Integer>();
		al.add(86);
		al.add(45);
		al.add(22);
		al.add(18);
		al.add(25);
		ArrayList<Integer> al2=new ArrayList<Integer>();
		al2.addAll(al);
		System.out.println("ArrayList in unSorted order :"+al);
		//Array List in sorted order using Sort() which is present in the Collections class
		Collections.sort(al);
		System.out.println("ArrayList in Sorted order : "+al);
		//Another way to sort is by adding array List to Tree set
		TreeSet<Integer> ts=new TreeSet<>();
		ts.addAll(al2);
		System.out.println();
		System.out.println("ArrayList in Sorted order by Tree set :"+al);
	}
}
