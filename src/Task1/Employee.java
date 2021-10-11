package Task1;

public class Employee extends Person {
    private String nameCompany;
    private static String sphere;

    public Employee(String name, String nameCompany) {
        super(name);
        this.nameCompany = nameCompany;
    }
    static {
        sphere = "Finance";

    }
}
