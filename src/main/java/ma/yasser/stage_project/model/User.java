package ma.yasser.stage_project.model;

public class User {
    private String email;
    private String password;

    // 🔹 constructeur vide
    public User() {}

    // 🔹 constructeur avec paramètres
    public User(String email, String password) {
        this.email = email;
        this.password = password;
    }

    // 🔹 getters et setters
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
}
