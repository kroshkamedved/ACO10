package week2.day1.company;

public class Company {
    public static void main(String[] args) {
        Secretary secretary = new Secretary("Natasha", 20, 500, 2000);
        Manager manager = new Manager("Mike", 35, 1200, secretary);
        manager.countMoney();
        manager.doCoffee();

    }

}
