package JavaCollections;

import java.util.ArrayList;

public class ArrayListEx1 {
    @SuppressWarnings("unlikely-arg-type")
	public static void main(String[] args) {
        //Additional Method in array list
        ArrayList<Integer> al= new ArrayList<Integer>();
        al.add(50);
        al.add(150);
        al.add(25);
        al.add(75);
        al.add(125);
        al.add(175);
        System.out.println(" al -> "+al);//[50, 150, 25, 75, 125, 175]
         ArrayList<Integer> al2= new ArrayList<Integer>();
         al2.add(1000);
         al2.add(500);
         al2.add(1500);
         al2.add(250);
         al2.add(750);
         al2.add(1250);
         al2.add(1750);
         System.out.println(" al2 -> "+al2);//[1000, 500, 1500, 250, 750, 1250, 1750]
         al2.add(2,999);//adding array list of al2 @ 2nd index of to 999
         al.addAll(al2);//adding all the elements al2 to al array list
         System.out.println("al + al2 - > "+al);
         //[50, 150, 25, 75, 125, 175, 1000, 500, 999, 1500, 250, 750, 1250, 1750]
         ArrayList<Integer> al3= new ArrayList<Integer>();
         al3.add(10);
         al3.add(20);
         al3.add(30);
         System.out.println(" al3 -> "+al3);// al3 -> [10, 20, 30]
         al.addAll(2,al3);
         System.out.println("al+ al2 -> "+al);
         //it checks whether the 'al' contains or not if contains return true 
         System.out.println("al.contains(999) -> "+al.contains(999));//true
         System.out.println("al.contains(al2) -> "+al.containsAll(al2));//true
         System.out.println(al.contains(al2));
         System.out.println(al);
         System.out.println(al2);
         ArrayList<Integer> al4= new ArrayList<Integer>();
         //it checks whether al4 is empty or not 
         System.out.println("al4.isEmpty() -> "+al4.isEmpty());//true
         System.out.println("al3.get(2) -> "+al3.get(2));
         System.out.println("al.remove(125) -> "+al.remove(12));
         System.out.println(" al -> "+al);
         System.out.println(al.remove(al3));
         System.out.println(" al -> "+al);
    }
}
