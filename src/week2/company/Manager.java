package week2.company;


import java.util.ArrayList;

public class Manager extends Employee{
// ArrayList
    private Secretary secretary;
   /* ArrayList<Coder> coders = new ArrayList<>();
    ArrayList<SysAdmin>sysAdmins = new ArrayList<>();*/
    ArrayList<Employee>employees = new ArrayList<>();

    public Manager(String name, int age, int salary, Secretary secretary) {
        super(name, age, salary);
        this.secretary = secretary;

    }

    public Manager() {
    }

    public void addWorker(Employee employee){
        employees.add(employee);
        System.out.println("You've hired Worker");
    }

    public void deleteWorker(Employee employee){
        employees.remove(employee);
        System.out.println("You've fired Worker");

    }

   /* public void addCoder(Coder coder){
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
*/
    public void showWorkers(){
        for (Employee employee : employees) {
            System.out.println(employee);
        }
    }

    public void countMoney(){
        System.out.println("I'm count money");
    }

    public void makeWorkProcess(){
        for (Employee employee : employees) {
            if(employee instanceof Coder){
                Coder coder = (Coder)employee;
                coder.writeCode();
            } else if(employee instanceof SysAdmin){
                SysAdmin sysAdmin = (SysAdmin)employee;
                ((SysAdmin) employee).resetPC();
            }
        }
    }

    public void makeBreak(){
        for (Employee employee : employees) {
            employee.doCoffee();
        }
    }

}
