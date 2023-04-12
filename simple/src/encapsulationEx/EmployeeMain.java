package encapsulationEx;

public class EmployeeMain {
    public static void main(String[] args) {
        Employee EmplyesObj = new Employee();
        EmplyesObj.setName("suyog");
        System.out.println("the name of empoyles is :");
        EmplyesObj.getName();
        EmplyesObj.setId(20);
        System.out.println("Id is here :");
        EmplyesObj.getId();
    }
}