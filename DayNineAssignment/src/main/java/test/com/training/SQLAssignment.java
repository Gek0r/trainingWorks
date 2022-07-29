package test.com.training;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.DatabaseMetaData;
import java.sql.CallableStatement;

public class SQLAssignment {

	public static void main(String[] args) {
		StatementAndPrepared();
		Procedure();
		ResultSetAndMetaData();
		TransactionManagement();
		BatchProcessing();
	}

	public static void StatementAndPrepared() {
		Connection con = null;
		Statement stmt = null;
		try {
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/training", "root", "root");
			// 1) Write a program for statement for doing below operations
			stmt = con.createStatement();

			// insert
			stmt.executeUpdate("INSERT INTO training.pets values(1, 'Fido', 'Dog')");
			stmt.executeUpdate("INSERT INTO training.pets values(2, 'Apollo', 'Bird')");
			stmt.executeUpdate("INSERT INTO training.pets values(3, 'Gummi', 'Bird')");
			stmt.executeUpdate("INSERT INTO training.pets values(4, 'Mochi', 'Cat')");

			// select
			stmt.execute("SELECT name, type FROM training.pets WHERE type = 'Bird'");

			// Update
			stmt.executeUpdate("UPDATE training.pets SET name = 'Balltze' WHERE id = 1");
			// 2) Write a program for preparedstatement for doing below operations with
			// positional param
			// insert
			PreparedStatement pstmt1 = con.prepareCall("INSERT INTO training.pets values(?, ?, ?)");
			pstmt1.setInt(1, 5);
			pstmt1.setString(2, "Bippo");
			pstmt1.setString(3, "Hamster");
			pstmt1.executeUpdate();

			// select
			PreparedStatement pstmt2 = con.prepareCall("SELECT name, type FROM training.pets WHERE type = ?");
			pstmt2.setString(1, "Cat");
			pstmt2.executeUpdate();
			pstmt2.executeUpdate();

			// Update
			PreparedStatement pstmt3 = con.prepareCall("UPDATE training.pets SET name = ? WHERE id = ?");
			pstmt3.setString(1, "Fluffy");
			pstmt3.setInt(2, 4);
			pstmt3.executeUpdate();

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}

	public static void Procedure() {

		// 3) Write a program for calling a procedure.
		Connection con = null;
		try {
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/training", "root", "root");
			CallableStatement cstmt = con.prepareCall("{call petcheck(?)}");

			cstmt.setInt(1, 5);

			cstmt.execute();

			System.out.println("Completed");

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}

	public static void ResultSetAndMetaData() {
		// 4) Write a program for Resultset metadata and Database metadata

		Connection con = null;
		PreparedStatement pstmt = null;
		try {
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/training", "root", "root");

			DatabaseMetaData dbData = con.getMetaData();

			System.out.println(dbData.getDatabaseProductName());
			System.out.println(dbData.getDatabaseMajorVersion());
			System.out.println(dbData.getDriverName());
			System.out.println(dbData.getSchemas());

			pstmt = con.prepareStatement("SELECT * FROM pets WHERE id = 1");
			ResultSet rs = pstmt.executeQuery();
			while (rs.next()) {
				ResultSetMetaData rsData = rs.getMetaData();
				System.out.println(rsData.getColumnCount());
				System.out.println(rsData.getColumnName(1) + " " + rsData.getColumnTypeName(1));
				System.out.println(rsData.getColumnName(2) + " " + rsData.getColumnTypeName(2));
			}

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}

	public static void TransactionManagement() {

		// 5) Write a program for transaction management.
		Connection con = null;

		try {
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/training", "root", "root");

			con.setAutoCommit(false);

			PreparedStatement pstmt = con.prepareCall("INSERT INTO training.pets values(?, ?, ?)");

			pstmt.setInt(1, 5);
			pstmt.setString(2, "Bippo");
			pstmt.setString(3, "Hamster");
			pstmt.executeUpdate();

			System.out.println(pstmt.executeUpdate());

			pstmt = con.prepareCall("INSERT INTO training.pet_owners values(?, ?)");
			pstmt.setInt(1, 5);
			pstmt.setString(2, "Mike");

			System.out.println(pstmt.executeUpdate());

			con.commit();

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				con.rollback();
			} catch (SQLException e1) {
				e1.printStackTrace();
			}
			try {
				con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}

	public static void BatchProcessing() {

		// 6) Write a program for batch proceesing using statement and prepared stat
		Connection con = null;
		try {
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/training", "root", "root");
			PreparedStatement pstmt = con.prepareCall("INSERT INTO training.pets values(?, ?, ?)");

			// batch
			pstmt.setInt(1, 5);
			pstmt.setString(2, "Bippo");
			pstmt.setString(3, "Hamster");
			pstmt.addBatch();

			// batch
			pstmt.setInt(1, 6);
			pstmt.setString(2, "Biscuit");
			pstmt.setString(3, "Hamster");
			pstmt.addBatch();

			// batch execution
			pstmt.executeBatch();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
}
