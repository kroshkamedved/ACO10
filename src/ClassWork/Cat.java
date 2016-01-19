package ClassWork;

/**
 * Created by gavri on 06.12.2015.
 */
public class Cat {
    String name;
    int age;
    String kind;

    public Cat(){

    }

    public  Cat(String name,int age, String kind ) {
        this.name = name;
        this.age = age;
        this.kind = kind;
    }

    public String sayMeow(){
        return String.format("Hello, my name is \"%s\", I'm %d years old, my kind is %s\n"
                ,name,age,kind);

    }
        @Override
    public  String toString(){
            return String.format("Hello, my name is \"%s\", I'm %d years old, my kind is %s\n"
                    ,name,age,kind);
        }
}
