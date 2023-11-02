package Inhrritance;

public class HasApp {
	public static void main(String[] args) {
		Mobile m=new Mobile();
		System.out.println(m.os.getType());
		System.out.println(m.os.getName());
		Charger c=new Charger("White", "Redmi");
		m.has(c);
		m=null;
		//System.out.println(m.os.getType());
		//System.out.println(m.os.getName());
		System.out.println(c.getColor());
		System.out.println(c.getBrand());
	}
}
class Os{
	int type;
	String name;
	
	public Os(int type,String name)
	{
		this.type=type;
		this.name=name;
	}
	public int getType() {
		return type;
	}

	public String getName() {
		return name;
	}
	
}
class Charger{
	String color;
	String brand;
	public Charger(String color, String brand) {
		this.color = color;
		this.brand = brand;
	}
	public String getColor() {
		return color;
	}
	public String getBrand() {
		return brand;
	}
}
class Mobile{
	Os os=new Os(32,"Android");
	
	public void has(Charger ref)
	{
		System.out.println(ref.getColor());
		System.out.println(ref.getBrand());
	}
}
