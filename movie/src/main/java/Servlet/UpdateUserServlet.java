package Servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import Model.UpdateUserModel;
import Services.UserServices;


@WebServlet("/UpdateUserServlet")
public class UpdateUserServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public UpdateUserServlet() {
		super();
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		UpdateUserModel uum = new UpdateUserModel();

		uum.setUsername(request.getParameter("username"));
		uum.setNewname(request.getParameter("nwname"));
		uum.setNewpassword(request.getParameter("nwpassword"));   
		uum.setNewdob(request.getParameter("nwdob"));

		UserServices service = new UserServices();
		service.updateUser(uum);

		RequestDispatcher dis = request.getRequestDispatcher("login.jsp");
		dis.forward(request, response);
	}
}

