package constructorExample;

public class DefaultCons {
    private String name;

    public DefaultCons() {
        name = "suyog";
    }

    public static void main(String[] args) {
        DefaultCons defaultCons = new DefaultCons();
        System.out.println(defaultCons.name);
    }
}
