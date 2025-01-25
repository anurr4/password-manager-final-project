/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package final_project_package;

/**
 *
 * @author anurra
 */
public class PasswordEntry {
    private String platform;
    private String username;
    private String email;
    private String password;

    public PasswordEntry(String platform, String username, String email, String password) {
        this.platform = platform;
        this.username = username;
        this.email = email;
        this.password = password;
    }

    public String getPlatform() {
        return platform;
    }

    public String getUsername() {
        return username;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public void setPlatform(String platform) {
        this.platform = platform;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
