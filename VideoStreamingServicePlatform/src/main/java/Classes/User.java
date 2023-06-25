/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Classes;

public abstract class User {

    /*The User class is an abstract class representing a user. It has three private instance variables: username, password, and email.*/
    private String username;
    private String password;
    private String email;

    /*The constructor User is used to create instances of the User class. It takes parameters for the username, password, and email, and initializes the corresponding instance variables.*/
    public User(String username, String password, String email) {
        this.username = username;
        this.password = password;
        this.email = email;
    }

    /*The setUsername, setPassword, and setEmail methods are setter methods used to update the values of the username, password, and email instance variables, respectively.*/
    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    /*The getUsername, getPassword, and getEmail methods are getter methods used to access the values of the username, password, and email instance variables, respectively.*/
    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public String getEmail() {
        return email;
    }

}
