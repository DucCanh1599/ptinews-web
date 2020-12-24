package controller.admin;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = {"/admin/users"})
public class UserController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) 
			throws ServletException, IOException {
		String action = req.getParameter("action");
		if(action != null && action.equals("edit")) {
			RequestDispatcher rd = req.getRequestDispatcher("/views/admin/user_form.jsp");
			rd.forward(req, resp);
		}
		RequestDispatcher rd = req.getRequestDispatcher("/views/admin/user_list.jsp");
		rd.forward(req, resp);
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) 
			throws ServletException, IOException {
		
	}
}
