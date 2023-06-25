/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Classes;

/*This line specifies that the class is part of the Classes package.*/
 /*This line declares a class named Movie which extends the Content class. It means that Movie is a subclass of Content and inherits its properties and methods.*/
public class Movie extends Content {

    /*The Movie class extends the Content class, adding specific properties and methods related to movies. 
    It allows you to create Movie objects with additional attributes such as the director and leading actress, in addition to the attributes inherited from the Content class.*/
 /*These lines declare private instance variables (director and leadingActress) that store information specific to a movie, such as the director's name and the leading actress' name.*/
    private String director;
    private String leadingActress;

    /*This is the constructor of the Movie class. It takes in parameters corresponding to the movie's title, duration, genre, release date, description, director, and leading actress. 
    The super keyword is used to invoke the constructor of the superclass (Content) and pass the common attributes. The constructor initializes the instance variables of the Movie class with the provided values.*/
    public Movie(String title, int duration, String genre, String releaseDate, String description, String director, String leadingActress) {
        super(title, duration, genre, releaseDate, description);
        this.director = director;
        this.leadingActress = leadingActress;
    }

    /*This method is a setter that allows you to set the value of the director instance variable.*/
    public void setDirector(String director) {
        this.director = director;
    }

    /*This method is a setter that allows you to set the value of the leadingActress instance variable.*/
    public void setLeadingActress(String leadingActress) {
        this.leadingActress = leadingActress;
    }

    /*This is a getter method that returns the value of the director instance variable.*/
    public String getDirector() {
        return director;
    }

    /*This is a getter method that returns the value of the leadingActress instance variable.*/
    public String getLeadingActress() {
        return leadingActress;
    }
}
