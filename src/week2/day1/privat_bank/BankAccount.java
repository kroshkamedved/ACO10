package week2.day1.privat_bank;

public class BankAccount {
    private String userName;
    private long cash;
    private String pass;

    public BankAccount(){

    }

    public BankAccount(String name,
                       long cash,
                       String pass){
        this.userName = name;
        this.cash = cash;
        this.pass = pass;
    }

    public BankAccount(String name,
                       long money){
        this.userName = name;
        this.cash = money;
    }

    public long getCash(){
        return cash;
    }

    public void setCash(long cash){
        this.cash += cash;
        System.out.println("Operation is success");

    }


    public long takeMoney(long money, String pass){
        if(pass.equals(this.pass)){
            if(money > cash){
                System.err.println("Not enough money!");
                return 0;
            }
            cash -= money;
            return money;
        } else{
            System.err.println("Wrong pass");
            return 0;
        }

    }

}
