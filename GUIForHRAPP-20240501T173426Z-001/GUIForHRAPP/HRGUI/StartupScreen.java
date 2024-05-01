package HRAPP;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class StartupScreen
{
    public static void main(String[] args)
    {
        StartupScreen gui = new StartupScreen();
    }
    
    //Constructor
    public StartupScreen()
    {
        StartUpScreen();
    }

    //Creates the start up window that displays a logo and a log-in field to allow access to the rest of the application
    public void StartUpScreen()
    {
        JFrame frame = new JFrame("Employee Manager");

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(350, 350);
        frame.setVisible(true);
        frame.setResizable(false);
        frame.setLocationRelativeTo(null);
        
        //Creates the logo using Graphics2D and add it to its own panel for organization
        JPanel logo = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) 
            {
                super.paintComponent(g);

                Graphics2D g2d = (Graphics2D) g;
                g2d.setColor(Color.blue);
                g2d.fillOval(60, 40, 100, 100);
                g2d.fillRect(98, 115, 25, 75);
                g2d.fillArc(48, 155, 125, 75, 180, -180);
                g2d.drawString("Employee Manager", 175, 125);

                g2d.setColor(Color.white);
                g2d.fillOval(85, 80, 10, 10);
                g2d.fillOval(125, 80, 10, 10);
                g2d.drawArc(95, 90, 30, 30, -180, 180);
            }
        };

        JButton loginButton = new JButton("Log In");

        JLabel usernameLabel = new JLabel("Username:");
        JTextField usernameField = new JTextField(15);
        JLabel passwordLabel = new JLabel("Password:");
        JTextField passwordField = new JTextField(15);

        JPanel buttonPanel = new JPanel(new GridLayout(3, 2, 5, 5)); 
        buttonPanel.add(usernameLabel);
        buttonPanel.add(usernameField);
        buttonPanel.add(passwordLabel);
        buttonPanel.add(passwordField);
        buttonPanel.add(loginButton);

        JPanel logoPanel = new JPanel(new BorderLayout());
        logoPanel.add(logo, BorderLayout.CENTER);

        JPanel mainPanel = new JPanel(new BorderLayout());
        mainPanel.add(logoPanel, BorderLayout.CENTER);
        mainPanel.add(buttonPanel, BorderLayout.SOUTH);

        frame.add(mainPanel);

        loginButton.addActionListener(new ActionListener() 
        {
            public void actionPerformed(ActionEvent e) 
            {
                String username = usernameField.getText();
                String password = passwordField.getText();
                if (username.equals("bigbossdude"))
                {
                    if(password.equals("password"))
                    {
                        frame.dispose();
                        MainScreen();
                    }
                    else
                    {
                        frame.dispose();
                    }
                }
                else
                {
                    frame.dispose();
                }
            }
        });

        frame.setVisible(true);
    }

    
    //Creates the main hub page where the user can choose to do various things concerning employee information
    public void MainScreen()
    {
        JFrame frame = new JFrame("Employee Manager");

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
        frame.setSize(400, 400);
        frame.setLocationRelativeTo(null);

        //Set up a panel to display a title at the top of the screen
        JLabel titleLabel = new JLabel("Employee Manager");
        titleLabel.setFont(new Font("Arial", Font.BOLD, 20)); 

        JButton addEmpButton = new JButton("Add Employee");
        JButton editEmpButton = new JButton("Edit Employee");
        JButton deleteEmpButton = new JButton("Remove Employee");
        JButton evalEmpButton = new JButton("Evaluate Employee");
        JButton quitButton = new JButton("Quit");

        //Set up a panel to display buttons at the center of the screen
        JPanel buttonPanel = new JPanel(new GridLayout(2, 2, 10, 10)); 
        buttonPanel.add(addEmpButton);
        buttonPanel.add(editEmpButton);
        buttonPanel.add(deleteEmpButton);
        buttonPanel.add(evalEmpButton);

        //Set up a main panel that the other panels are added to and organized on screen along with a quit button at the bottom
        JPanel mainPanel = new JPanel(new BorderLayout());
        mainPanel.add(titleLabel, BorderLayout.NORTH);
        mainPanel.add(buttonPanel, BorderLayout.CENTER);
        mainPanel.add(quitButton, BorderLayout.SOUTH);

        frame.add(mainPanel);

        //Adds functionality to each button in the main panel
        addEmpButton.addActionListener(new ActionListener() 
        {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.dispose();
                addEmployeeScreen();
            }
        });

        editEmpButton.addActionListener(new ActionListener() 
        {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.dispose();
                editEmployeeScreen();
            }
        });

        deleteEmpButton.addActionListener(new ActionListener() 
        {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.dispose();
                removeEmployeeScreen();
            }
        });

        evalEmpButton.addActionListener(new ActionListener() 
        {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.dispose();
                evaluateEmployeeScreen();
            }
        });

        quitButton.addActionListener(new ActionListener() 
        {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.dispose();
            }
        });

        frame.setVisible(true);
    }

    public void addEmployeeScreen()
    {
        JFrame frame = new JFrame("Employee Information Sumbission");

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
        frame.setSize(400, 750);
        frame.setLocationRelativeTo(null);

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
        
        JPanel mainPanel = new JPanel(new BorderLayout());
        JPanel infoFields = new JPanel(new GridLayout(11, 2, 2, 2));
        JPanel buttons = new JPanel();

        JLabel nameLabel = new JLabel("Employee Name:");
        JLabel addressLabel = new JLabel("Address:");
        JLabel phoneNumberLabel = new JLabel("Phone Number:");
        JLabel emailLabel = new JLabel("Email Address:");
        JLabel prevJobLabel = new JLabel("Previous Job:");
        JLabel curJobLabel = new JLabel("Current Job:");
        JLabel supervisorLabel = new JLabel("Supervisor:");
        JLabel compNameLabel = new JLabel("Company Name:");
        JLabel experienceLabel = new JLabel("Amount of Experience:");
        JLabel hardSkillLabel = new JLabel("Hard Skills:");
        JLabel softSkillLabel = new JLabel("Soft Skills:");

        JTextField nameField = new JTextField(15);
        JTextField addressField = new JTextField(15);
        JTextField phoneNumberField = new JTextField(15);
        JTextField emailField = new JTextField(15);
        JTextField prevJobField = new JTextField(15);
        JTextField curJobField = new JTextField(15);
        JTextField supervisorField = new JTextField(15);
        JTextField compNameField = new JTextField(15);
        JTextField experienceField = new JTextField(15);
        JTextField hardSkillField = new JTextField(15);
        JTextField softSkillField = new JTextField(15);

        JButton submitInfoButton = new JButton("Submit");
        JButton returnToMainButton = new JButton("Return");

        infoFields.add(nameLabel);
        infoFields.add(nameField);
        infoFields.add(addressLabel);
        infoFields.add(addressField);
        infoFields.add(phoneNumberLabel);
        infoFields.add(phoneNumberField);
        infoFields.add(emailLabel);
        infoFields.add(emailField);
        infoFields.add(prevJobLabel);
        infoFields.add(prevJobField);
        infoFields.add(curJobLabel);
        infoFields.add(curJobField);
        infoFields.add(supervisorLabel);
        infoFields.add(supervisorField);
        infoFields.add(compNameLabel);
        infoFields.add(compNameField);
        infoFields.add(experienceLabel);
        infoFields.add(experienceField);
        infoFields.add(hardSkillLabel);
        infoFields.add(hardSkillField);
        infoFields.add(softSkillLabel);
        infoFields.add(softSkillField);

        buttons.add(submitInfoButton);
        buttons.add(returnToMainButton);

        mainPanel.add(infoFields);
        mainPanel.add(buttons, BorderLayout.SOUTH);

        frame.add(mainPanel);

        submitInfoButton.addActionListener(new ActionListener() 
        {
            public void actionPerformed(ActionEvent e) 
            {
                
            }
        });

        returnToMainButton.addActionListener(new ActionListener() 
        {
            public void actionPerformed(ActionEvent e) 
            {
                frame.dispose();
                MainScreen();
            }
        });

        frame.setVisible(true);
    }

    public void editEmployeeScreen()
    {
        JFrame frame = new JFrame("Employee Manager");

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
        frame.setSize(450, 750);
        frame.setLocationRelativeTo(null);

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
        
        JPanel mainPanel = new JPanel(new BorderLayout());
        JPanel infoFields = new JPanel(new GridLayout(11, 2, 2, 2));
        JPanel buttons = new JPanel();

        JLabel nameLabel = new JLabel("Employee Name:");
        JLabel addressLabel = new JLabel("Address:");
        JLabel phoneNumberLabel = new JLabel("Phone Number:");
        JLabel emailLabel = new JLabel("Email Address:");
        JLabel prevJobLabel = new JLabel("Previous Job:");
        JLabel curJobLabel = new JLabel("Current Job:");
        JLabel supervisorLabel = new JLabel("Supervisor:");
        JLabel compNameLabel = new JLabel("Company Name:");
        JLabel experienceLabel = new JLabel("Amount of Experience:");
        JLabel hardSkillLabel = new JLabel("Hard Skills:");
        JLabel softSkillLabel = new JLabel("Soft Skills:");

        JTextField nameField = new JTextField(15);
        JTextField addressField = new JTextField(15);
        JTextField phoneNumberField = new JTextField(15);
        JTextField emailField = new JTextField(15);
        JTextField prevJobField = new JTextField(15);
        JTextField curJobField = new JTextField(15);
        JTextField supervisorField = new JTextField(15);
        JTextField compNameField = new JTextField(15);
        JTextField experienceField = new JTextField(15);
        JTextField hardSkillField = new JTextField(15);
        JTextField softSkillField = new JTextField(15);

        JButton submitInfoButton = new JButton("Submit");
        JButton returnToMainButton = new JButton("Return");

        infoFields.add(nameLabel);
        infoFields.add(nameField);
        infoFields.add(addressLabel);
        infoFields.add(addressField);
        infoFields.add(phoneNumberLabel);
        infoFields.add(phoneNumberField);
        infoFields.add(emailLabel);
        infoFields.add(emailField);
        infoFields.add(prevJobLabel);
        infoFields.add(prevJobField);
        infoFields.add(curJobLabel);
        infoFields.add(curJobField);
        infoFields.add(supervisorLabel);
        infoFields.add(supervisorField);
        infoFields.add(compNameLabel);
        infoFields.add(compNameField);
        infoFields.add(experienceLabel);
        infoFields.add(experienceField);
        infoFields.add(hardSkillLabel);
        infoFields.add(hardSkillField);
        infoFields.add(softSkillLabel);
        infoFields.add(softSkillField);

        buttons.add(submitInfoButton);
        buttons.add(returnToMainButton);

        mainPanel.add(infoFields);
        mainPanel.add(buttons, BorderLayout.SOUTH);

        frame.add(mainPanel);

        submitInfoButton.addActionListener(new ActionListener() 
        {
            public void actionPerformed(ActionEvent e) 
            {
                
            }
        });

        returnToMainButton.addActionListener(new ActionListener() 
        {
            public void actionPerformed(ActionEvent e) 
            {
                frame.dispose();
                MainScreen();
            }
        });

        frame.setVisible(true);
    }

    public void removeEmployeeScreen()
    {
        JFrame frame = new JFrame("Employee Manager");

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
        frame.setSize(350, 200);
        frame.setLocationRelativeTo(null);

        JPanel mainPanel = new JPanel();
        JPanel instructionPanel = new JPanel(new GridLayout(2, 2, 2, 2));
        JPanel infoFields = new JPanel(new GridLayout(2, 2, 2, 2));
        JPanel buttons = new JPanel();

        JLabel empNameLabel = new JLabel("Employee Name:");
        JTextField empNameTextfield = new JTextField(15);

        JLabel firstInstructionLabel = new JLabel("Enter employee name and click remove");
        JLabel secondInstructionLabel = new JLabel("  to remove information from database.");

        JButton submitInfoButton = new JButton("Remove Employee from System");
        JButton returnToMainButton = new JButton("Return");

        instructionPanel.add(firstInstructionLabel);
        instructionPanel.add(secondInstructionLabel);

        infoFields.add(empNameLabel);
        infoFields.add(empNameTextfield);

        buttons.add(submitInfoButton);
        buttons.add(returnToMainButton);

        mainPanel.add(instructionPanel);
        mainPanel.add(infoFields);
        mainPanel.add(buttons, BorderLayout.SOUTH);
        
        frame.add(mainPanel);

        submitInfoButton.addActionListener(new ActionListener() 
        {
            public void actionPerformed(ActionEvent e) 
            {
                
            }
        });

        returnToMainButton.addActionListener(new ActionListener() 
        {
            public void actionPerformed(ActionEvent e) 
            {
                frame.dispose();
                MainScreen();
            }
        });

        frame.setVisible(true);
    }

    public void evaluateEmployeeScreen()
    {
        JFrame frame = new JFrame("Employee Manager");

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
        frame.setSize(350, 350);
        frame.setLocationRelativeTo(null);
        
        String empName;
        String evalSupervisor;
        String evalDate;
        String empMentalState;
        String notes;
        
        JPanel mainPanel = new JPanel(new BorderLayout());
        JPanel infoFields = new JPanel(new GridLayout(5, 2, 10, 10));
        JPanel bottomSection = new JPanel();
        
        JLabel empNameLabel = new JLabel("Employee Name:");
        JLabel evalSupervisorLabel = new JLabel("Supervisor:");
        JLabel evalDateLabel = new JLabel("Evaluation Date:");
        JLabel empMentalStateLabel = new JLabel("Employee's Mental State:");
        JLabel otherNotesLabel = new JLabel("Other Notes:");

        JTextField empNameField = new JTextField();
        JTextField evalSupervisorField = new JTextField();
        JTextField evalDateField = new JTextField();
        JTextField empMentalStateField = new JTextField();
        JTextField otherNotesField = new JTextField();
        
        JButton submitInfoButton = new JButton("Submit");
        JButton returnToMainButton = new JButton("Return");
        JLabel confirmationLabel = new JLabel();

        infoFields.add(empNameLabel);
        infoFields.add(empNameField);
        infoFields.add(evalSupervisorLabel);
        infoFields.add(evalSupervisorField);
        infoFields.add(evalDateLabel);
        infoFields.add(evalDateField);
        infoFields.add(empMentalStateLabel);
        infoFields.add(empMentalStateField);
        infoFields.add(otherNotesLabel);
        infoFields.add(otherNotesField);

        bottomSection.add(submitInfoButton);
        bottomSection.add(returnToMainButton);
        bottomSection.add(confirmationLabel);

        mainPanel.add(infoFields, BorderLayout.CENTER);
        mainPanel.add(bottomSection, BorderLayout.SOUTH);

        frame.add(mainPanel);

        submitInfoButton.addActionListener(new ActionListener() 
        {
            public void actionPerformed(ActionEvent e) 
            {
                
            }
        });

        returnToMainButton.addActionListener(new ActionListener() 
        {
            public void actionPerformed(ActionEvent e) 
            {
                frame.dispose();
                MainScreen();
            }
        });

        frame.setVisible(true);
    }
}
