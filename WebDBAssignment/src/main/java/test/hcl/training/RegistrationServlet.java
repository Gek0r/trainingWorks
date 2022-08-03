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
	public void doPost(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException {
		PrintWriter out = res.getWriter();
		String userName = req.getParameter("username");
		String gender = req.getParameter("gender");
		String[] language = req.getParameterValues("language");
		String selLang = "";
		for(String lang : language) {
			selLang = selLang + lang + " ";
		}
		String length = req.getParameter("length");

		if (userName == null || gender == null || selLang == null || length == null) {
			res.sendRedirect("./html/failure.html");
			
		} else {
			try {
				Class.forName("com.mysql.cj.jdbc.Driver");
				Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/training", "root", "root");
				PreparedStatement pst = conn.prepareStatement(
						"INSERT INTO `training`.`classes` (`user_name`, `gender`, `language`, `length`) VALUES ( ? , ? , ? , ?)");
				pst.setString(1, userName);
				pst.setString(2, gender);
				pst.setString(3, selLang);
				pst.setString(4, length);

				pst.executeUpdate();
				out.println("Class added to database");
				
			} catch (SQLException e) {
				e.printStackTrace();
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			}
		}
		out.close();
	}

}
