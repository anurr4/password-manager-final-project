package final_project_package;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
/**
 *
 * @author anurra
 */
public class UserLogin {
    public static boolean loginUser(String username, String password){
        String userDirectoryPath = "Database/" + username;
        File credentialsFile = new File(userDirectoryPath + "/credentials.txt");
        
        if(!credentialsFile.exists()){
            System.out.println("User does not exist.");
            return false;
        }
        try(BufferedReader reader = new BufferedReader(new FileReader(credentialsFile))){
            String line;
            while((line = reader.readLine()) != null){
                if(line.startsWith("Password: ")){
                    String storedPassword = line.substring(10); //extract the password from the file
                    return storedPassword.equals(password);
                }
            }
        } catch(IOException e){
            System.out.println("Error reading credentials: " + e.getMessage());
        }
        return false;
    }
}
