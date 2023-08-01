package ChallengeProgram;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CountWord {
	public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        System.out.println("Enter the String");
	        String text = scanner.nextLine();
	        countCharacters(text);
	        System.out.println();
	    }

	
	    public static void countCharacters(String text) {
	        Map<Character, Integer> occurrences = new HashMap();
	        for (char c : text.toCharArray()) {
	            if (c != ' ') {
	                occurrences.put(c, occurrences.getOrDefault(c, 0) + 1);
	            }
	        }
	        for (Map.Entry<Character, Integer> entry : occurrences.entrySet()) {
	            System.out.println(entry.getKey() + ":" + entry.getValue());
	        }
	    }
	}
/*--------------------output-------------------------*/
/*
 * Enter the String 
 * Hello World 
 * r:1 
 * d:1 
 * e:1 
 * W:1 
 * H:1 
 * l:3 
 * o:2
 * 
 */
