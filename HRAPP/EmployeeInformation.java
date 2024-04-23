package HRAPP;

import java.util.Scanner;

public class EmployeeInformation extends tempArray {
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

