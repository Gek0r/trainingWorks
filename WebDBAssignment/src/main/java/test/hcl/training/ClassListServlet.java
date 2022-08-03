package test.hcl.training;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/classlist")
public class ClassListServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;

	@Override
	public void init() {
		System.out.println("ListServlet init activated");
	}

	@Override
	public void doPost(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException {
		PrintWriter out = res.getWriter();
		res.setContentType("text/html");
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/training", "root", "root");
			PreparedStatement pst = conn
					.prepareStatement("SELECT `user_name`, `gender`, `language`, `length` FROM `training`.`classes`");
			System.out.println(pst);
			ResultSet rs = pst.executeQuery();
			out.println("Name Gender Languages Length </br>");
			while (rs.next()) {
				out.println(rs.getString("user_name") + " " + rs.getString("gender") + " " + rs.getString("language")
						+ " " + rs.getString("length") + "</br>");
			}
			out.println("Classes in database");

		} catch (SQLException | ClassNotFoundException e) {
			e.printStackTrace();
		}
		out.close();
	}
}
