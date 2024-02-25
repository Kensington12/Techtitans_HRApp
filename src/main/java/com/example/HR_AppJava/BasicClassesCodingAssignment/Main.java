package com.example.HR_AppJava.BasicClassesCodingAssignment;

public class Main {
    
    public static void main(String[] args) {
        //Created a job instance
        Job job = new Job("Software Engineer", 42);

        //Created a person instance
        Person person = new Person("John Doe", 25);

        //Created a hard skill instance
        HardSkill hardSkill = new HardSkill("SQL", "Intermediate");

        //Displays the details of the corresponding objects
        person.displayDetails();
        job.displayDetails();
        hardSkill.displayDetails();
    }
}
