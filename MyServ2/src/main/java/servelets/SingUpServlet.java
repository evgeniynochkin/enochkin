package servelets;
import accounts.AccountService;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class SingUpServlet extends HttpServlet {

    private final AccountService accountService;

    public SingUpServlet(AccountService accountService) { this.accountService = accountService; }

    public void toGet(HttpServletRequest request, HttpServletResponse response) {

    }

    public void toPost(HttpServletRequest request, HttpServletResponse response) {

        String login = request.getParameter("login");
        String password = request.getParameter("password");

        accountService.setLogin(login);
        if (password != null) {
            accountService.setPassword(password);
        } else {
            accountService.setPassword(login);
        }
    }
}
