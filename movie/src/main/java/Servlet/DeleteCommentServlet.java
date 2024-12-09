package Servlet;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import Services.CommentService;

@WebServlet("/DeleteCommentServlet")
public class DeleteCommentServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // Fetch the comment ID from the form
        int commentId = Integer.parseInt(request.getParameter("commentId"));

        // Delete the comment using the service
        CommentService commentService = new CommentService();
        try {
			commentService.deleteComment(commentId);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

        // Redirect to the page displaying the movie's comments
        String movieName = request.getParameter("movieName");
        response.sendRedirect("ViewCommentsServlet?movieName=" + movieName);
    }
}