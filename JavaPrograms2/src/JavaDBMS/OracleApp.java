package JavaDBMS;

import java.sql.*;
import java.util.Scanner;
public class OracleApp {

static String Db="dataa";
static String url="jdbc:mysql://localhost:3306/"+Db+"";
static Connection con;
static String user="root";
static String pass="System@23";
static Scanner scan =new Scanner(System.in);
	public static void connectOracle() throws SQLException {
		con=DriverManager.getConnection(url, user, pass);
		System.out.println("Connected Database "+con);
		while(true)
		{
			System.out.println("Select the Operation");
			System.out.println("Press 1 for Create Table");
			System.out.println("Press 2 for Insert Data");
			System.out.println("Press 1 for Update Data");
			System.out.println("Press 2 for Delete Data");
			System.out.println("--------------------------------");
			int ch=scan.nextInt();
			switch (ch) {
			case 1:createTable();
				break;
			case 2:insertRow();
				break;
			case 3:updateRow();
				break;
			case 4:deleteRow();
			break;
			default: System.out.println("Not Selected any Option");
			System.out.println();
			   		System.exit(0);
			}
		}
	}
	public static void createTable() throws SQLException {
		
		Statement st=con.createStatement();
		String sql="CREATE TABLE trainers(id INT, name VARCHAR(10))";
		try {
			st.executeUpdate(sql);
		} catch (SQLException e) {
			System.out.println("Already Table is present in the database");
			connectOracle();
		}
		System.out.println("DataBase Created in the  "+Db);
	}
	public static void insertRow() throws SQLException {
		System.out.println("Enter the Id ");
		int id=scan.nextInt();
		System.out.println("Enter the Name ");
		String name=scan.next();
		String sql="INSERT INTO trainers VALUES(?,?)";
		PreparedStatement ps=con.prepareStatement(sql);
		ps.setInt(1, id);
		ps.setString(2, name);
		ps.executeUpdate();
		System.out.println("Data Inserted Successfully");
	}
	public static void updateRow() throws SQLException {
		System.out.println("Enter the Id ");
		int id=scan.nextInt();
		System.out.println("Enter the Name ");
		String name=scan.next();
		String sql="update trainers set Address='Bellary' where id=222";
		Statement st=con.createStatement();
		st.executeUpdate(sql);
		System.out.println("Data update Successfully");
	}
	public static void deleteRow() throws SQLException {
		System.out.println("Enter the Id ");
		int id=scan.nextInt();
		System.out.println("Enter the Name ");
		String name=scan.next();
		String sql="update trainers set id=?, where name=?";
		PreparedStatement ps=con.prepareStatement(sql);
		ps.setInt(1, id);
		ps.setString(2, name);
		ps.executeUpdate();
		System.out.println("Data Inserted Successfully");
	}

	
}
