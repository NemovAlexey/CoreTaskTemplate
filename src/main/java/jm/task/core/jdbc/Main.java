package jm.task.core.jdbc;

import jm.task.core.jdbc.service.UserServiceImpl;

public class Main {
    public static void main(String[] args) {
        UserServiceImpl us = new UserServiceImpl();
        us.dropUsersTable();
        us.createUsersTable();
        for (int i = 0; i <= 3; i++) {
            us.saveUser("Aleksei" + i, "Nemov" + i, (byte) (30 + i));
            System.out.printf("User с именем – %s добавлен в базу данных\n",
                    us.getAllUsers().get(i).getName());
        }
        us.getAllUsers().forEach(System.out::println);
        us.cleanUsersTable();
        us.dropUsersTable();
    }
}
