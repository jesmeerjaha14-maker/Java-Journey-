public class employeemanagement {
    int employeeId;
    String employeeName;    
    String Department;
    String Designation;
    double basicSalary,hra,da,grossSalary;
    employeemanagement(int employeeId, String employeeName, String Department, String Designation, double basicSalary) {
        this.employeeId = employeeId;
        this.employeeName = employeeName;
        this.Department = Department;
        this.Designation = Designation;
        this.basicSalary = basicSalary;
    }
    void calculateSalary() {
        hra = 0.1 * basicSalary;
        da = 0.2 * basicSalary;
        grossSalary = basicSalary + hra + da;
    }
    public void display() {
        System.out.println("Employee ID: " + employeeId);
        System.out.println("Employee Name: " + employeeName);
        System.out.println("Department: " + Department);
        System.out.println("Designation: " + Designation);
        System.out.println("Basic Salary: " + basicSalary);
        System.out.println("HRA: " + hra);
        System.out.println("DA: " + da);
        System.out.println("Gross Salary: " + grossSalary);
    }
    public static void main(String[] args) {
        employeemanagement emp = new employeemanagement(101, "harshitha", "IT", "Software Engineer", 50000);
        employeemanagement emp2 = new employeemanagement(102, "suman", "HR", "HR Manager", 60000);
        employeemanagement emp3 = new employeemanagement(103, "ramya", "Finance", "Accountant", 80000);
       emp.calculateSalary();
        emp2.calculateSalary();
        emp3.calculateSalary();
        emp.display();
        emp2.display();
        emp3.display();
    }
}