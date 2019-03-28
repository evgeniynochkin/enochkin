package main;

import accounts.AccountService;
import servelets.SignInServlet;
import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.servlet.ServletContextHandler;
import org.eclipse.jetty.servlet.ServletHolder;
import servelets.SignUpServlet;

public class Main {

    public static void main(String[] args) throws Exception {

        AccountService accountService = new AccountService();

        ServletContextHandler sch = new ServletContextHandler(ServletContextHandler.SESSIONS);
        sch.addServlet(new ServletHolder(new SignUpServlet(accountService)), "/signup");
        sch.addServlet(new ServletHolder(new SignInServlet(accountService)), "/signin");

        Server server = new Server(8080);
        server.setHandler(sch);

        server.start();
        java.util.logging.Logger.getGlobal().info("Server started");
        server.join();
    }
}
