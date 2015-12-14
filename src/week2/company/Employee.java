package week2.company;


public class Employee {
    private String name = "Ivan";
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

    public boolean equals(Object o){
        if(this == o) return true;

        if(this.getClass() != o.getClass()) return false;

        Employee tmp = (Employee)o;

        if(!this.name.equals(tmp.name)) return false;
        if(this.age != tmp.age) return false;
        return true;


    }

    public String toString(){
        return String.format("My name is %s, I'm %d", name, age);
    }

}
