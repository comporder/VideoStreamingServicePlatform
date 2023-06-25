/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Classes;

import java.util.ArrayList;
import java.util.Scanner;
import Classes.Series;

/**
 *
 * @author emir
 */
public class Test {

    public static void main(String[] args) {
        transactions();
    }

    public static void transactions() {
        /*The code sets up the initial data for the streaming platform, including users, contents, and their watchlists/viewed content.*/
        StreamingPlatform platform = new StreamingPlatform();
        /*Two Viewer objects, user1 and user2, are created with their respective usernames, passwords, and email addresses.*/
        User user1 = new Viewer("JohnDoe", "john1234", "johndoe@gmail.com");
        User user2 = new Viewer("JaneSmith", "smithJane2002", "jane_smith_2002@hotmail.com");
        /*The addUser() method is called on the platform object to add user1 and user2 to the platform.*/
        platform.addUser(user1);
        platform.addUser(user2);

        /*Content objects representing movies (movie1, movie2, movie3, movie4) and series (series1, series2, series3, series4) are created with their respective properties such as title, duration, genre, release date, description, director, and leading actors/actresses.*/
        Content movie1 = new Movie("Pulp Fiction", 154, "Crime - Drama ", "1995", "The lives of two mob hitmen, a boxer, a gangster and his wife, and a pair of diner bandits intertwine in four tales of violence and redemption.", "Quentin Tarantino", "John Travolta");
        Content movie2 = new Movie("Se7en", 127, "Mystery - Crime - Drama", "1995", "Two detectives, a rookie and a veteran, hunt a serial killer who uses the seven deadly sins as his motives.", "David Fincher", "Morgan Freeman - Brad Pitt");
        Content movie3 = new Movie("The Shawshank Redemption", 142, "Drama", "1994", "Over the course of several years, two convicts form a friendship, seeking consolation and, eventually, redemption through basic compassion.", "Frank Darabont", "Tim Robbins - Morgan Freeman");
        Content movie4 = new Movie("Fight Club", 139, "Drama", "1999", "An insomniac office worker and a devil-may-care soap maker form an underground fight club that evolves into much more.", "David Fincher", "Brad Pitt - Edward Norton");
        Content series1 = new Series("Breaking Bad", 62, "Thriller - Crime - Drama", "2008–2013", "A chemistry teacher diagnosed with inoperable lung cancer turns to manufacturing and selling methamphetamine with a former student in order to secure his family's future.", 49);
        Content series2 = new Series("Game of Thrones", 73, "Action - Adventure - Drama", "2011–2019", "Nine noble families fight for control over the lands of Westeros, while an ancient enemy returns after being dormant for millennia.", 57);
        Content series3 = new Series("Stranger Things", 42, "Horror - Fantasy - Drama", "2016–2022", "When a young boy disappears, his mother, a police chief and his friends must confront terrifying supernatural forces in order to get him back.", 51);
        Content series4 = new Series("The Walking Dead", 177, "Horror - Thriller - Drama", "2010–2022", "Sheriff Deputy Rick Grimes wakes up from a coma to learn the world is in ruins and must lead a group of survivors to stay alive.", 44);
        /*A Season object, firstSeasonOfFirstSerie, is created for the series1 object.*/
        Season firstSeasonOfFirstSerie = new Season(7, "First Season");
        /*The addSeason() method is called on the series1 object to add firstSeasonOfFirstSerie to the series.*/
        ((Series) series1).addSeason(firstSeasonOfFirstSerie);
        /*The addEpisodeOfThisSeason() method is called on firstSeasonOfFirstSerie to add episodes to the season.*/
        firstSeasonOfFirstSerie.addEpisodeOfThisSeason("Pilot");
        firstSeasonOfFirstSerie.addEpisodeOfThisSeason("Cat's in the Bag...");
        firstSeasonOfFirstSerie.addEpisodeOfThisSeason("...And the Bag's in the River");
        firstSeasonOfFirstSerie.addEpisodeOfThisSeason("Cancer Man");
        firstSeasonOfFirstSerie.addEpisodeOfThisSeason("Gray Matter");
        firstSeasonOfFirstSerie.addEpisodeOfThisSeason("Crazy Handful of Nothin");
        firstSeasonOfFirstSerie.addEpisodeOfThisSeason("A No-Rough-Stuff-Type Deal");

        /*The addContent() method is called on the platform object to add the movies and series to the platform.*/
        platform.addContent(movie1);
        platform.addContent(movie2);
        platform.addContent(movie3);
        platform.addContent(movie4);
        platform.addContent(series1);
        platform.addContent(series2);
        platform.addContent(series3);
        platform.addContent(series4);

        /*The addToWatchList() method is called on user1 and user2 to add movies and series to their watchlists.*/
        ((Viewer) user1).addToWatchList(movie2);
        ((Viewer) user1).addToWatchList(series1);
        ((Viewer) user1).addToWatchList(movie3);
        ((Viewer) user1).addToWatchList(series3);
        ((Viewer) user2).addToWatchList(movie3);
        ((Viewer) user2).addToWatchList(series1);
        ((Viewer) user2).addToWatchList(movie1);
        ((Viewer) user2).addToWatchList(series4);
        /*The markAsViewed() method is called on user2 to mark movie4 and series3 as viewed.
          The markAsViewed() method is called on user1 to mark movie1 and series2 as viewed.*/
        ((Viewer) user2).markAsViewed(movie4);
        ((Viewer) user2).markAsViewed(series3);
        ((Viewer) user1).markAsViewed(movie1);
        ((Viewer) user1).markAsViewed(series2);

        //Search for content
        boolean control = false;
        /*This code allows users to search for series or movies by entering a keyword and displays the matching content with relevant details.*/
        Scanner input = new Scanner(System.in);
        /*A while loop is used to continuously prompt the user for a keyword and perform the search until valid content is found or the user decides to exit.
        Within the loop, the user is prompted to enter a keyword for the series or movie they want to search for.*/
        while (!control) {
            System.out.print("Enter the keyword for the series or movie you want to search for:");
            String contentName = input.next();
            /*The platform object's searchContent method is called with the contentName as an argument, which returns an ArrayList of Content objects that match the search criteria.*/
            ArrayList<Content> searchResults = platform.searchContent(contentName);
            if (!searchResults.isEmpty()) {
                System.out.println("------------------------------------------------------------------------");
                for (Content content : searchResults) {
                    /*Within the loop, the type of content is checked using the instanceof operator. If the content is an instance of Series, specific information related to series is printed, including the title,
                    number of episodes, genre, release dates, and description. If the series has seasons, the names of the episodes are also printed.*/
                    if (content instanceof Series) {
                        System.out.println("The Title of Series: " + content.getTitle() + "\nThe number of episodes: " + content.getDuration() + "\nThe Genre: " + content.getGenre() + "\nThe beginning and end dates of the series: " + content.getReleaseDate() + "\nThe Description: " + content.getDescription());
                        if (((Series) content).isHaveSeason()) {
                            ArrayList<String> episodes = ((Series) content).getNameOfEpisodes();
                            System.out.println("The Name Of Episodes :");
                            for (String episode : episodes) {
                                System.out.println(episode);
                            }
                        }

                        System.out.println("------------------------------------------------------------------------");

                    } else {
                        /*If the content is not a Series but a Movie, movie-specific information is printed, including the title, duration, genre, release date, description, director, and leading actress(es).*/
                        System.out.println("The Title of Movie: " + content.getTitle() + "\nThe Duration: " + content.getDuration() + "\nThe Genre: " + content.getGenre() + "\nThe Release Date: " + content.getReleaseDate() + "\nThe Description: " + content.getDescription() + "\nThe Director: " + ((Movie) content).getDirector() + "\nThe Leading Actress or Actresses: " + ((Movie) content).getLeadingActress());
                        System.out.println("------------------------------------------------------------------------");

                    }
                }
                control = true;
            } else {
                /*If the search results are empty, indicating no matching content was found, a message is printed indicating the absence of content.*/
                System.out.println("No such content was found on the video platform.");
                System.out.println("------------------------------------------------------------------------");
                control = false;
            }
        }

        /*This code allows the user to choose whether they want to see the list of users on the streaming platform and displays the usernames and email addresses of the users if requested.*/
        System.out.print("Please type \"Yes\" in the field if you want to see the user list: ");
        String users = input.next();
        if (users.equalsIgnoreCase("Yes")) {
            /*The platform object's getUsers() method is called to retrieve the list of users, which is stored in the usersList variable as an ArrayList of User objects.*/
            ArrayList<User> usersList = platform.getUsers();
            /*A message is printed to indicate that the user information is being displayed.
            A for-each loop is used to iterate over the usersList and retrieve each User object.
            Inside the loop, the username and email of each user are printed using the getUsername() and getEmail() methods.*/
            System.out.println("The Users Informations Are: ");
            for (User user : usersList) {
                System.out.println("Username: " + user.getUsername() + "\nE-Mail: " + user.getEmail());

            }
            System.out.println("------------------------------------------------------------------------");
        }

        /*This code allows the user to choose whether they want to see the watchlists of the users on the streaming platform and displays the watchlists if requested.*/
        System.out.print("Please type \"Yes\" in the field if you want to see the users watchlist: ");
        String watchList = input.next();
        if (watchList.equalsIgnoreCase("Yes")) {
            /*The platform object's getUsers() method is called to retrieve the list of users, which is stored in the usersWatch variable as an ArrayList of User objects.*/
            ArrayList<User> usersWatch = platform.getUsers();
            for (User user : usersWatch) {
                /*Inside the loop, the getWatchList() method is called on each User object, which returns an ArrayList of Content objects representing their watchlist.*/
                ArrayList<Content> watchListLength = ((Viewer) user).getWatchList();
                /*If the watchlist is not empty, a message is printed indicating the username of the viewer and that their watchlist is being displayed.
                Another for-each loop is used to iterate over the watchlist and retrieve each Content object.
                Inside the inner loop, the title of each content is printed using the getTitle() method.*/
                if (watchListLength.size() != 0) {
                    System.out.println("The watchlist of the viewer with the username " + user.getUsername() + " is as follows: ");
                    for (Content content : ((Viewer) user).getWatchList()) {
                        System.out.println(content.getTitle());
                    }
                    System.out.println("------------------------------------------------------------------------");
                } else {
                    System.out.println("The watchlist of the viewer with the username " + user.getUsername() + " is empty!");
                }

            }
            System.out.println("------------------------------------------------------------------------");
        }

        /*This code allows the user to choose whether they want to see the viewed content of the users on the streaming platform and displays the viewed content if requested.*/
        System.out.print("Please type \"Yes\" in the field if you want to see the users watchlist: ");
        String viewedContent = input.next();
        if (viewedContent.equalsIgnoreCase("Yes")) {
            /*The platform object's getUsers() method is called to retrieve the list of users, which is stored in the usersViewedContent variable as an ArrayList of User objects.*/
            ArrayList<User> usersViewedContent = platform.getUsers();
            for (User user : usersViewedContent) {
                /*Inside the loop, the getViewedContent() method is called on each User object, which returns an ArrayList of Content objects representing their viewed content.*/
                ArrayList<Content> viewedContentListLength = ((Viewer) user).getViewedContent();
                /*The size of the viewed content list is checked using the size() method. If the size is not zero, it means the viewed content list is not empty.
                If the viewed content list is not empty, a message is printed indicating the username of the viewer and that their viewed content is being displayed.
                Another for-each loop is used to iterate over the viewed content list and retrieve each Content object.*/
                if (viewedContentListLength.size() != 0) {
                    System.out.println("The viewed content of the viewer with the username " + user.getUsername() + " is as follows: ");
                    for (Content content : ((Viewer) user).getViewedContent()) {
                        System.out.println(content.getTitle());
                    }
                    System.out.println("------------------------------------------------------------------------");
                } else {
                    System.out.println("The viewed content of the viewer with the username " + user.getUsername() + " is empty!");
                }

            }
            System.out.println("------------------------------------------------------------------------");
        }

    }

}
