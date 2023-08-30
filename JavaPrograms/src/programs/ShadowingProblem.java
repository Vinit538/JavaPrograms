package programs;

public class ShadowingProblem {
	public static void main(String[] args) {
	Student s1=new Student(123, "john");
	System.out.println(s1.id);
	System.out.println(s1.name);
	}
}

class Student {
	int id;
	String name;
	public Student(int id, String name) {
		this.id = id;
		this.name = name;
	}
}
