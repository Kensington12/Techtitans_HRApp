package HRAPP;
import java.util.Scanner;
public class Evaluation extends tempArray{
    Scanner scn = new Scanner(System.in);
    //Variable declarations
    String empName;
    String evalSupervisor;
    String evalDate;
    String empMentalState;
    String notes;

    //Constructor
    public Evaluation(String empName, String evalSupervisor, String evalDate, String empMentalState, String notes){
        this.empName = empName;
        this.evalSupervisor = evalSupervisor;
        this.evalDate = evalDate;
        this.empMentalState = empMentalState;
        this.notes = notes;
    }
    //Setters
    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public void setEvalSupervisor(String evalSupervisor) {
        this.evalSupervisor = evalSupervisor;
    }

    public void setEvalDate(String evalDate) {
        this.evalDate = evalDate;
    }

    public void setEmpMentalState(String empMentalState) {
        this.empMentalState = empMentalState;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }
    //End Setters
    //Start Accessors
    public String getEmpName(){
        return empName;
    }
    public String getEvalSupervisor(){
        return evalSupervisor;
    }
    public String getEvalDate(){
        return evalDate;
    }
    public String getEmpMentalState() {
        return empMentalState;
    }
    public String getNotes() {
        return notes;
    }
    //End Accessors
    //Start Evaluation methods
    public void obtainEvalValues(){
        System.out.print("Enter the employee's name: ");
        setEmpName(scn.nextLine());
        System.out.print("Enter the employee's evaluating supervisor: ");
        setEvalSupervisor(scn.nextLine());
        System.out.print("Enter the employee's evaluation date: ");
        setEvalDate(scn.nextLine());
        System.out.print("Enter the employee's mental state: ");
        setEmpMentalState(scn.nextLine());
        System.out.print("Enter any notes from the evaluation: ");
        setNotes(scn.nextLine());
        addArray(new String[] {empName, evalSupervisor, evalDate, empMentalState, notes});
    }
}
