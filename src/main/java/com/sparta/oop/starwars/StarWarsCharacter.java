package com.sparta.oop.starwars;

import com.sparta.oop.starwars.enums.*;

public class StarWarsCharacter {

    private JediTitle jediTitle;
    private SithTitle sithTitle;
    private String firstName;
    private String lastName;
    private int age;
    private Species species;
    private int mass;

    //region Constructors

    //Constructor without names

    //Constructor with single name and no title
    public StarWarsCharacter(String firstName, int age, Species species, int mass) {
        this.age = age;
        this.species = species;
        this.mass = mass;
        this.firstName = firstName;
    }

    public StarWarsCharacter(String firstName, String lastName, int age, Species species, int mass) {
        this(firstName, age, species, mass);
        this.lastName = lastName;
    }

    //Constructor with Jedi title and one name
    public StarWarsCharacter(JediTitle jediTitle, String firstName, int age, Species species, int mass) {
        this(firstName, age, species, mass);
        this.jediTitle = jediTitle;
    }

    //Jedi Title and two name constructor
    public StarWarsCharacter(JediTitle jediTitle, String firstName, String lastName, int age, Species species, int mass) {
        this(jediTitle, firstName, age, species, mass);
        this.lastName = lastName;
    }

    // Sith Title and single name constructor
    public StarWarsCharacter(SithTitle sithTitle, String firstName, int age, Species species, int mass) {
        this(firstName, age, species, mass);
        this.sithTitle = sithTitle;
    }

    //Sith Title and two names
    public StarWarsCharacter(SithTitle sithTitle, String firstName, String lastName, int age, Species species, int mass) {
        this(sithTitle, firstName, age, species, mass);
        this.lastName = lastName;
    }

    //endregion

    //region Getters and Setters

    public JediTitle getJediTitle() {return jediTitle;}
    public void setJediTitle(JediTitle title) {this.jediTitle = title;}

    public SithTitle getSithTitle() {return sithTitle;}
    public void setSithTitle(SithTitle sithTitle) {this.sithTitle = sithTitle;}

    public String getFirstName() {return firstName;}
    public void setFirstName(String firstName) {this.firstName = firstName;}

    public String getLastName() {return lastName;}
    public void setLastName(String lastName) {this.lastName = lastName;}

    public int getAge() {return age;}
    public void setAge(int age) {this.age = age;}

    public Species getSpecies() {return species;}
    public void setSpecies(Species species) {this.species = species;}

    public int getMass() {return mass;}
    public void setMass(int mass) {this.mass = mass;}

    //endregion

    //region Character Constants

    public static final StarWarsCharacter YODA = new
            StarWarsCharacter(JediTitle.GRAND_MASTER_OF_THE_JEDI, "Yoda", 896, Species.UNKNOWN, 13);
    public static final StarWarsCharacter LUKE_SKYWALKER = new
            StarWarsCharacter(JediTitle.JEDI_MASTER, "Luke", "Skywalker", 19, Species.HUMAN, 73);
    public static final StarWarsCharacter HAN_SOLO = new
            StarWarsCharacter("Han", "Solo", 32, Species.HUMAN, 80);
    public static final StarWarsCharacter JARJAR = new
            StarWarsCharacter(SithTitle.DARK_LORD_OF_THE_SITH, "JarJar", 404, Species.GUNGAN, 1000);
    public static final StarWarsCharacter R2D2 = new
            StarWarsCharacter("R2D2", 404, Species.DROID, 999);
    public static final StarWarsCharacter MAX_REBO = new
            StarWarsCharacter("Max", "Rebo", 68, Species.ORTOLAN, 303);
    public static final StarWarsCharacter CHEWBACCA = new
            StarWarsCharacter("Chewbacca", 45, Species.WOOKIE, 343);
    public static final StarWarsCharacter THE_EMPEROR = new
            StarWarsCharacter(SithTitle.DARK_LORD_OF_THE_SITH, "Sheev", "Palpatine", 432, Species.HUMAN, 34);

    //endregion
}
