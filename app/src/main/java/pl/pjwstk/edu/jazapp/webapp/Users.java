package pl.pjwstk.edu.jazapp.webapp;

import javax.enterprise.context.ApplicationScoped;
import java.util.ArrayList;
import java.util.List;


// klase zostawiam do oceny lokalnego zapisu uzytkownikow, poniewaz przesiadlem sie na JPA
@ApplicationScoped
public class Users {

    private List<User> users = new ArrayList<User>();


    boolean checkIfUsernameExists(String username){

        for (User user : users) {
            return user.getUsername().equals(username);
        }
        return false;
    }

    void addToDatabase(User user){
        users.add(user);
    }

    public String checkPassword(String username){
        String tmp = "Password invalid";
        for(User user : users){
            if(user.getUsername().equals(username)){
                tmp = user.getPassword();
            }
        }
        return tmp;
    }

    public String getName(String username){
        for (User user : users) {
            if(username.equals(user.getUsername())){
                return user.getName();
            }
        }
        return "Użytkownik o podanym loginie nie istnieje.";
    }

    public String getSurname(String username){
        for (User user : users) {
            if(username.equals(user.getUsername())){
                return user.getSurname();
            }
        }
        return "Użytkownik o podanym loginie nie istnieje.";
    }


}
