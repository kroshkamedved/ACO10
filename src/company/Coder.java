package company;


public class Coder extends Employee {
    String programmingLanguage;

    public Coder() {
    }

    public Coder(String name, int age, int salary, String programmingLanguage) {
        super(name, age, salary);
        this.programmingLanguage = programmingLanguage;
    }
    public void writeCode(){
        System.out.println("01101010101");
    }

    public String greettings(){
        return super.toString() + "I know" + programmingLanguage;
    }
}
