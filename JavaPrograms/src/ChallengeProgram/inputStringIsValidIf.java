package ChallengeProgram;

import java.util.HashMap;
import java.util.Stack;

//Given a string s containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.
//
//An input string is valid if:
//
//Open brackets must be closed by the same type of brackets.
//Open brackets must be closed in the correct order.
//Every close bracket has a corresponding open bracket of the same type.



public class inputStringIsValidIf {
	public static void main(String[] args) {
		String s="(){}[]";
		boolean boo=SolutionStringValidIf.isValid(s);
		System.out.println("Result : "+boo);
	}
}
class SolutionStringValidIf{
    public static boolean isValid(String s) {
        // Create hashmap to store the pairs
    	HashMap<Character, Character> hm=new HashMap<Character,Character>();
        hm.put(')','(');
        hm.put('}', '{');
        hm.put(']', '[');
        //create stack ds
        Stack<Character> stack=new Stack<Character>();
        //traverse each character in String
        for(int i=0;i<=s.length()-1;i++)
        {
        	if(s.charAt(i)=='('||s.charAt(i)=='{'||s.charAt(i)=='[')
        	{
        		//if open parentheses are present  push in stack
        		stack.push(s.charAt(i));
        		continue;
        	}
            // If the character is closing parentheses, check that the same type opening parentheses is being pushed to the stack or not...
            // If not, we need to return false...
        	if(stack.size()==0||hm.get(s.charAt(i))!= stack.pop()) {
        		return false;
        	}
        }
        //if the stack is empty, return true 
        if(stack.size()==0)
        {
        	return true;
        }
        return false;
    }
}