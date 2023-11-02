package Threading;

import java.util.ArrayList;
import java.util.List;

public class StudentApp {
	public static void main(String[] args) {
		try {
		Address a1=new Address(145, "Sp Circle", "Bellary", "India");
		Address a2=new Address(146, "Raj Kumar Circle", "Kampli", "India");
		Address a3=new Address(147, "TB Dam Circle", "Hospet", "India");
		List<Address> adls=new ArrayList<>();
		adls.add(a1);
		adls.add(a2);
		adls.add(a3);
		Student1 s1=new Student1(458, "Kumar", "Male",adls );
		System.out.println("Student Data added");
		Thread.sleep(5000);
		System.out.println(s1.getAddress());
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
class Student1{
	int id;
	String name;
	String gender;
	List<Address> address;
	
	public Student1() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Student1(int id, String name, String gender, List<Address> address) {
		super();
		this.id = id;
		this.name = name;
		this.gender = gender;
		this.address = address;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public List<Address> getAddress() {
		return address;
	}

	public void setAddress(List<Address> address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Student1 [id=" + id + ", name=" + name + ", gender=" + gender + ", address=" + address + "]";
	}
	
	
	
	
	
}
class Address{
	int wardNo;
	String street;
	String city;
	String country;
	
	public Address() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Address(int wardNo, String street, String city, String country) {
		super();
		this.wardNo = wardNo;
		this.street = street;
		this.city = city;
		this.country = country;
	}

	public int getWardNo() {
		return wardNo;
	}

	public void setWardNo(int wardNo) {
		this.wardNo = wardNo;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	@Override
	public String toString() {
		return "Address [wardNo=" + wardNo + ", street=" + street + ", city=" + city + ", country=" + country + "]";
	}
	
	
	
}
