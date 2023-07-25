package Collection_Programs;

//By Overrideing toString to get desire Output by object
public class UsingToString {
	public static void main(String[] args) {
		Student s1=new Student("Omakar", 24, "M");
		Student s2=new Student("Ramesh", 25, "M");
		Student s3=new Student("Parmesh", 26, "M");
		Student s4=new Student("Yashvanth", 23, "M");
		Student s5=new Student("Suresh", 25, "M");
		System.out.println(s1);
		System.out.println();
		System.out.println(s2);
		System.out.println();
		System.out.println(s3);
		System.out.println();
		System.out.println(s4);
		System.out.println();
		System.out.println(s5);
	}
}

class Student {
	String name;
	int age;
	String gender;

	public Student(String name, int age, String gender) {
		super();
		this.name = name;
		this.age = age;
		this.gender = gender;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + ", gender=" + gender + "]";
	}
	
}
