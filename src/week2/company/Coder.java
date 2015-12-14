package week2.company;


public class Coder extends Employee {
    String programmingLanguage = "Java";

    public Coder() {
    }

    public Coder(String name, int age, int salary, String programmingLanguage) {
        super(name, age, salary);
        this.programmingLanguage = programmingLanguage;
    }
    public void doCoffee(){
        System.out.println("Drink coffee with whiskey");
    }

    public void writeCode(){
        System.out.println("01101010101");
    }

       public String toString(){
        return super.toString() +" I know " + programmingLanguage;
    }
}
