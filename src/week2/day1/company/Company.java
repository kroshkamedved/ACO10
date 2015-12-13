package week2.day1.company;

public class Company {
    public static void main(String[] args) {
        Secretary secretary = new Secretary("Natasha", 20, 500, 2000);
        Manager manager = new Manager("Mike", 35, 1200, secretary);
        Coder coder = new Coder();
        Coder coder2 = new Coder();
        Coder coder3 = new Coder();
        SysAdmin sysAdmin = new SysAdmin();
        SysAdmin sysAdmin2 = new SysAdmin();
        SysAdmin sysAdmin3 = new SysAdmin();

        manager.addSysAdmin(sysAdmin);
        manager.addSysAdmin(sysAdmin2);
        manager.addSysAdmin(sysAdmin3);
        manager.addCoder(coder);
        manager.addCoder(coder2);
        manager.addCoder(coder3);

    }

}
