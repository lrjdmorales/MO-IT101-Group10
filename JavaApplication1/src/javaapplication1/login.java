package javaapplication1;

import java.io.Console;

public class login {

    private static final String USERNAME = "testuser";
    private static final String PASSWORD = "Test@123";

    public static void main(String[] args) {
        Console console = System.console();

        if (console == null) {
            System.err.println("No console.");
            System.exit(1);
        }

        String username = console.readLine("Enter username: ");
        char[] passwordArray = console.readPassword("Enter password: ");
        String password = new String(passwordArray);

        if (authenticate(username, password)) {
            System.out.println("Login successful! Welcome, " + username + ".");
        } else {
            System.out.println("Invalid username or password. Please try again.");
        }
    }

    private static boolean authenticate(String username, String password) {
        return username.equals(USERNAME) && password.equals(PASSWORD);
    }
}
