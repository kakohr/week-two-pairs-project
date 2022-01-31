package com.techelevator;

import javax.print.attribute.standard.MediaSize;
import javax.security.auth.login.AccountNotFoundException;
import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Application {

    //we need three list here, employee departments and projects.

    List<Department>Departments = new ArrayList<Department>();
    List<Employee>Employees = new ArrayList<Employee>();
    List<Project>Projects = new ArrayList<Project>();

    /**
     * The main entry point in the application
     * @param args
     */

    public static void main(String[] args) {
        Application app = new Application();
        app.run();
    }

    private void run() {
        // create some departments
        createDepartments();

        Department Marketing = new Department(1,"Marketing");
        Department Sales = new Department(2, "Sales");
        Department Engineering = new Department(3, "Engineering");


        // print each department by name
        printDepartments();

        System.out.println(Marketing.getName());
        System.out.println(Sales.getName());
        System.out.println(Engineering.getName());


        // create employees
        createEmployees();

        Employee Dean = new Employee();
           Dean.setDepartment(Engineering);
           Dean.setEmail("djohnson@teams.com");
           Dean.setEmployeeId(1);
           Dean.setFirstName("Dean");
           Dean.setLastName("Johnson");
           Dean.setHireDate("08/21/2020");

        Employee Angie = new Employee(2, "Angie",
                "Smith", "asmith@teams.com",
                Engineering, "08/21/2020");
        Employee Margaret = new Employee(3,
                "Margaret", "Thompson",
                "mthompson@teams.com", Marketing, "08/21/2020" );


        // give Angie a 10% raise, she is doing a great job!

        Angie.raiseSalary(10);


        // print all employees
        printEmployees();


        System.out.println(Dean.getFullName() + " (" +
                Dean.getSalary() + ") " + Dean.getDepartment());
        System.out.println(Angie.getFullName() + " (" +
                Angie.getSalary() + ") " + Angie.getDepartment());
        System.out.println(Margaret.getFullName() + " (" +
                Margaret.getSalary() + ") " + Margaret.getDepartment());


        // create the Teams project
        createTeamsProject();

        Map<String, Project> projects = new HashMap<String, Project>();

        Project firstProject = new Project("TEams",
                "Project Management Software","10/10/2020",
                "11/10/20");

       firstProject.addTeamMember(Angie);
       firstProject.addTeamMember(Dean);

       projects.put("TEams", firstProject);

        // create the Marketing Landing Page Project
        createLandingPageProject();

        Project secondProject = new Project("Marketing Landing Page",
                "Lead Capture Landing Page for Marketing",
                "10/10/2020", "10/17/2020");

        secondProject.addTeamMember(Margaret);

        projects.put("Marketing Landing Page", secondProject);

        // print each project name and the total number of employees on the project
        printProjectsReport();

        System.out.println(firstProject.getName() + ": " + firstProject.getTeamMembers().size());
        System.out.println(secondProject.getName() + ": " + secondProject.getTeamMembers().size());

    }

    /**
     * Create departments and add them to the collection of departments
     */
    private void createDepartments() {
    }

    /**
     * Print out each department in the collection.
     */
    private void printDepartments() {
        System.out.println("------------- DEPARTMENTS ------------------------------");

    }

    /**
     * Create employees and add them to the collection of employees
     */
    private void createEmployees() {

    }

    /**
     * Print out each employee in the collection.
     */
    private void printEmployees() {
        System.out.println("\n------------- EMPLOYEES ------------------------------");

    }

    /**
     * Create the 'TEams' project.
     */
    private void createTeamsProject() {

    }

    /**
     * Create the 'Marketing Landing Page' project.
     */
    private void createLandingPageProject() {

    }

    /**
     * Print out each project in the collection.
     */
    private void printProjectsReport() {
        System.out.println("\n------------- PROJECTS ------------------------------");

    }

}
