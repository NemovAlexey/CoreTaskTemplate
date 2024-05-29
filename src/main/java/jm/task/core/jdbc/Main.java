package jm.task.core.jdbc;

import jm.task.core.jdbc.service.UserService;
import jm.task.core.jdbc.service.UserServiceImpl;

public class Main {
    public static void main(String[] args) {
        UserService userService = new UserServiceImpl();
        userService.dropUsersTable();
        userService.createUsersTable();
        for (int i = 0; i <= 3; i++) {
            userService.saveUser("Aleksei" + i, "Nemov" + i, (byte) (30 + i));
            System.out.printf("User с именем – %s добавлен в базу данных\n",
                    userService.getAllUsers().get(i).getName());
        }
        userService.getAllUsers().forEach(System.out::println);
        userService.cleanUsersTable();
        userService.dropUsersTable();
    }
}
