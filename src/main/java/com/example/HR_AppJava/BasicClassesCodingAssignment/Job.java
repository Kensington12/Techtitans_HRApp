//Austin Bell
// CSC 325 Classes Assignment

package com.example.HR_AppJava.BasicClassesCodingAssignment;


// Sets a job title and experience level in months, gets the title and experience, and finally displays the job title and experience
public class Job 
{
    String title;
    // Experience in months
    int experience;

    // Constructor
    public Job(String title, int experience) {
        this.title = title;
        this.experience = experience;
    }
    
    // Sets the value of the title variable
    String setTitle(String title)
    {
        return this.title = title;
    }

    // Sets the value of the experience variable
    int setExperience(int experience)
    {
        return this.experience = experience;
    }

    // Gets the value of the title variable
    void getTitle()
    {
        setTitle(title);
    }

    // Gets the value of the experience variable
    void getExperience()
    {
        setExperience(experience);
    }

    //Displays the job title and experience in a structured output
    void displayDetails()
    {
        System.out.println("-- Jobs --");
        System.out.println("Title: " + title);
        System.out.println("Experience: " + experience);
        System.out.println("");
    }
}
