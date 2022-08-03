package test.hcl.training;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/login")
public class LoginServlet extends HttpServlet {
	
	@Override
	public void init() {
		System.out.println("LoginServlet init activated");
	}
	
	private static final long serialVersionUID = 1L;
	@Override
	public void doPost(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException {
		String userName = req.getParameter("username");
		String password = req.getParameter("password");
		
		res.setContentType("text/html");
		
		boolean validLogin = true;
		
		if (userName == null || password == null) {
			validLogin = false;
		}

		if (validLogin) {
			try {
				Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/training", "root", "root");
				PreparedStatement pst = conn.prepareStatement("SELECT * FROM `training`.`users` WHERE `user_name` = ? and `password` = ?");
				pst.setString(1, userName);
				pst.setString(1, password);

				ResultSet rs = pst.executeQuery();

				if (rs.next()) {
					RequestDispatcher rd = req.getRequestDispatcher("./success.html");
					rd.forward(req, res);
				}else {
					res.sendRedirect("./failure.html");
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		} else {
			res.sendRedirect("./failure.html");
		}
		
		

	}

}
