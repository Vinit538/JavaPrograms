package JavaProgramsChallenge;

public class LetterToGrade {
	public static void main(String[] args) {
		System.out.println("Grade A  : "+ltToGpa("A"));
		System.out.println("Grade B+ : "+ltToGpa("B+"));
		System.out.println("Grade A+ : "+ltToGpa("A+"));
		System.out.println("Grade F  : "+ltToGpa("F"));
		System.out.println("Grade C+ : "+ltToGpa("C+"));
	}
	public static double ltToGpa(String ltr)
	{
		double answer=0.0;
		switch (ltr) {
		case "A+":
			answer=10.0;
			break;
		case "A":
			answer=9.5;
			break;
		case "B+":
			answer=9.0;
			break;
		case "B":
			answer=8.0;
			break;
		case "C+":
			answer=6.5;
			break;
		case "C":
			answer=6.0;
			break;
		case "D+":
			answer=5.5;
			break;
		case "D":
			answer=5.0;
			break;
		case "E+":
			answer=4.5;
			break;
		case "E":
			answer=4.0;
			break;
		case "F":
			answer=3.0;
			break;
		}
		
		return answer;
	}
}
