package com.strs;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserValidationRegex {

    // Custom Exception for Username
    static class InvalidUsernameException extends Exception {
        InvalidUsernameException(String message) {
            super(message);
        }
    }

    // Custom Exception for Password
    static class InvalidPasswordException extends Exception {
        InvalidPasswordException(String message) {
            super(message);
        }
    }

    public static void main(String[] args) {

        System.out.println("Program started");

        // Username regex: letters only, one or two words, min 5 characters
        String usernameRegex = "^(?=.{5,}$)[A-Za-z]+(\\s[A-Za-z]+)?$";
        Pattern usernamePattern = Pattern.compile(usernameRegex);

        // Password regex: 8–20 chars, upper, lower, digit, special, no spaces
        String passwordRegex =
                "^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)(?=.*[!@#$%^&*()\\-+_])(?=\\S+$).{8,20}$";
        Pattern passwordPattern = Pattern.compile(passwordRegex);

        Scanner scanner = new Scanner(System.in);

        try {
            // Username input
            System.out.print("Enter username: ");
            String username = scanner.nextLine().trim().replaceAll("\\s+", " ");

            validateUsername(username, usernamePattern);
            System.out.println("Username is valid");

            // Password input
            System.out.print("Enter password: ");
            String password = scanner.nextLine();

            validatePassword(password, passwordPattern);
            System.out.println("Password is valid");

        } catch (InvalidUsernameException | InvalidPasswordException e) {
            System.out.println("Validation Error: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }

    // Username validation method
    private static void validateUsername(String username, Pattern pattern)
            throws InvalidUsernameException {

        Matcher matcher = pattern.matcher(username);
        if (!matcher.matches()) {
            throw new InvalidUsernameException(
                    "Username must be at least 5 characters, letters only, " +
                    "and may contain one space"
            );
        }
    }

    // Password validation method
    private static void validatePassword(String password, Pattern pattern)
            throws InvalidPasswordException {

        Matcher matcher = pattern.matcher(password);
        if (!matcher.matches()) {
            throw new InvalidPasswordException(
                    "Password must be 8–20 characters with uppercase, lowercase, " +
                    "digit, special character and no spaces"
            );
        }
    }
}
