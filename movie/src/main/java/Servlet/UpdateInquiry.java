package Servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Model.InquiryModel;
import Services.InquiryService;

@WebServlet("/UpdateInquiry")
public class UpdateInquiry extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public UpdateInquiry() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		InquiryModel IqMod = new InquiryModel();
        IqMod.setInqID(Integer.parseInt(request.getParameter("IqId")));
        IqMod.setInquiry(request.getParameter("inquiry"));
        IqMod.setUsername(request.getParameter("username"));

        InquiryService service = new InquiryService();
        service.insertInquiry(IqMod);

        response.sendRedirect("inquiry.jsp");
	}

}
