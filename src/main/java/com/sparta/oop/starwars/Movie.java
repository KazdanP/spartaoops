package com.sparta.oop.starwars;

import com.sparta.oop.starwars.enums.MovieName;

import java.util.List;

public class Movie {

    private MovieName name;
    private int duration;
    private List<StarWarsCharacter> mainCharacters;

    public Movie(MovieName name, int duration, List<StarWarsCharacter> mainCharacters) {
        this.name = name;
        this.duration = duration;
        this.mainCharacters = mainCharacters;
    }

    public MovieName getName() {return name;}
    public String getMovieName() {return name.getNameOfMovie();}
    public void setName(MovieName name) {this.name = name;}

    public int getDuration() {return duration;}
    public void setDuration(int duration) {this.duration = duration;}

    public List<StarWarsCharacter> getMainCharacters() {return mainCharacters;}
    public void setMainCharacters(List<StarWarsCharacter> mainCharacters) {this.mainCharacters = mainCharacters;}

}
