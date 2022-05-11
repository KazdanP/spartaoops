package com.sparta.oop.starwarstest;

import com.sparta.oop.starwars.enums.MovieName;
import com.sparta.oop.starwars.Movie;
import com.sparta.oop.starwars.StarWarsCharacter;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class MovieTest {

    private static List<StarWarsCharacter> mainCharacters;

    @BeforeAll
    static void setUp() {
        mainCharacters = new ArrayList<>();

        mainCharacters.add(StarWarsCharacter.JARJAR);
        mainCharacters.add(StarWarsCharacter.R2D2);
        mainCharacters.add(StarWarsCharacter.MAX_REBO);
    }

    @Test
    void realMovieTest() {
        Movie rogueOne = new Movie(MovieName.ROASS, 203, mainCharacters);

        Assertions.assertEquals("Rogue One: A Star Wars Story", rogueOne.getMovieName());
    }

//    @Test
//    void firstMovieTest() {
//        Movie jarjarStrikesBack = new Movie("JarJar Strikes Back", 201, mainCharacters);
//
//        Assertions.assertTrue(jarjarStrikesBack.getMainCharacters().size() > 0);
//    }

//    @Test
//    void secondMovieTest() {
//        Movie thePhantomMaxRebo = new Movie("The Phantom Max Rebo", 202, mainCharacters);
//
//        Assertions.assertTrue(thePhantomMaxRebo.getMainCharacters().size() > 0);
//    }
}
