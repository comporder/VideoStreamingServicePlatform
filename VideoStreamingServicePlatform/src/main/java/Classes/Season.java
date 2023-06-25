/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Classes;

import java.util.ArrayList;

/*The Season class represents a season of a TV series. It has methods to add episodes, get the number of episodes, and retrieve the names of episodes in the season.*/
public class Season {
    /*These lines declare private instance variables (episodeNumber, numOfThisSeason, seasonName, and nameOfEpisodes)
    that store information about a season. nameOfEpisodes is an ArrayList that will store the names of episodes in the season.*/
    private int episodeNumber;
    private int numOfThisSeason;
    private String seasonName;
    private ArrayList<String> nameOfEpisodes;

    /*This is the constructor of the Season class. It takes in parameters corresponding to the season number and name. 
    It initializes the instance variables seasonName and numOfThisSeason with the provided values. 
    It also initializes the nameOfEpisodes ArrayList to an empty list using the new keyword.*/
    public Season(int numOfThisSeason, String seasonName) {
        this.seasonName = seasonName;
        this.numOfThisSeason = numOfThisSeason;
        this.nameOfEpisodes=new ArrayList<>();
    }
    
    /*This method allows you to add an episode to the season by appending the episode's name to the nameOfEpisodes list using the add method of ArrayList.*/
    public void addEpisodeOfThisSeason(String episode) {
        nameOfEpisodes.add(episode);
    }

    /*This method returns the number of episodes in the season by returning the size of the nameOfEpisodes list.*/
    public int getNumOfEpisodes() {
        return nameOfEpisodes.size();
    }

    /*This method returns the list of episode names (nameOfEpisodes) in the season.*/
    public ArrayList<String> getNameOfEpisodes() {
        return nameOfEpisodes;
    }

}
