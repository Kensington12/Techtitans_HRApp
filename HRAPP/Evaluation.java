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

    public void editAccountInformation() {
        System.out.println("Enter the employee's system ID: ");
        int arrayIndex = Integer.parseInt(scn.nextLine());
            int choice = 2; // just something other than 0
            while (choice != 0) {
                System.out.println("1. Edit name");
                System.out.println("2. Edit evaluating supervisor");
                System.out.println("3. Edit evaluation date");
                System.out.println("4. Change employee mental status");
                System.out.println("5. Change notes");
                System.out.println("0. Exit");
                System.out.print("Enter choice: ");
                choice = Integer.parseInt(scn.nextLine());
                switch (choice) {
                    case 1:
                        System.out.println("Enter name: ");
                        setEmpName(scn.nextLine());
                        editItemInArray(arrayIndex, 0, empName);
                        break;
                    case 2:
                        System.out.print("Enter evaluating supervisor : ");
                        setEvalSupervisor(scn.nextLine());
                        editItemInArray(arrayIndex, 1, evalSupervisor);
                        break;
                    case 3:
                        System.out.print("Enter evaluation date: ");
                        setEvalDate(scn.nextLine());
                        editItemInArray(arrayIndex, 2, evalDate);
                        break;
                    case 4:
                        System.out.print("Enter employee mental status: ");
                        setEmpMentalState(scn.nextLine());
                        editItemInArray(arrayIndex, 3, empMentalState);
                        break;
                    case 5:
                        System.out.print("Enter notes: ");
                        setNotes(scn.nextLine());
                        editItemInArray(arrayIndex, 4, notes);
                        break;
                    case 0:
                        System.out.println("Exiting edit-menu...");
                        break;
                }
            }
        }
        public void displayEval() {
            String[] titles = {"Name: ", "Evaluating Supervisor: ", "Evaluation Date: ", "Employee Mental State: ", "Notes: "};
            System.out.println("Enter the employee's system ID: ");
            int arrayIndex = Integer.parseInt(scn.nextLine());
            if (arrayIndex >= 0 && arrayIndex < arrays.size()) {
                Object[] array = arrays.get(arrayIndex);
                System.out.println("Items for employee " + arrayIndex + ": ");
                for (int i = 0; i < array.length; i++) {

                    System.out.println(titles[i] + array[i] + " ");
                }
                System.out.println();
            } else {
                System.err.println("Employee not found");
            }
        }
        public void deleteEval() {
            System.out.print("Enter the employee's system ID: ");
            int arrayIndex = Integer.parseInt(scn.nextLine());
                if (arrayIndex >= 0 && arrayIndex < arrays.size()) {
                    arrays.remove(arrayIndex);
                    System.out.println("The evaluation has been deleted!");
                } else {
                    System.err.println("Evaluation not found");
                }
            }
}
