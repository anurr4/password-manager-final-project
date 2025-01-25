package final_project_package;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class UserRegistration {
    public static boolean registerUser(String username, String email, String password, String confirmPassword){
        if (!Validator.isValidEmail(email)) {
            System.out.println("Invalid email format.");
            return false;
        }

        if (!Validator.isValidPassword(password)) {
            System.out.println("Password must be at least 8 characters long and include an uppercase letter, a lowercase letter, a digit, and a special character.");
            return false;
        }
        
        if(!password.equals(confirmPassword)){
            System.out.println("Passwords do not match");
            return false;
        }
        String userDirectoryPath = "Database/" + username;
        File userDirectory = new File(userDirectoryPath);
        if(userDirectory.exists()){
            System.out.println("User already exists");
            return false;
        }
        if(userDirectory.mkdirs()){
            try(FileWriter writer = new FileWriter(userDirectoryPath + "/credentials.txt")){
                writer.write("Username: "+ username + "\n");
                writer.write("Email: "+ email + "\n");
                writer.write("Password: "+ password + "\n");
                System.out.println("User registered successfully");
                return true;
            } catch(IOException e){
                System.out.println("Error writing credentials: " + e.getMessage());
            }
        } else {
            System.out.println("Failed to create user directory.");
        }
        return false;
    }
}
