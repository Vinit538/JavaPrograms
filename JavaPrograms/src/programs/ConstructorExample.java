package programs;

public class ConstructorExample {
	public static void main(String[] args) {
		Fan fan1=new Fan(5140,"Crompton", 3499);
		System.out.println("Fan ID : "+fan1.getId());
		System.out.println("Fan Name : "+fan1.getName());
		System.out.println("Fan Cost : "+fan1.getCost());
		fan1.rotate();
	}
}
class Fan
{
	//restricting the access to outsiders
	private int id;
	private String name;
	private int cost;
	
	//specialized setter is as known Constructor 
	public Fan(int id, String name, int cost) {
		super();
		this.id = id;
		this.name = name;
		this.cost = cost;
	}
	
	//normal getters 
	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public int getCost() {
		return cost;
	}
	//Methods
	public void rotate()
	{
		System.out.println(name+" Fan is Rotating");
	}
}