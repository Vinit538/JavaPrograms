package JavaDBMS;

import java.sql.*;
import java.util.Scanner;

public class StudentApp {
	static Scanner scan=new Scanner(System.in);
	static String Db="dataa";
	static String url="jdbc:mysql://localhost:3306/"+Db+"";
	static Connection con;
	static String user="root";
	static String pass="System@23";
	
	public static void main(String[] args) throws SQLException {
		//Student s1=new Student(1,"Deep","6.3f");
		//Student s2=new Student(2,"Ajay","7.8f");
		while(true)
		{
			System.out.println("Press 1 to insert Data");
			
			System.out.println("Press any key to Exit");
			System.out.println("-------------------------");
			int ch=scan.nextInt();
			switch (ch) {
			case 1:
				System.out.println("Enter Student Details");
				System.out.println("Enter Student RollNo");
				int rollNo=scan.nextInt();
				System.out.println("Enter Student Name");
				String name=scan.next();
				System.out.println("Enter Student CGPA");
				String cgpa=scan.next();
				Student s=new Student(rollNo,name,cgpa);
				insertObject(s);
					break;
			default:
				System.out.println("Thank You");
				System.exit(0);
			}
		}
	}
//	public static void Students()
//	{
//		System.out.println("Enter Student Details");
//		System.out.println("Enter Student RollNo");
//		int rollNo=scan.nextInt();
//		System.out.println("Enter Student Name");
//		String name=scan.next();
//		System.out.println("Enter Student CGPA");
//		String cgpa=scan.next();
//		Student s=new Student(rollNo,name,cgpa);
//		
//	}
//	
	
	public static void insertObject(Student s) throws SQLException
	{
		System.out.println("Student RollNo "+s.rollNo);
		System.out.println("Student Name "+s.name);
		System.out.println("Student Cgpa "+s.cgpa);
		String sql="INSERT INTO Students VALUES(?,?,?)";
		con=DriverManager.getConnection(url, user, pass);
		PreparedStatement ps=con.prepareStatement(sql);
		ps.setInt(1, s.rollNo);
		ps.setString(2,s.name);
		ps.setString(3,s.cgpa);
		ps.executeUpdate();
		System.out.println("Data Inserted Successfully");
		System.out.println("------------------------------");
	}
}
