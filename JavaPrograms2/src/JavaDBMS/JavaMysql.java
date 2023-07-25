package JavaDBMS;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Iterator;

public class JavaMysql {
	public static void main(String[] args) throws SQLException, ClassNotFoundException {
		String Driver="com.mysql.cj.jdbc.Driver";
		String url="jdbc:mysql://localhost:3306/dataa";
		String userName="root";
		String passWord="System@23";
		Class.forName(Driver);
		Connection con=DriverManager.getConnection(url, userName, passWord);
		System.out.println("Connected to MySql DataBase "+con);
		
	}
}
