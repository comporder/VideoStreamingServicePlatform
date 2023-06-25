/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Classes;

import java.util.ArrayList;

/*The Viewer class extends the User class, which means it inherits the username, password, and email instance variables, as well as the getter and setter methods from the User class.*/
public class Viewer extends User {

    /*The Viewer class has two additional private instance variables: watchList and viewedContent. These variables store the content that the viewer has added to their watchlist and the content they have viewed, respectively.*/
    private ArrayList<Content> watchList;
    private ArrayList<Content> viewedContent;

    /*The constructor Viewer is used to create instances of the Viewer class. It takes parameters for the username, password, and email and initializes the inherited instance variables using the super keyword. It also initializes the watchList and viewedContent lists.*/
    public Viewer(String username, String password, String email) {
        super(username, password, email);
        this.watchList = new ArrayList<>();
        this.viewedContent = new ArrayList<>();
    }

    /*The addToWatchList method is used to add content to the viewer's watchlist.*/
    public void addToWatchList(Content content) {
        watchList.add(content);
    }

    /*The removeFromWatchList method is used to remove content from the viewer's watchlist.*/
    public void removeFromWatchList(Content content) {
        watchList.remove(content);
    }

    /*The markAsViewed method is used to mark content as viewed. It removes the content from the watchlist and adds it to the viewed content list.*/
    public void markAsViewed(Content content) {
        watchList.remove(content);
        viewedContent.add(content);
    }

    /*The setWatchList method is a setter method used to update the watchList variable with a new list of content.*/
    public void setWatchList(ArrayList<Content> watchList) {
        this.watchList = watchList;
    }

    /*The setViewedContent method is a setter method used to update the viewedContent variable with a new list of content.*/
    public void setViewedContent(ArrayList<Content> viewedContent) {
        this.viewedContent = viewedContent;
    }

    /*The getWatchList method is a getter method used to retrieve the content in the viewer's watchlist.*/
    public ArrayList<Content> getWatchList() {
        return watchList;
    }

    /*The getViewedContent method is a getter method used to retrieve the content the viewer has viewed.*/
    public ArrayList<Content> getViewedContent() {
        return viewedContent;
    }
}
