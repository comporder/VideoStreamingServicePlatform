/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Classes;

import java.util.ArrayList;

/*The Series class extends the Content class, indicating that it is a subclass of Content.*/
public class Series extends Content {

    /*It has two private instance variables: seasons, which is an ArrayList of Season objects, and episodeDuration, which represents the duration of each episode.*/
    private ArrayList<Season> seasons;
    private int episodeDuration;

    /*The constructor Series is used to create instances of the Series class. It takes parameters for the title, duration, genre, release date, description (inherited from Content), and the episode duration. 
    It calls the superclass constructor using super() to initialize the inherited variables, and then initializes the seasons variable as an empty ArrayList and sets the episodeDuration variable.*/
    public Series(String title, int duration, String genre, String releaseDate, String description,
            int episodeDuration) {
        super(title, duration, genre, releaseDate, description);
        this.seasons = new ArrayList<>();
        this.episodeDuration = episodeDuration;
    }

    /*The addSeason method is used to add a Season object to the seasons ArrayList.*/
    public void addSeason(Season season) {
        seasons.add(season);
    }

    /*The removeSeason method is used to remove a Season object from the seasons ArrayList.*/
    public void removeSeason(Season season) {
        seasons.remove(season);
    }

    /*The isHaveSeason method checks if the seasons ArrayList is empty or not. If it is empty, it returns false; otherwise, it returns true.*/
    public boolean isHaveSeason() {
        if (seasons.isEmpty()) {
            return false;
        } else {
            return true;
        }
    }

    /*The getNameOfEpisodes method retrieves the names of all the episodes in the seasons ArrayList. It iterates over each Season object in the seasons ArrayList and calls the getNameOfEpisodes method of each Season object. It returns an ArrayList of episode names.*/
    public ArrayList<String> getNameOfEpisodes() {
        ArrayList<String> episodeList = null;
        for (Season season : seasons) {
            episodeList = season.getNameOfEpisodes();
        }
        return episodeList;
    }
}
