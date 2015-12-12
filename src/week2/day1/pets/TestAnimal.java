package week2.day1.pets;


import week2.day1.pets.Cat;
import week2.day1.pets.Dog;

public class TestAnimal {
    public static void main(String[] args) {
        Cat cat = new Cat("Vas'ks", 3);
        Dog dog = new Dog("Gychka", 5);
        cat.doAct();
        dog.doAct();
    }
}
