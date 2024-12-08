package task3;
import java.util.Scanner;

// Interface Taxable with members salesTax and incomeTax and abstract method calcTax
interface Taxable {
    double salesTax = 0.07; // 7%
    double incomeTax = 0.105; // 10.5%

    double calcTax();
}

// Employee class implementing Taxable to calculate incomeTax on yearly salary
class Employee implements Taxable {
    int empId;
    String name;
    double salary;

    // Constructor for Employee class
    public Employee(int empId, String name, double salary) {
        this.empId = empId;
        this.name = name;
        this.salary = salary;
    }

    // Implementation of calcTax() method for Employee class
    @Override
    public double calcTax() {
        return salary * incomeTax;
    }
}

// Product class implementing Taxable to calculate salesTax on unit price of product
class Product implements Taxable {
    int pid;
    double price;
    int quantity;

    // Constructor for Product class
    public Product(int pid, double price, int quantity) {
        this.pid = pid;
        this.price = price;
        this.quantity = quantity;
    }

    // Implementation of calcTax() method for Product class
    @Override
    public double calcTax() {
        return price * salesTax;
    }
}

// Driver class with main method to accept employee and product information and print taxes
public class DriverMain {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        // Input employee information from user
        System.out.println("Enter employee details:");
        System.out.print("Employee ID: ");
        int empId = scanner.nextInt();
        System.out.print("Employee Name: ");
        String name = scanner.next();
        System.out.print("Employee Salary: ");
        double salary = scanner.nextDouble();

        // Create Employee object
        Employee employee = new Employee(empId, name, salary);

        // Calculate and print income tax
        System.out.println("Income Tax: " + employee.calcTax());

        // Input product information from user
        System.out. println("Enter product details:");
        System.out.print("Product ID: ");
        int pid = scanner.nextInt();
        System.out.print("Product Price: ");
        double price = scanner.nextDouble();
        System.out.print("Product Quantity: ");
        int quantity = scanner.nextInt();

        // Create Product object
        Product product = new Product(pid, price, quantity);

        // Calculate and print sales tax
        System.out.println("Sales Tax: " + product.calcTax());
    }
}
