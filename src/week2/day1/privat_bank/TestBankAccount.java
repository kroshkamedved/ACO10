package week2.day1.privat_bank;

public class TestBankAccount {
    public static void main(String[] args) {
        BankAccount bankAccount =
                new BankAccount("Bill Gates", 1_000_000, "windows");
        System.out.println(bankAccount.getCash());
//        bankAccount.putMoney(500);
//        System.out.println(bankAccount.takeMoney(2_000_000, "windows"));
//        bankAccount.cash = 2_000_000_000;
        System.out.println(bankAccount.getCash());



    }
}
