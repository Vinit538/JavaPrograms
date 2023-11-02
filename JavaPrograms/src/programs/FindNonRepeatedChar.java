package programs;

public class FindNonRepeatedChar {
	public static void main(String[] args) {
	String str="vinitv";
		findFirstNonRepeatedChar(str);
	}
	static public void findFirstNonRepeatedChar(String str)
	{
		for(char c:str.toCharArray())
		{
			if(str.indexOf(c)==str.lastIndexOf(c)) {
				System.out.println(c);
			}
		}
		
	}
}
