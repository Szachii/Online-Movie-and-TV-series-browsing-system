package Servlet;

import java.io.IOException;
import java.io.InputStream;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Model.AddUserModel;
import Services.UserServices;

@WebServlet("/ProfileImageServlet")
public class ProfileImageServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String username = request.getParameter("username");

        UserServices userService = new UserServices();
        try {
            AddUserModel user = userService.getUserDetails(username);
            InputStream imageStream = user.getImage();

                imageStream.close();
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

