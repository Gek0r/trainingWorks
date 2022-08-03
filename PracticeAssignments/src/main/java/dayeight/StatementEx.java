package dayeight;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class StatementEx {
	public static void main(String[] args) {
		Connection conn = null;
		int id = 1;
		String name = "Mike";
		try {
			conn = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/?user=root", "root", "HCLTraining2022");
			
			Statement stmt = conn.createStatement();
			
			int count = stmt.executeUpdate("INSER INTO EMPLOYEE VALUES (" + id + " , '" + name + "')");
			
			}
		catch(SQLException e) {
			e.printStackTrace();
		}finally {
			try {
				if(conn != null) {
					conn.close();
				}
			}catch(SQLException e) {
				e.printStackTrace();
			}
		}

	}

}
