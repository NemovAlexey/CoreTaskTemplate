package jm.task.core.jdbc;

import jm.task.core.jdbc.service.UserServiceImpl;

public class Main {
    public static void main(String[] args) {
        UserServiceImpl us = new UserServiceImpl();
        us.createUsersTable();
        for (int i = 1; i <= 4; i++) {
            us.saveUser("Name" + i, "lastName" + i, (byte) (30 + i));
            System.out.printf("User с именем – %s добавлен в базу данных\n",
                    us.getAllUsers().get(us.getAllUsers().size() - 1).getName());
        }
        us.getAllUsers().forEach(System.out::println);
        us.cleanUsersTable();
        us.dropUsersTable();
    }
}
