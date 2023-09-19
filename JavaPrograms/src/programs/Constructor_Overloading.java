package programs;

public class Constructor_Overloading {
	public static void main(String[] args) {
		Fans fan1=new Fans("Bajaja", 2999);
		System.out.println(fan1.getName()+" "+fan1.getCost());
		Fans fan2=new Fans(45631);
		System.out.println(fan2.getId());
		Fans fan3=new Fans(554123, "Usha", 3499);
		System.out.println(fan3.getId()+" , "+fan3.getName()+" , "+fan3.getCost());
	}
}
class Fans
{
	//restricting the access to outsiders
	private int id;
	private String name;
	private int cost;
	
	//specialized setter is as known Constructor 
	//Constructor Overloading
	public Fans(int id) {
		super();
		this.id = id;
	}
	
	//Constructor Overloading
	public Fans(String name, int cost) {
		super();
		this.name = name;
		this.cost = cost;
	}
	
	//Constructor Overloading
	public Fans(int id, String name, int cost) {
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
}