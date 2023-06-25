/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Classes;

import java.util.ArrayList;

public class StreamingPlatform {

    /*The StreamingPlatform class represents a streaming platform. It has two private instance variables: users, which is an ArrayList of User objects, and contentLibrary, which is an ArrayList of Content objects.*/
    private ArrayList<User> users;
    private ArrayList<Content> contentLibrary;

    /*The constructor StreamingPlatform is used to create instances of the StreamingPlatform class. It initializes the users and contentLibrary variables as empty ArrayLists.*/
    public StreamingPlatform() {
        this.users = new ArrayList<>();
        this.contentLibrary = new ArrayList<>();
    }

    /*The getUsers method returns the users ArrayList, allowing access to the list of users.*/
    public ArrayList<User> getUsers() {
        return users;
    }

    /*The getContentLibrary method returns the contentLibrary ArrayList, allowing access to the list of content in the library.*/
    public ArrayList<Content> getContentLibrary() {
        return contentLibrary;
    }

    /*The setUsers method sets the users ArrayList with the provided ArrayList of User objects.*/
    public void setUsers(ArrayList<User> users) {
        this.users = users;
    }

    /*The setContentLibrary method sets the contentLibrary ArrayList with the provided ArrayList of Content objects*/
    public void setContentLibrary(ArrayList<Content> contentLibrary) {
        this.contentLibrary = contentLibrary;
    }

    /*The addUser method adds a User object to the users ArrayList.*/
    public void addUser(User user) {
        users.add(user);
    }

    /*The removeUser method removes a User object from the users ArrayList*/
    public void removeUser(User user) {
        users.remove(user);
    }

    /*The addContent method adds a Content object to the contentLibrary ArrayList.*/
    public void addContent(Content content) {
        contentLibrary.add(content);
    }

    /*The removeContent method removes a Content object from the contentLibrary ArrayList.*/
    public void removeContent(Content content) {
        contentLibrary.remove(content);
    }

    /*The searchContent method takes a keyword as input and searches the contentLibrary for content titles that contain the keyword. It returns an ArrayList of matching content objects.*/
    public ArrayList<Content> searchContent(String keyword) {
        ArrayList<Content> searchResults = new ArrayList<>();
        for (Content content : contentLibrary) {
            if (content.getTitle().contains(keyword)) {
                searchResults.add(content);
            }
        }
        return searchResults;
    }

}
