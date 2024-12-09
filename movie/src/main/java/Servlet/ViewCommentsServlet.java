package Servlet;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import Services.CommentService;
import Model.CommentModel;

@WebServlet("/ViewCommentsServlet")
public class ViewCommentsServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String movieName = request.getParameter("movieName");

        // Fetch comments
        CommentService commentService = new CommentService();
        ArrayList<CommentModel> comments = null;
		try {
			comments = commentService.getCommentsByMovie(movieName);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

        // Set the comments list in the request scope
        request.setAttribute("comments", comments);

        // Forward to the comment.jsp page
        request.getRequestDispatcher("comment.jsp").forward(request, response);
    }
}