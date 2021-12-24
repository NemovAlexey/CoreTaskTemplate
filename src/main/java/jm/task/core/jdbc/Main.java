package jm.task.core.jdbc;

import jm.task.core.jdbc.service.UserServiceImpl;

public class Main {
    public static void main(String[] args) {
        UserServiceImpl userService = new UserServiceImpl();
        userService.createUsersTable();
        String name;
        for (int i = 1; i <= 4; i++) {
            name = "Name" + i;
            userService.saveUser(name, "lastName" + i, (byte) (30 + i));
            System.out.printf("User с именем – %s добавлен в базу данных\n", name);
        }
        userService.getAllUsers().forEach(System.out::println);
        userService.cleanUsersTable();
        userService.dropUsersTable();
    }
}
