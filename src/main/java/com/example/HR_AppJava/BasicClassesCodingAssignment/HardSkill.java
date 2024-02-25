package com.example.HR_AppJava.BasicClassesCodingAssignment;

public class HardSkill {
    // Field to store the title of the hard skill
    String title;
    // Field to store the skill level of the hard skill
    String level;

    //Constructor to initialize the title and level fields
    public HardSkill(String title, String level) {
        this.title = title;
        this.level = level;
    }

    //Method to set the title of the hard skill
    public void setTitle(String title) {
        this.title = title;
    }

    //Method to set the level of the hard skill
    public void setLevel(String level) {
        this.level = level;
    }

    //Method to retrieve the title of the hard skill
    public String getTitle() {
        return title;
    }
    
    //Method to retrieve the level of the hard skill
    public String getLevel() {
        return level;
    }

    //Method to display the title and skill level of each hard skill
    public void displayDetails(){
        System.out.println("--- Hard Skills---");
        System.out.println("Title: " + title);
        System.out.println("Level: " + level);
    }
}
