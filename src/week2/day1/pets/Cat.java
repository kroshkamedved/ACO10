package week2.day1.pets;

public class Cat extends Animal{
    public Cat(String name, int age) {
        super(name, age);
    }
    public void doAct(){
        System.out.println("Meow!");
    }
}
