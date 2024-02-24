package com.example.HR_AppJava.BasicClassesCodingAssignment;

public class Job 
{
    String title;
    int experience;

    String setTitle(String title)
    {
        return this.title = title;
    }

    int setExperience(int experience)
    {
        return this.experience = experience;
    }

    void getTitle()
    {
        setTitle(title);
    }

    void getExperience()
    {
        setExperience(experience);
    }

    void displayDetails()
    {
        System.out.println("-- Jobs --");
        System.out.println("Title: " + title);
        System.out.println("Experience: " + experience);
        System.out.println("");
    }
}
