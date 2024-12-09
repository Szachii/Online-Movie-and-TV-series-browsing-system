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

import Model.UpdateModel;
import Services.MovieService;

@WebServlet("/UpdateMovie")
@MultipartConfig(maxFileSize = 16177215) 
public class UpdateMovie extends HttpServlet {
    private static final long serialVersionUID = 1L;

    public UpdateMovie() {
        super();
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) 
            throws ServletException, IOException {
        
    
        UpdateModel upMod = new UpdateModel();

       
        upMod.setTitle(request.getParameter("title"));
        

        upMod.setNewtitle(request.getParameter("newtitle"));
        upMod.setNewGenre(request.getParameter("newgenre"));
        upMod.setNewtype(request.getParameter("newtype"));
        upMod.setNewdec(request.getParameter("newdec"));

        String newYearParam = request.getParameter("newyear");
        if (newYearParam != null && !newYearParam.isEmpty()) {
            try {
                upMod.setNewYear(Integer.parseInt(newYearParam));
            } catch (NumberFormatException e) {
                e.printStackTrace();
                upMod.setNewYear(0); 
            }
        } else {
            upMod.setNewYear(0);
        }

        Part filePart = request.getPart("newimg"); 
        if (filePart != null && filePart.getSize() > 0) {
            InputStream imageStream = filePart.getInputStream(); 
            upMod.setNewimg(imageStream);
        }

        MovieService service = new MovieService();
        service.updateData(upMod);

        RequestDispatcher dis = request.getRequestDispatcher("home.jsp");
        dis.forward(request, response);
    }
}
