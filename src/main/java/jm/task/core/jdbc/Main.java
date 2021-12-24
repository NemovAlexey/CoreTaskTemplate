package jm.task.core.jdbc;

import jm.task.core.jdbc.model.User;
import jm.task.core.jdbc.service.UserServiceImpl;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        UserServiceImpl userService = new UserServiceImpl();
        userService.createUsersTable();
        List<User> list;
        for (int i = 1; i <= 4; i++) {
            userService.saveUser("Name" + i, "lastName" + i, (byte) (30 + i));
            list = userService.getAllUsers();
            System.out.printf("User с именем – %s добавлен в базу данных\n", list.get(list.size() - 1).getName());
        }
        userService.getAllUsers().forEach(System.out::println);
        userService.cleanUsersTable();
        userService.dropUsersTable();
    }
}
