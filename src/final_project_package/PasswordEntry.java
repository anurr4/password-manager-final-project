package final_project_package;

public class PasswordEntry implements Searchable {
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
    
    @Override
    public boolean matchesSearchTerm(String searchTerm){
        String cleanSearch = searchTerm.trim().toLowerCase();
        return this.platform.toLowerCase().contains(cleanSearch) ||
               this.username.toLowerCase().contains(cleanSearch) ||
               this.email.toLowerCase().contains(cleanSearch);
    }
}
