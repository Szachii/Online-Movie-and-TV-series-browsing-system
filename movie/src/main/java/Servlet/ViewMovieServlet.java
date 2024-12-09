package Servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Model.MovieModel;
import Services.MovieService;

@WebServlet("/ViewMovieServlet")
public class ViewMovieServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // Get the movie title or ID from the request
        String title = request.getParameter("title");
        
        MovieService movieService = new MovieService();
        try {
            // Retrieve the movie details based on the title
            MovieModel movie = movieService.getMovieByTitle(title);
            
            if (movie != null) {
                // Store the movie details in request attributes
                request.setAttribute("movie", movie);
                
                // Forward to the movie details page (viewmovie.jsp)
                request.getRequestDispatcher("viewmovie.jsp").forward(request, response);
            } else {
                // If the movie is not found, redirect to an error page or show an error message
                request.setAttribute("errorMessage", "Movie not found.");
                request.getRequestDispatcher("error.jsp").forward(request, response);
            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
            request.setAttribute("errorMessage", "Error retrieving movie details.");
            request.getRequestDispatcher("error.jsp").forward(request, response);
        }
    }
}
