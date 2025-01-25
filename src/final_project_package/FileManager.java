package final_project_package;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author anurra
 */
public class FileManager implements FileOperations{
    private final File passwordFile;

    public FileManager(String userDirectory) {
        File dir = new File(userDirectory);
        if (!dir.exists()) {
            dir.mkdirs(); // Create the directory if it doesn't exist
        }

        // Set the correct file path for passwords.txt
        this.passwordFile = new File(dir, "passwords.txt");

        // Ensure the passwords.txt file exists
        try {
            if (!passwordFile.exists()) {
                passwordFile.createNewFile();
            }
        } catch (IOException e) {
            System.err.println("Error creating password file: " + e.getMessage());
        }
    }

    @Override
    public void writePasswords(List<PasswordEntry> passwords) throws IOException {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(passwordFile))) {
            for (PasswordEntry entry : passwords) {
                writer.write(String.join(",", entry.getPlatform(), entry.getUsername(), entry.getEmail(), entry.getPassword()));
                writer.newLine();
            }
        }
    }

    @Override
    public List<PasswordEntry> readPasswords() throws IOException {
        List<PasswordEntry> passwords = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(passwordFile))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(",");
                if (parts.length == 4) {
                    passwords.add(new PasswordEntry(parts[0], parts[1], parts[2], parts[3]));
                }
            }
        }
        return passwords;
    }
}
