package servelets;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

import accounts.AccountService;
import com.google.gson.Gson;

public class SingInServlet extends HttpServlet {

    private final AccountService accountService;

    public SingInServlet(AccountService accountService) { this.accountService = accountService; }

    public void toGet(HttpServletRequest request, HttpServletResponse response) {

    }

    public void toPost(HttpServletRequest request, HttpServletResponse response)
        throws IOException {

        String login = request.getParameter("login");

//        Gson gson = new Gson();

        if (accountService.getLogin().compareTo(login) == 0) {
//            String json = gson.toJson("Authorized: " + login);
            response.setContentType("text/html;charset=utf-8");
            response.getWriter().println("Authorized: " + login);
            response.setStatus(HttpServletResponse.SC_OK);
        } else {
//            String json = gson.toJson("Unauthorized");
            response.setContentType("text/html;charset=utf-8");
            response.getWriter().println("Unauthorized");
            response.setStatus(HttpServletResponse.SC_UNAUTHORIZED);
        }
    }
}
