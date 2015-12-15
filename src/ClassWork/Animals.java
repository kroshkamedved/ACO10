package ClassWork;

/**
 * Created by gavri on 12.12.2015.
 */
public class Animals {
    public String name;
    public int age;

    public Animals(String name, int age) {
        this.name = name;
        this.age = age;
    }


    public void SayYourName (){
        System.out.println("My name is" + name);
    }
}
