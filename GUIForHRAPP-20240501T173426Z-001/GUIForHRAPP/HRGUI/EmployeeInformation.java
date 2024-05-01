package HRGUI;

import java.util.Scanner;

public class EmployeeInformation extends tempArray {
    Scanner scn = new Scanner(System.in);
    // Variable declarations
    String userName;
    String password;
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
    public EmployeeInformation(String userName, String password, String userAddress, String phoneNumber, String empEmail, String previousJob, String currentJob, String supervisor, String companyName, String experience, String hardSkill, String softSkill) {
        this.userName = userName;
        this.password = password;
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
    public void setPassword(String password) {
        this.password = password;
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
    public String getPassword() {
        return password;
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
        System.out.print("Create a password for the employee: ");
        setPassword(scn.nextLine());
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
        addArray(new String[] {userName, password, userAddress, phoneNumber, empEmail, previousJob, currentJob, supervisor, companyName, experience, hardSkill, softSkill});
    }
    public void editAccountInformation() {
        System.out.println("Enter the employee's system ID: ");
        int arrayIndex = Integer.parseInt(scn.nextLine());
            int choice = 2; // just something other than 0
            while (choice != 0) {
                System.out.println("1. Edit name");
                System.out.println("2. Edit password");
                System.out.println("3. Edit home address");
                System.out.println("4. Change phone number");
                System.out.println("5. Change email");
                System.out.println("6. Edit previous job");
                System.out.println("7. Edit current job");
                System.out.println("8. Edit supervisor");
                System.out.println("9. Change company name");
                System.out.println("10. Change experience");
                System.out.println("11. Change hard skills");
                System.out.println("12. Change soft skills");
                System.out.println("0. Exit");
                System.out.print("Enter choice: ");
                choice = Integer.parseInt(scn.nextLine());
                switch (choice) {
                    case 1:
                        System.out.println("Enter first name: ");
                        setUserName(scn.nextLine());
                        editItemInArray(arrayIndex, 0, userName);
                        break;
                    case 2:
                        System.out.print("Enter password : ");
                        setPassword(scn.nextLine());
                        editItemInArray(arrayIndex, 1, password);
                        break;
                    case 3:
                        System.out.print("Enter home address: ");
                        setUserAddress(scn.nextLine());
                        editItemInArray(arrayIndex, 2, userAddress);
                        break;
                    case 4:
                        System.out.print("Enter phone number: ");
                        setPhoneNumber(scn.nextLine());
                        editItemInArray(arrayIndex, 3, phoneNumber);
                        break;
                    case 5:
                        System.out.print("Enter email: ");
                        setEmpEmail(scn.nextLine());
                        editItemInArray(arrayIndex, 4, empEmail);
                        break;
                    case 6:
                        System.out.println("Enter previous job: ");
                        setPreviousJob(scn.nextLine());
                        editItemInArray(arrayIndex, 5, previousJob);
                        break;
                    case 7:
                        System.out.print("Enter current job : ");
                        setCurrentJob(scn.nextLine());
                        editItemInArray(arrayIndex, 6, currentJob);
                        break;
                    case 8:
                        System.out.print("Enter supervisor: ");
                        setSupervisor(scn.nextLine());
                        editItemInArray(arrayIndex, 7, supervisor);
                        break;
                    case 9:
                        System.out.print("Enter company name: ");
                        setCompanyName(scn.nextLine());
                        editItemInArray(arrayIndex, 8, companyName);
                        break;
                    case 10:
                        System.out.print("Enter experience: ");
                        setExperience(scn.nextLine());
                        editItemInArray(arrayIndex, 9, experience);
                        break;
                    case 11:
                        System.out.print("Enter hard skills: ");
                        setHardSkill(scn.nextLine());
                        editItemInArray(arrayIndex, 10, hardSkill);
                        break;
                    case 12:
                        System.out.print("Enter soft skills: ");
                        setSoftSkill(scn.nextLine());
                        editItemInArray(arrayIndex, 11, softSkill);
                        break;
                    case 0:
                        System.out.println("Exiting edit-menu...");
                        break;
                    default:
                        System.out.println("Invalid Input");
                        break;
                }
            }
        }
        public void displayEmp() {
            String[] titles = {"Name: ", "Password: ", "Address: ", "Phone Number: ", "Email: ", "Previous Job: ", "Current Job: ", "Supervisor: ","Company Name: ", "Experience: ", "Hard Skills: ", "Soft Skills: "};
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
        public void deleteEmp() {
            System.out.print("Enter the employee's system ID: ");
            int arrayIndex = Integer.parseInt(scn.nextLine());
                if (arrayIndex >= 0 && arrayIndex < arrays.size()) {
                    arrays.remove(arrayIndex);
                    System.out.println("The employee has been deleted!");
                } else {
                    System.err.println("Employee not found");
                }
            }
            
        }

