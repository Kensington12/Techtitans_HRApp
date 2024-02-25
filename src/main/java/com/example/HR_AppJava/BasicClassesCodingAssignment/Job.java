//Austin Bell
// CSC 325 Classes Assignment

package src.main.java.com.example.HR_AppJava.BasicClassesCodingAssignment;


// Sets a job title and experience level in months, gets the title and experience, and finally displays the job title and experience
public class Job 
{
    String title;
    // Experience in months
    int experience;

    // Constructor
    public Job()
    {

    }
    
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

    //Displays the job title and experience in a structured output
    void displayDetails()
    {
        System.out.println("-- Jobs --");
        System.out.println("Title: " + title);
        System.out.println("Experience: " + experience);
        System.out.println("");
    }
}
