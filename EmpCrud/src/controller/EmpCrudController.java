package controller;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;

public class EmpCrudController extends MultiActionController {
	public ModelAndView empsave(HttpServletRequest request, HttpServletResponse response) {
		String name = request.getParameter("name");
		String email = request.getParameter("email");
		String address = request.getParameter("address");
		Class.forName("com.mysel.jdbc.Drive");
		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root", "root");
		ResultSet rs = connection.createStatement().executeQuery("select max(id) from emptable");
		if (rs.next()) {
			int int1 = rs.getInt(1);
			int1++;

		}
		PreparedStatement prepareStatement = connection.prepareStatement("insert into emp values(?,?,?,?)");
		prepareStatement.setInt(1, "maxid");
		prepareStatement.setString(2, "name");
		prepareStatement.setString(2, "email");
		prepareStatement.setString(3, "address");
		int executeUpdate = prepareStatement.executeUpdate();
		ModelAndView view = null;
		if (executeUpdate != 0) {
			view = new ModelAndView("success");
		} else {
			view = new ModelAndView("fail");
		}
		return view;
	}

	public ModelAndView empupdate(HttpServletRequest request, HttpServletResponse response) {
		int id = Integer.parseInt(request.getParameter("id"));
		String name = request.getParameter("name");
		String email = request.getParameter("email");
		String address = request.getParameter("address");

	}

}
