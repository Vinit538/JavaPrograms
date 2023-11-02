package Threading;

public class Demo2 {
	public static void main(String[] args) {
		Student s1=null;
		int id=420;
		String name="Ragu"+id;
		s1=new Student(id,name);
		s1.setId(143);
		System.out.println(s1.getName());
		System.out.println(s1.getId());

	}
}

class Student{
	private int id;
	private String name;
	
	
	
	private Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	Student(int id,String name) {
		super();
		System.out.println("Constructor");
		this.id = id;
		this.name=name;
	}

	public int getId() {
		System.out.println("getdata");
		return id;
	}

	public void setId(int id) {
		System.out.println("set Data");
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = id+"Raju";
	}
}