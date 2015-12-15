package company;


import java.util.ArrayList;

public class Manager extends Employee{
// ArrayList
    private Secretary secretary;
    ArrayList<Coder> coders = new ArrayList<>();
    ArrayList<SysAdmin>sysAdmins = new ArrayList<>();
    ArrayList<Employee>employees = new ArrayList<>();

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

    public void showMyTeam(){
        int i = 0;
        System.out.println("My coders:");
        while(i < coders.size()){
            System.out.print(coders.get(i).greettings());
             i++;
        }
    }

    public void showWorkers(){
        for (Coder coder : coders) {

        }
    }
}
