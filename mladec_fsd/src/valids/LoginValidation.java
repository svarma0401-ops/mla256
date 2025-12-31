package valids;

import java.util.Scanner;

public class LoginValidation {

    public static void validateLogin(String username, String password)
            throws InvalidUsernameException, InvalidPasswordException {

      

        if (!username.equals("admin")) {
            throw new InvalidUsernameException("Invalid username.");
        }

        if (!password.equals("admin123")) {
            throw new InvalidPasswordException("Invalid password.");
        }
    }

    public static void main(String[] args) {
    	

    	 Scanner sc = new Scanner(System.in);

    	        System.out.print("Enter username: ");
    	        String username = sc.next();
    	        System.out.print("Enter password: ");
    	        String password = sc.next();

        try {
         
            validateLogin(username, password);
            System.out.println("Login successful!");
        } catch (InvalidUsernameException e) {
            System.err.println("Username error: " + e.getMessage());
        } catch (InvalidPasswordException e) {
            System.err.println("Password error: " + e.getMessage());
        }
    }
}
