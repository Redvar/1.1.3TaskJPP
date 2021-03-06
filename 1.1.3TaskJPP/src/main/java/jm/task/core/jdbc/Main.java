package jm.task.core.jdbc;

import jm.task.core.jdbc.model.User;
import jm.task.core.jdbc.service.UserService;
import jm.task.core.jdbc.service.UserServiceImpl;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        UserServiceImpl userService = new UserServiceImpl();

        userService.createUsersTable();
        userService.createUsersTable();
        userService.saveUser("Сергей", "Иванов", (byte) 56);
        userService.saveUser("Алексей", "Горчаков", (byte) 32);
        userService.saveUser("Михаил", "Васильев", (byte) 14);
        userService.saveUser("Дмитрий", "Юдин", (byte) 24);

        List<User> list = userService.getAllUsers();
        System.out.println(list);
        userService.cleanUsersTable();
        userService.dropUsersTable();
    }
}
