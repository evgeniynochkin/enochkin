package chat;


import org.eclipse.jetty.websocket.api.Session;
import org.eclipse.jetty.websocket.api.annotations.OnWebSocketClose;
import org.eclipse.jetty.websocket.api.annotations.OnWebSocketConnect;
import org.eclipse.jetty.websocket.api.annotations.OnWebSocketMessage;
import org.eclipse.jetty.websocket.api.annotations.WebSocket;

@SuppressWarnings("UnusedDeclaration") //
@WebSocket
public class ChatWebSocket {

    private ChatService chatService; //Создание ссылки на объекты ChatService
    private Session session; //Создание ссылки на объект сессии

    public ChatWebSocket(ChatService chatSertvice) { this.chatService = chatSertvice; } //Создание объекта ChatWebService и определение объекта ChatService из полученого значения

    @OnWebSocketConnect
    private void onOpen(Session session) {
        chatService.add(this);
        this.session = session;
    }

    @OnWebSocketMessage
    public void onMessage(String data) { chatService.sendMessage(data); }

    @OnWebSocketClose
    public void onClose(int statusCode, String reason) { chatService.remove(this); }

    public void sendString(String data) {
        try {
            session.getRemote().sendString(data);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
