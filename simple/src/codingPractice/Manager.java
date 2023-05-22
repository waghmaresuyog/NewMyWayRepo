package codingPractice;

public class Manager extends Employee{

    public Manager(int salary) {
        super(salary);
    }
    public void work(){
        System.out.println("Managing employees");
    }
    public void addEmployee()
    {
        System.out.println("adding new employee");
    }
}
