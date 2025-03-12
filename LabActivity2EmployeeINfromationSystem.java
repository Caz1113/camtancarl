import java.util.Scanner;    

    public class LabActivity2EmployeeINfromationSystem {
        public static void main(String[] args) {
    
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        System.out.print("Enter your age: ");
        int age = scanner.nextInt();

        System.out.print("Enter hours worked: ");
        double hours_worked = scanner.nextDouble();

        System.out.print("Enter salary per hour: ");
        double salary_per_hour = scanner.nextDouble();

        System.out.print("Enter tax rate (as a decimal): ");
        double taxRate = scanner.nextDouble();

        double totalSalary = hours_worked * salary_per_hour;
        double netSalary = totalSalary - (totalSalary * taxRate);
        
        System.out.println("\nEmployee Information:");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Hours Worked: " + hours_worked);
        System.out.println("Salary Per Hour: " + salary_per_hour);
        System.out.println("Monthly wage = Weekly wage * 4" );
        System.out.println("Gross yearly wage = Monthly wage * 12 ");
        System.out.println("Total Salary Before Tax: " + totalSalary);
        System.out.println("Net Salary After Tax: " + netSalary);


        scanner.close();
    }
}
