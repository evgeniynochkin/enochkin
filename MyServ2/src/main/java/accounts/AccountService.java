package accounts;

import dbservice.DBException;
import dbservice.DBService;

public class AccountService {

    DBService dbService = new DBService();

    //Добавление пользователя в БД
    public void addNewUser(String login, String password) {
        try {
            long userId = dbService.addUser(login, password);
            System.out.println("Added user id: " + userId);
        } catch (DBException e) {
            e.printStackTrace();
        }
    }

    //Получение логина и пароля
    public UserProfile getUser(String login) {
        try {
            String password = dbService.getUser(login).getPassword();
            return new UserProfile(login, password);
        } catch (DBException e) {
            e.printStackTrace();
        }
        return null;
    }
}
