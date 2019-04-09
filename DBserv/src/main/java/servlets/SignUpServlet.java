package servlets;

import accounts.AccountService;
import accounts.UserProfile;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.sql.SQLException;

public class SignUpServlet extends HttpServlet {

    private final AccountService accountService;

    public SignUpServlet(AccountService accountService) { this.accountService = accountService; }

    public void doPost(HttpServletRequest request, HttpServletResponse response) {

        String login = request.getParameter("login");
        String pass = request.getParameter("password");

        try {
            accountService.addNewUser(login, pass);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
