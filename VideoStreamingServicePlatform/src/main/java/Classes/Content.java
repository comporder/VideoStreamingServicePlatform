/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Classes;

/*This line declares a class named Content and marks it as abstract using the abstract keyword. 
Abstract classes cannot be instantiated directly but serve as base classes for other classes.*/
public abstract class Content {

    /*Overall, this Content class provides a blueprint for creating content objects with properties such as title, duration, genre, release date, and description.*/
    /*These lines declare private instance variables (title, duration, genre, releaseDate, and description) that store information about the content. 
    They are marked as private to encapsulate the data and ensure that it can only be accessed through the public methods of the class.*/
    private String title;
    private int duration;
    private String genre;
    private String releaseDate;
    private String description;

    /*This is the constructor of the Content class. It takes in parameters corresponding to the content's title, duration, genre, release date, and description. The constructor initializes the instance variables of the class with the provided values.*/
    public Content(String title, int duration, String genre, String releaseDate, String description) {
        this.title = title;
        this.duration = duration;
        this.genre = genre;
        this.releaseDate = releaseDate;
        this.description = description;
    }

    /*This is a getter method that returns the value of the title instance variable.*/
    public String getTitle() {
        return title;
    }

    /*This is a getter method that returns the value of the genre instance variable.*/
    public String getGenre() {
        return genre;
    }

    /*This is a getter method that returns the value of the duration instance variable.*/
    public int getDuration() {
        return duration;
    }

    /*This is a getter method that returns the value of the releaseDate instance variable.*/
    public String getReleaseDate() {
        return releaseDate;
    }

    /*This is a getter method that returns the value of the description instance variable.*/
    public String getDescription() {
        return description;
    }

}
