package week2.company;

public class SysAdmin extends Employee{
    String osKnowlege = "linux";

    public SysAdmin() {
    }

    public SysAdmin(String name, int age, int salary, String osKnowlege) {
        super(name, age, salary);
        this.osKnowlege = osKnowlege;
    }
    public void resetPC(){
        System.out.println("Reset your PC");
    }

    @Override
    public void doCoffee(){
        System.out.println("I drink espresso");
    }

    public String toString(){
        return super.toString() +" I know " + osKnowlege;
    }
}
