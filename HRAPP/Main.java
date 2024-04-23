package HRAPP;

public class Main {
    public static void main(String[] args) {
        
        EmployeeInformation employeeInformation = new EmployeeInformation(null, null, null, null, null, null, null, null, null, null, null, null);
        Evaluation evaluation = new Evaluation(null, null, null, null, null);
        // Array I made for the team
        employeeInformation.addArray(new String[] { "Jane Doe", "JaneDoe333$", "155 Hilton Lane, Benton KY", "(270)-155-1943",
                "jdoe23@gmail.com", "Junior Developer", "Senior Developer", "Dr. Raj", "Marquette Transportation",
                "advanced", "SQL, Java, Python", "Communication, Problem-Solving" });
        evaluation.addArray(new String[] {"Jane Doe", "Dr.Raj", "10/20/23", "Positive", "Overall very strong performance, she always meets delivery dates."});

       
        employeeInformation.readItemsInArray(0);
        employeeInformation.obtainEmpValues();
        employeeInformation.readItemsInArray(1);
        evaluation.readItemsInArray(0);
        evaluation.obtainEvalValues();

    }
}
