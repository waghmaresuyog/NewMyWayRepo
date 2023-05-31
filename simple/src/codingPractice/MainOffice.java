package codingPractice;

public class MainOffice {
    public static void main(String[] args) {
        Employee employee = new Employee(50000);
        Manager manager = new Manager(60000);
        employee.work();
        System.out.println("Employee salary is : " +employee.getSalary());
        manager.work();
        System.out.println("Manager salary is :" + manager.getSalary());
        manager.addEmployee();
    }
}
