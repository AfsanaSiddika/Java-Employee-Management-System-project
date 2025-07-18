import java.util.ArrayList;
import javax.swing.*;

 public class Employee {
    public String name;   public String id;   public String designation;   public double salary;
    public Employee (String name, String id, String designation, double salary) {
        this.name = name;
        this.id = id;
        this.designation = designation;
        this.salary = salary;
    }
    public void increaseSalary(double amt){
        salary += amt;
     }
    public void promote(String designation, double newSalary){
         this.designation = designation;
         salary = newSalary;
     }
    public String getId() {
        return id;
    }
    public double getSalary() {
        return salary;
    }

    public void display() {
        System.out.println("The employee's name :"+name+"\nId :"+id+"\nDesignation :"+designation+"\nSalary :"+salary);
    }
}
class UapCse {
    public ArrayList<Employee> employees;
    public String department;

    public UapCse(String department) {
        employees = new ArrayList<>();
        this.department = department;
    }

    private void addNewEmployee(Employee e) {
        this.employees.add(e);           // taking an object of type Employee as a parameter and adds it to the employees
    }

    public void addNewEmployee(String nm, String id, String des, double sal) {
//        Employee obj = new Employee(nm, id, des, sal);
//        employees.add(obj);
        Employee e = new Employee(nm, id, des, sal);
        this.addNewEmployee(e);                         // Calling the first addNewEmployee method by passing the newly created Employee object as a parameter.
    }
    private Employee findEmployee(String id) {
//        for (int i = 0; i < employees.size(); i++)
//            Employee e = employees.get(i) ;
        for (Employee e : this.employees) {
            if (e.getId().equals(id))        // Through the e reference type calling getId method of Employee class
            {
                return e;
            }
        }
        return null;
    }

    public void increaseSalary (String id,double amt){
        Employee e = findEmployee(id);
        if (e != null) {
            e.increaseSalary(amt);             // Through the e reference type calling increaseSalary method of Employee class
        }else {
            JOptionPane.showMessageDialog(null, "Employee not found.");
        }
    }


    public void promote(String id, String newDesignation, double newSalary) {
        Employee e = findEmployee(id);
        if(e != null){
            e.promote(newDesignation,newSalary);     // Through the e reference type calling promote method of Employee class
        }else {
            JOptionPane.showMessageDialog(null, "Employee not found.");
        }
    }

    public  double getSalary(String id) {
        Employee e = findEmployee(id);
        if (e != null) {
            e.getSalary();
//            return e.getSalary();   // Through the e reference type calling getSalary method of Employee class
        } else {
            JOptionPane.showMessageDialog(null, "Employee not found.");
            return 0;
        }
        return 0;
    }
    void display(String id){
        if(employees.size()==0 ){
            System.out.println("no enter's yet!");
        }
        Employee e = findEmployee(id);
        if(e != null){
            e.display();
        }else {
            JOptionPane.showMessageDialog(null, "Employee not found.");
        }
    }
    void display(){
        if(employees.size()==0 ){
            System.out.println("no enter's yet!");
        }
        for (Employee e : employees){
            e.display();
        }
    }
 }
 class Uap{
     public static void main(String[] args) {

         UapCse myUap = new UapCse("CSE");   // Created object of second class "UapCse"


         while (true){
             String option = JOptionPane.showInputDialog(null,"Enter -\n‘1’ to add a new Employee.\n ‘2’ to get Salary info of a specific Employee.\n ‘3’ to increase the salary of an Employee.\n ‘4’ to promote an Employee.\n ‘5’ to display the details of a specific Employee.\n ‘6’ to display the list of the Employees.\n '0' to exit the system ");
                switch (option){
                    case "1":
//                        add new employee
//                        JOptionPane.showMessageDialog("null","Enter Employee's info : ");
//                        for (Employee e: myUap.employees){
//                            if(e == null) {
                                String name = JOptionPane.showInputDialog("Enter the name of employee :");
                                String id = JOptionPane.showInputDialog("Enter the id of employee :");
                                String designation = JOptionPane.showInputDialog("Enter the post of employee :");
                                String salary = JOptionPane.showInputDialog("Enter the salary of employee :");
                                double data = Double.parseDouble(salary);
                                myUap.addNewEmployee(name,id,designation,data);    // Through the myUap reference type calling addNewEmployee method of UapCse class
                                JOptionPane.showMessageDialog(null, "Employee added successfully!");
                                break;
//                            }
//                        }
//                        break;
                    case "2":
//                        get salary
                        String id1 = JOptionPane.showInputDialog("Enter the id of employee :");
                        myUap.getSalary(id1);
                        double salaryInfo = myUap.getSalary(id1);   // Through the myUap reference type calling getSalary method of UapCse class
                        JOptionPane.showMessageDialog(null, "Salary: " + salaryInfo);
                        break;

                    case "3":
//                        increase the Salary of a specific Employee
//                        parameters are String id,double amt

                        String id4 = JOptionPane.showInputDialog("Enter the id of employee :");
                        String salary4 = JOptionPane.showInputDialog("Enter the salary of employee :");
                        double amt = Double.parseDouble(salary4);
                        myUap.increaseSalary(id4,amt);               // Through the myUap reference type calling increaseSalary method of UapCse class
                        JOptionPane.showMessageDialog(null, "Employee salary increased successfully!");
                        break;
                    case "4":
//                      promote an Employee
//                      parameters are String id, String newDesignation, double newSalary

                        String id2 = JOptionPane.showInputDialog("Enter the id of employee :");
                        String newDesignation = JOptionPane.showInputDialog("Enter the new post of that employee :");
                        String newSalary = JOptionPane.showInputDialog("Enter the salary of employee :");
                        double data3 = Double.parseDouble(newSalary);
                        myUap.promote(id2,newDesignation,data3);          // Through the myUap reference type calling promote method of UapCse class
                        JOptionPane.showMessageDialog(null, "Employee promoted successfully!");
                        break;
                    case "5":
//                        display info of an employee
                        String id3 = JOptionPane.showInputDialog("Enter the id of employee :");
                        myUap.display(id3);

                        break;
                    case "6":
//                        display the list of employee
                        myUap.display();
                        break;

                    case "0":
                        System.out.println("Exiting the system...");
                        break;
                    default:
                        JOptionPane.showMessageDialog(null, "Invalid input!");
                        break;
                 }
           }
     }
}
