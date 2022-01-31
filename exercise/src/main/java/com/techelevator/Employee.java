package com.techelevator;

public class Employee {
    private long employeeId;
    private String firstName;
    private String lastName;
    private String email;
    private double salary;
    private Department department;
    private String hireDate;



    private static final double STARTING_SALARY = (60000.00);

     public Employee(long employeeId, String firstName, String lastName,
                    String email, Department department, String hireDate) {
        this.employeeId = employeeId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.department = department;
        this.hireDate = hireDate;
        this.salary = STARTING_SALARY;
    }

    public Employee() {
        this(0, null, null, null,
                null, null);
    }


    public long getEmployeeId() {
        return employeeId;
    }
    public void setEmployeeId(long employeeId) {
        this.employeeId = employeeId;
    }
// Long only needs an L in the literal.

    public String getFirstName() {
        return firstName;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }


    public String getLastName() {
        return lastName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }


    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }


    public String getDepartment() {
        return (department.getName());
    }
    public void setDepartment(Department department) {
        this.department = department;
    }


    public String getHireDate() {
        return hireDate;
    }
    public void setHireDate(String hireDate) {
        this.hireDate = hireDate;
    }


    public String getFullName() {
        return (lastName + ", " + firstName);
    }


    public double getSalary() {
         return salary;
    }
    public void raiseSalary(double percent) {
       this.salary = ((percent / 100) * salary) + salary;
    }
}

// The default starting salary for all employees is $60,000 and is stored in a static constant variable of type double  *done*

// Employee needs two constructors     *done*

/*The first one accepts all the arguments needed to create a new Employee:
employeeID, firstName, lastName, email, department, and hireDate

Note: The first constructor doesn't include a double argument for the salary. Make sure to initialize each employees'
 salary to the static constant you created.*/

/* The second constructor is a no-argument constructor. This constructor allows you to create your Employee
 objects in multiple ways. */

/* employee's full name in the following format: "Last, First"| | raiseSalary(double percent) |
A method that raises the employee's salary by x percent  */

