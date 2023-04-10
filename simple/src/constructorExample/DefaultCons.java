package constructorExample;

public class DefaultCons {
    private static String name;
    public DefaultCons() {
        name = "suyog";
    }
    public static void main(String[] args) {
        DefaultCons defaultCons = new DefaultCons();
        System.out.println("the value of name is :" + name);
    }
}
