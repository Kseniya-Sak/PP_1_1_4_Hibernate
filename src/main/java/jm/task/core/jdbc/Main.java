package jm.task.core.jdbc;

import jm.task.core.jdbc.model.User;
import jm.task.core.jdbc.service.UserService;
import jm.task.core.jdbc.service.UserServiceImpl;
import jm.task.core.jdbc.util.Util;

import java.util.List;

public class Main {
    public static void main(String[] args) {

        UserService service = new UserServiceImpl();
//        service.createUsersTable();
//        service.saveUser("Mari", "Ivanova", (byte) 24);
//        service.saveUser("Sveta", "Pavlova", (byte) 19);
//        service.saveUser("Max", "Volkov", (byte) 35);
//        service.saveUser("Nikita", "Morozov", (byte) 11);
//
//        List<User> users = service.getAllUsers();
//
//        service.cleanUsersTable();
        service.createUsersTable();
        Util.close();
    }
}
