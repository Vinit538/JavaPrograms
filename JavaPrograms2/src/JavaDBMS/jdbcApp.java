package JavaDBMS;

import java.sql.*;
import java.util.Scanner;

public class jdbcApp {
	
	public static void main(String[] args) throws Exception {
		Scanner scan=new Scanner(System.in);
		while(true)
		{
			System.out.println("Select DataBase");
			System.out.println("Press 1 for Orcale DBMS");
			System.out.println("Press 2 for MySql DBMS");
			int ch=scan.nextInt();
			switch (ch) {
			case 1:connectOracle();
				break;
			case 2:connectMysql();
				break;
			default: System.out.println("Not Selected any DBMS");
			   		System.exit(0);
			}
		}
	}
	public static void connectOracle() throws ClassNotFoundException, SQLException
	{
		String driver="oracle.jdbc.driver.OracleDriver";
		String url="jdbc:oracle:thin:@localhost:1521:xe";
		String user="system";
		String pass="system";
		Class.forName(driver);
		Connection con=DriverManager.getConnection(url, user, pass);
		System.out.println("Connected to Oracle DataBase "+con);
	}
	public static void connectMysql() throws SQLException
	{
		//String Driver="com.mysql.cj.jdbc.Driver";		
		String url="jdbc:mysql://localhost:3306/dataa";
		String user="root";
		String pass="System@23";
		Connection con=DriverManager.getConnection(url, user, pass);
		System.out.println("Connected to MySql DataBase "+con);
	}

}
