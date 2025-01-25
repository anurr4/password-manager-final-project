package final_project_package;

import java.util.Random;

public class PasswordGenerator extends AbstractPasswordGenerator {
       
       private final Random random;
       public PasswordGenerator(){random = new Random();}
       
       @Override
       public String generatePassword(int length, boolean includeUppercase, boolean includeLowercase, boolean includeNumbers, boolean includeSymbols){
           StringBuilder passwordBuilder = new StringBuilder();
           
           String validCharacters = "";
           if(includeUppercase) validCharacters += UPPERCASE_CHARACTERS;
           if(includeLowercase) validCharacters += LOWERCASE_CHARACTERS;
           if(includeNumbers) validCharacters += NUMBERS;
           if(includeSymbols) validCharacters += SPECIAL_CHARACTERS;
           
           for(int i = 0; i < length; i++){
               int randomIndex = random.nextInt(validCharacters.length());
               char randomChar = validCharacters.charAt(randomIndex);
               
               passwordBuilder.append(randomChar);
           }
           return passwordBuilder.toString();
       }
}
