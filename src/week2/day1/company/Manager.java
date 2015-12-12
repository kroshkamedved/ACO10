package week2.day1.company;


public class Manager extends Employee{

    private Secretary secretary;

    public Manager(String name, int age, int salary, Secretary secretary) {
        super(name, age, salary);
        this.secretary = secretary;
    }

    public Manager() {
    }

    public void countMoney(){
        System.out.println("I'm count money");
    }
}
