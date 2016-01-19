package ClassWork;

/**
 * Created by gavri on 06.12.2015.
 */
public class TestCat {
    public static void main(String[] args) {
        Cat kitten = new Cat("Vaska", 7, "cat");
        //System.out.println(kitten.sayMeow());
        System.out.println(kitten);
        Bike moto = new Bike(1999, "Street fighter", "dark", 999);
        moto.sellMoto();
    }
}
