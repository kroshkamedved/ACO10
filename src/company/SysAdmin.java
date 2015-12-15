package company;

public class SysAdmin extends Employee{
    String osKnowlege;

    public SysAdmin() {
    }

    public SysAdmin(String name, int age, int salary, String osKnowlege) {
        super(name, age, salary);
        this.osKnowlege = osKnowlege;
    }
    public void resetPC(){
        System.out.println("Reset your PC");
    }
}
