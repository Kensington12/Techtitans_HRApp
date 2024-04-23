import java.util.ArrayList;
import java.util.Scanner;
public class tempArray {
    ArrayList<Object[]> arrays;

    public tempArray() {
        arrays = new ArrayList<>();
    }

    // Method to add employee information to an array
    public void addItemToArray(int arrayIndex, Object item) {
        if (arrayIndex >= 0 && arrayIndex < arrays.size()) {
            arrays.get(arrayIndex)[arrays.get(arrayIndex).length - 1] = item;
        } else {
            System.err.println("Array index out of bounds");
        }
    }

    // Method to edit employee information in an array
    public void editItemInArray(int arrayIndex, int itemIndex, Object newItem) {
        if (arrayIndex >= 0 && arrayIndex < arrays.size()) {
            if (itemIndex >= 0 && itemIndex < arrays.get(arrayIndex).length) {
                arrays.get(arrayIndex)[itemIndex] = newItem;
            } else {
                System.err.println("Item index out of bounds");
            }
        } else {
            System.err.println("Array index out of bounds");
        }
    }

    // Method to delete employee information from an array
    public void deleteItemFromArray(int arrayIndex, int itemIndex) {
        if (arrayIndex >= 0 && arrayIndex < arrays.size()) {
            if (itemIndex >= 0 && itemIndex < arrays.get(arrayIndex).length) {
                Object[] array = arrays.get(arrayIndex);
                Object[] newArray = new Object[array.length - 1];
                int newIndex = 0;
                for (int i = 0; i < array.length; i++) {
                    if (i != itemIndex) {
                        newArray[newIndex++] = array[i];
                    }
                }
                arrays.set(arrayIndex, newArray);
            } else {
                System.err.println("Item index out of bounds");
            }
        } else {
            System.err.println("Array index out of bounds");
        }
    }

    // Method to read all the employee information in an array
    public void readItemsInArray(int arrayIndex) {
        if (arrayIndex >= 0 && arrayIndex < arrays.size()) {
            Object[] array = arrays.get(arrayIndex);
            System.out.print("Items in array " + arrayIndex + ": ");
            for (Object item : array) {
                System.out.print(item + ", ");
            }
            System.out.println();
        } else {
            System.err.println("Array index out of bounds");
        }
    }

    // Method to add a new array
    public void addArray(Object[] newArray) {
        arrays.add(newArray);
    }
}

class Main {
    public static void main(String[] args) {
        // Instantiate TempArrays
       // tempArray employeeInfoList = new tempArray();
        EmployeeInformation employeeInformation = new EmployeeInformation(null, null, null, null, null, null, null, null, null, null, null);
        // Array I made for the team
        employeeInformation.addArray(new String[] { "Jane Doe", "155 Hilton Lane, Benton KY", "(270)-155-1943",
                "jdoe23@gmail.com", "Junior Developer", "Senior Developer", "Dr. Raj", "Marquette Transportation",
                "advanced", "SQL, Java, Python", "Communication, Problem-Solving" });

        // Add employee information to the array
        //employeeInfoList.addItemToArray(0, "Hard Worker");

        // Edit employee information in the array
       // employeeInfoList.editItemInArray(0, 2, "(270)-122-3236");

        // Delete employee information from the array
        //employeeInfoList.deleteItemFromArray(0, 1);

        // Read employee information from the array
        employeeInformation.readItemsInArray(0);
        employeeInformation.obtainEmpValues();
        employeeInformation.readItemsInArray(1);

    }
}

class EmployeeInformation extends tempArray {
    
   // tempArray employeeInfo = new tempArray();
    Scanner scn = new Scanner(System.in);
    // Variable declarations
    String userName;
    String userAddress;
    String phoneNumber;
    String empEmail;
    String previousJob;
    String currentJob;
    String supervisor;
    String companyName;
    String experience;
    String hardSkill;
    String softSkill;

    //Constructor
    public EmployeeInformation(String userName, String userAddress, String phoneNumber, String empEmail, String previousJob, String currentJob, String supervisor, String companyName, String experience, String hardSkill, String softSkill) {
        this.userName = userName;
        this.userAddress = userAddress;
        this.phoneNumber = phoneNumber;
        this.empEmail = empEmail;
        this.previousJob = previousJob;
        this.currentJob = currentJob;
        this.supervisor = supervisor;
        this.companyName = companyName;
        this.experience = experience;
        this.hardSkill = hardSkill;
        this.softSkill = softSkill;
    }

    //Setters
    public void setUserName(String userName) {
        this.userName = userName;
    }
    public void setUserAddress(String userAddress) {
        this.userAddress = userAddress;
    }
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
    public void setEmpEmail(String empEmail) {
        this.empEmail = empEmail;
    }
    public void setPreviousJob(String previousJob) {
        this.previousJob = previousJob;
    }
    public void setCurrentJob(String currentJob) {
        this.currentJob = currentJob;
    }
    public void setSupervisor(String supervisor) {
        this.supervisor = supervisor;
    }
    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }
    public void setExperience(String experience) {
        this.experience = experience;
    }
    public void setHardSkill(String hardSkill) {
        this.hardSkill = hardSkill;
    }
    public void setSoftSkill(String softSkill) {
        this.softSkill = softSkill;
    }
    //End setters
    //Start accessors

    public String getUserName() {
        return userName;
    }
    public String getUserAddress() {
        return userAddress;
    }
    public String getPhoneNumber() {
        return phoneNumber;
    }
    public String getEmpEmail() {
        return empEmail;
    }
    public String getPreviousJob() {
        return previousJob;
    }
    public String getCurrentJob() {
        return currentJob;
    }
    public String getSupervisor() {
        return supervisor;
    }
    public String getCompanyName() {
        return companyName;
    }
    public String getExperience() {
        return experience;
    }
    public String getHardSkill(){
        return hardSkill;
    }
    public String getSoftSkill() {
        return softSkill;
    }
    //End accessors
    // Start employee methods
    public void obtainEmpValues() {
        System.out.print("Enter the employee's name: ");
        setUserName(scn.nextLine());
        System.out.print("Enter the employee's street address: ");
        setUserAddress(scn.nextLine());
        System.out.print("Enter the employee's phone number: ");
        setPhoneNumber(scn.nextLine());
        System.out.print("Enter the employee's email address: ");
        setEmpEmail(scn.nextLine());
        System.out.print("Enter the employee's previous job: ");
        setPreviousJob(scn.nextLine());
        System.out.print("Enter the employee's current job: ");
        setCurrentJob(scn.nextLine());
        System.out.print("Enter the employee's supervisor: ");
        setSupervisor(scn.nextLine());
        System.out.print("Enter the company's name: ");
        setCompanyName(scn.nextLine());
        System.out.print("Enter the employee's level of experience (beginner, intermediate, or expert): ");
        setExperience(scn.nextLine());
        System.out.print("List the employee's hard skills: ");
        setHardSkill(scn.nextLine());
        System.out.print("List the employee's soft skills: ");
        setSoftSkill(scn.nextLine());
        addArray(new String[] {userName, userAddress, phoneNumber, empEmail, previousJob, currentJob, supervisor, companyName, experience, hardSkill, softSkill});
    }
}
