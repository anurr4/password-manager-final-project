package final_project_package;

import java.io.IOException;
import java.util.List;

/**
 *
 * @author anurra
 */
public interface FileOperations {
    void writePasswords(List<PasswordEntry> passwords) throws IOException;
    List<PasswordEntry> readPasswords() throws IOException;
}
