package JavaCollections;

public class javacollection1 {
    public static void main(String[] args) {
        int arr[]=new int[3];
        arr[0]=10;
        arr[1]=20;
        //arr[2]="Ramu";//Type mismatch: cannot convert from String to int
        //arr[3]=45;//Index 3 out of bounds for length 3
        for (Object x:arr)
        {
        	System.out.println(x);
        }
    }
}
