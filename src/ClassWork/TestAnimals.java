package ClassWork;

/**
 * Created by gavri on 12.12.2015.
 */
public class TestAnimals {
    public static void main(String[] args) {
        Cat kitty = new Cat("Murzzy", 3);
        Dog king = new Dog("Asik", 6);
        kitty.SayMyau();
        kitty.SayYourName();
        king.SayGaw();
        king.SayYourName();
        kitty.SayYourName();
    }
}