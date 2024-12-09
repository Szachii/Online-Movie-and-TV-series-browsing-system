 package Servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Model.QAModel;
import Services.QAService;

@WebServlet("/ShowFAQServlet")
public class ShowFAQServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doGet(HttpServletRequest request, HttpServletResponse response) 
            throws ServletException, IOException {
        QAService qaService = new QAService();
        List<QAModel> faqList = qaService.showData(); // Get the list of FAQs from the service.

        // Set the FAQ list in the request scope to be accessed by the JSP page.
        request.setAttribute("faqList", faqList);

        // Forward the request to faq.jsp to display the FAQs.
        request.getRequestDispatcher("faq.jsp").forward(request, response);
    }
}

