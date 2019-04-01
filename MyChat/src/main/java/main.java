import chat.WebSocketChatServlet;
import org.eclipse.jetty.server.Handler;
import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.server.handler.HandlerList;
import org.eclipse.jetty.server.handler.ResourceHandler;
import org.eclipse.jetty.servlet.ServletContextHandler;
import org.eclipse.jetty.servlet.ServletHolder;

public class main {

    public static void main(String[] args) {

        Server server = new Server(8080); //Создаем сервер на порту 8080
        ServletContextHandler sch = new ServletContextHandler(ServletContextHandler.SESSIONS); //Создаем обработчик ситуаций в сервлетах

        sch.addServlet(new ServletHolder(new WebSocketChatServlet()), "/chat"); //Добавляем слушатель сервлета WebSocketChatServlet на странице chat

        ResourceHandler resHendler = new ResourceHandler(); //Создаем обработчик ресурсов
        resHendler.setDirectoriesListed(true); //
        resHendler.setResourceBase("public_html"); //

        HandlerList hadList = new HandlerList(); //
        hadList.setHandlers(new Handler[]{resHendler, sch}); //
        server.setHandler(hadList); //Добавляем на сервер слушатель обработчика

        server.start(); //Запускаем сервер
        java.util.logging.Logger.getGlobal().info("Server started"); //Выводим системное сообщение о запущеном сервере
        server.join(); //
    }
}
