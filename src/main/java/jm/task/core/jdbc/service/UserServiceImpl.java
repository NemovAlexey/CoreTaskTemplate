package jm.task.core.jdbc.service;

import jm.task.core.jdbc.dao.UserDaoHibernateImpl;
import jm.task.core.jdbc.model.User;

import java.util.List;

public class UserServiceImpl implements UserService {
    @Override
    public void createUsersTable() {
        new UserDaoHibernateImpl().createUsersTable();
    }

    @Override
    public void dropUsersTable() {
        new UserDaoHibernateImpl().dropUsersTable();
    }

    @Override
    public void saveUser(String name, String lastName, byte age) {
        new UserDaoHibernateImpl().saveUser(name, lastName, age);
    }

    @Override
    public void removeUserById(long id) {
        new UserDaoHibernateImpl().removeUserById(id);
    }

    @Override
    public List<User> getAllUsers() {
        return new UserDaoHibernateImpl().getAllUsers();
    }

    @Override
    public void cleanUsersTable() {
        new UserDaoHibernateImpl().cleanUsersTable();
    }
}
