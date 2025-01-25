package final_project_package;

public abstract class AbstractPasswordGenerator {
    
       public static final String LOWERCASE_CHARACTERS = "abcdefghijklmnopqrstuvwxyz";
       public static final String UPPERCASE_CHARACTERS = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
       public static final String NUMBERS = "0123456789";
       public static final String SPECIAL_CHARACTERS = "!@#$%^&*()_-=+[]{};:,.<>/?";
       
       public abstract String generatePassword(int length, boolean includeUppercase, boolean includeLowercase, boolean includeNumbers, boolean includeSymbols);
}
