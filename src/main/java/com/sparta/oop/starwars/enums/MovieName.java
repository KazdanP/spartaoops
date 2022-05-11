package com.sparta.oop.starwars.enums;

public enum MovieName {
    TPM("Star Wars: The Phantom Menace"),
    AOTC("Attack of the Clones"),
    ROTS("Revenge of the Sith"),
    ANH("A New Hope"),
    ESB("The Empire Strikes Back"),
    ROTJ("Return of the Jedi"),
    SASS("Solo: A Star Wars Story"),
    ROASS("Rogue One: A Star Wars Story");

    private final String nameOfMovie;

    MovieName(String nameOfMovie) {
        this.nameOfMovie = nameOfMovie;
    }

    public String getNameOfMovie() { return nameOfMovie; }
}
