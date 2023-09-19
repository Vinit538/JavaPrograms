package ChallengeProgram;

import java.util.Arrays;


//Write a function to find the longest common prefix string amongst an array of strings.
//If there is no common prefix, return an empty string "".


public class longestCommonPrefix {
	public static void main(String[] args) {
		String[] s= {"flight", "flower", "flow"};
		String res=SolutionPrefix.longestCommonPrefix(s);
		System.out.println("Comman longest prefix : ' "+res+ " ' ");
	}
	
}
class SolutionPrefix {
    public static String longestCommonPrefix(String[] strs) {
        if(strs.length==0 || strs==null)
        {
        	return "";
        }
        else if(strs.length==1)
        {
        	return strs[0];
        }
    	//Arrays sort array in alphabetical order
    	//by the sort method all the characters are sorted  
    	Arrays.sort(strs);
    	//store the first element in the s1
    	String s1=strs[0];
    	//store the last element in the s2 
    	String s2=strs[strs.length-1];
    	int idx=0;
    	//check until the idx values is lesser then s1.length and s2.length
    	while(idx < s1.length() && idx < s2.length())
    	{
    		//check s1 index is equal s2 index at position idx
    		if(s1.charAt(idx) == s2.charAt(idx))
    		{
    			//if equal increment idx 
    			idx++;
    		}
    		else
    		{
    			break;
    		}
    	}
    	
//    	while (pos < s1.length() && pos < s2.length() && s1.charAt(pos) == s2.charAt(pos)) {
//            pos++;
//        }
    	
    	return s1.substring(0,idx);
    }
}
