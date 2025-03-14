import java.util.Scanner;

public class LabActivity2EmployeeINfromationSystem {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your first name: ");
        String firstName = scanner.nextLine();

        System.out.print("Enter your last name: ");
        String lastName = scanner.nextLine();

        System.out.print("Enter your age: ");
        int age = scanner.nextInt();

        System.out.print("Enter hours worked: ");
        float NoOfHoursWorked = scanner.nextFloat();

        System.out.print("Enter hourly wage: ");
        float hourlyWage = scanner.nextFloat();

        int yearsToRetire = 70 - age;
        double dailySalary = NoOfHoursWorked * hourlyWage;
        double weeklySalary = dailySalary * 5;
        double monthlySalary = weeklySalary * 4;
        double grossYearlySalary = monthlySalary * 12;
        double thirtyTwoPercent = grossYearlySalary * 0.32;
        double netYearlySalary = grossYearlySalary - thirtyTwoPercent - 1500;

        System.out.println("Employee Information");
        System.out.println("Full Name: " + firstName + " " + lastName);
        System.out.println("Age: " + age + " years old");
        System.out.println("Years to Retirement: " + yearsToRetire + " years");
        System.out.println("Daily Salary: PHP " + dailySalary);
        System.out.println("Weekly Salary: PHP " + weeklySalary);
        System.out.println("Monthly Salary: PHP " + monthlySalary);
        System.out.println("Gross Yearly Salary: PHP " + grossYearlySalary);
        System.out.println("Net Yearly salary: PHP " + netYearlySalary);

        scanner.close();
    }
}
