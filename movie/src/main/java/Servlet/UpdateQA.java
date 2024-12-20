  package Servlet;

import java.io.IOException;
import java.io.InputStream;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;

import Model.QAUpdateModel;
import Services.QAService;
 
@WebServlet("/UpdateQA")
 
public class UpdateQA extends HttpServlet {
    private static final long serialVersionUID = 1L;

    public UpdateQA() {
        super();
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) 
            throws ServletException, IOException {
        
    
    	QAUpdateModel upMod = new QAUpdateModel();

       
    	upMod.setQAID(request.getParameter("id"));
        

        upMod.setNewquestion(request.getParameter("newque"));
        upMod.setNewanswer(request.getParameter("newans"));
        

        

        QAService service = new QAService();
        service.updateData(upMod);

        RequestDispatcher dis = request.getRequestDispatcher("SuceesfulUpdate.jsp");
        dis.forward(request, response);
    }
}

