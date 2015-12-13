package week2.day1.company;


import java.util.ArrayList;

public class Manager extends Employee{
// ArrayList
    private Secretary secretary;
    ArrayList<Coder> coders;
    ArrayList<SysAdmin>sysAdmins;
    ArrayList<Employee>employees;

    public Manager(String name, int age, int salary, Secretary secretary) {
        super(name, age, salary);
        this.secretary = secretary;
    }

    public Manager() {
    }

    public void addCoder(Coder coder){
        coders.add(coder);
        System.out.println("You've hired coder");

    }
    public void deleteCoder(Coder coder){
        coders.remove(coder);
        System.out.println("You've fired coder");

    }

    public void addSysAdmin(SysAdmin sysAdmin){
        sysAdmins.add(sysAdmin);
        System.out.println("You've hired sysAdmin");

    }
    public void deleteSysAdmin(SysAdmin sysAdmin){
        sysAdmins.remove(sysAdmin);
        System.out.println("You've fired sysAdmin");

    }



    public void countMoney(){
        System.out.println("I'm count money");
    }

    public void makeWorkProcess(){

    }

}
