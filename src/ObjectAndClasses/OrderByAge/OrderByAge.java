package ObjectAndClasses.OrderByAge;

public class OrderByAge {

    private String name;
    private String id;
    protected int age;


    public OrderByAge(String name, String id, int age) {
        this.name = name;
        this.id = id;
        this.age = age;
    }

    @Override
    public String toString() {
        return name + " with ID: " + id + " is " + age + " years old.";
    }
}