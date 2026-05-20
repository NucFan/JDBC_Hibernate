package jm.task.core.jdbc;

import jm.task.core.jdbc.service.UserService;
import jm.task.core.jdbc.service.UserServiceImpl;

public class Main {
    public static void main(String[] args) {
        UserService userService = new UserServiceImpl();
        userService.createUsersTable();
        userService.saveUser("Alex", "Kraev", (byte) 37);
        userService.saveUser("Igor", "Petrov", (byte) 24);
        userService.saveUser("Viktor", "Ivanov", (byte) 45);
        userService.saveUser("Oleg", "Sidorov", (byte) 18);
        System.out.println((userService.getAllUsers()).toString());
        userService.cleanUsersTable();
        userService.dropUsersTable();




        // реализуйте алгоритм здесь
    }
}
