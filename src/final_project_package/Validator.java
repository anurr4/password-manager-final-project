package final_project_package;
import java.util.regex.Pattern;

public class Validator {
    public static boolean isValidEmail(String email){
        String emailRegex = "^[\\w-\\.]+@([\\w-]+\\.)+[\\w-]{2,4}$";
        return Pattern.matches(emailRegex, email);
    }
    public static boolean isValidPassword(String password){
        String passwordRegex = "^(?=.*\\d)(?=.*[a-z])(?=.*[A-Z])(?=.*[a-zA-Z]).{8,}$";
        return Pattern.matches(passwordRegex, password);
    }
}
