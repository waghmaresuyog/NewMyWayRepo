package encapsulationEx;

public class Employee {

    private String name;
    private int id;
    public void setName(String s) {
        name=s;
    }
    public void getName() {
        System.out.println(name);
    }

    public void setId(int id) {
        this.id = id;
    }
    public void getId()
    {
        System.out.println(id);
    }
}
