import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;

@WebServlet("/dv")
public class Main extends GenericServlet {
	@Override
	public void service(ServletRequest req, ServletResponse resp) throws ServletException, IOException {
		String name = req.getParameter("nm");
		String place=req.getParameter("pl");
		PrintWriter pr = resp.getWriter();
		pr.println("<html><body bgcolor='yellow'>" + "<h1>Dabba Fellow " +name+" and "+place+ "</h1>" + "</body></html>");
	}

}
