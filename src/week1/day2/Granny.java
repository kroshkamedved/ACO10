package week1.day2;


public class Granny {
    String name;
    int age;
    Cat cat;

    public Granny(String name, int age, Cat cat){
        this.age = age;
        this.name = name;
        this.cat = cat;
    }

    @Override
    public String toString() {
        return "Granny{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
