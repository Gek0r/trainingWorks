package test.hcl.training;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;


import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/registration")
public class RegistrationServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	@Override
	public void init() {
		System.out.println("RegistrationServlet init activated");
	}
	@Override
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException {
		PrintWriter out = new PrintWriter("");
		String userName = req.getParameter("username");
		String gender = req.getParameter("password");
		String[] language = req.getParameterValues("language");
		String selLang = "";
		for(String lang : language) {
			selLang = selLang + lang + " ";
		}
		String length = req.getParameter("length");

		if (userName == null || gender == null || language == null || length == null) {
			res.sendRedirect("./failure.html");
		} else {
			try {
				Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/training", "root", "root");
				PreparedStatement pst = conn.prepareStatement(
						"INSERT INTO `training`.`classes` (`user_name`, `gender`, `language`, `length`) VALUES ( ? , ? , ? , ?)");
				pst.setString(1, userName);
				pst.setString(2, gender);
				pst.setString(3, selLang);
				pst.setString(4, length);

				pst.executeQuery();
				out.println("Class added to database");
				
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		out.close();
	}

}
