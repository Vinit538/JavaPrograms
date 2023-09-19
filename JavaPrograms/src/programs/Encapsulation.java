package programs;

public class Encapsulation {
	public static void main(String[] args) {
		Emplayee emp1=new Emplayee();
		emp1.setId(101);
		emp1.setName("John");
		emp1.setGender("Male");
		System.out.println(emp1.getName()+" , "+emp1.getId()+" , "+emp1.getGender());
	}
}
class Emplayee
{
	//Restrict access to outsiders
	private int id;
	private String Name;
	private String Gender;
	public int getId() {
		return id;
	}
	//Giving Controlled access
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getGender() {
		return Gender;
	}
	public void setGender(String gender) {
		Gender = gender;
	}
}