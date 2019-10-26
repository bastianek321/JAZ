package pl.pjwstk.edu.jazapp.webapp;

public class User {
    private String name;
    private String surname;
    private String password;
    private String username;
    private String email;
    private String birthdate;

    public User(String name, String surname, String password, String username, String email, String birthdate) {
        this.name = name;
        this.surname = surname;
        this.password = password;
        this.username = username;
        this.email = email;
        this.birthdate = birthdate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(String birthdate) {
        this.birthdate = birthdate;
    }
}
