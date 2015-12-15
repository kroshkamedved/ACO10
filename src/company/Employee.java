package company;


public class Employee {
    private String name;
    private int age;
    private int salary;

    public Employee(String name, int age, int salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    public Employee() {
    }
    
    public void doCoffee(){
        System.out.println("Drink coffee");
    }

    public  String toString(){
        return String.format("My name is %s, I'm %d", name, age);

    }

}
