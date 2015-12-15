package company;


public class Secretary extends Employee {
   private int extraMoney;

    public Secretary(String name, int age, int salary, int extraMoney) {
        super(name, age, salary);
        this.extraMoney = extraMoney;
    }

    public Secretary() {
    }

    public void answerPhone(){
        System.out.println("Hello!!");
    }
}
