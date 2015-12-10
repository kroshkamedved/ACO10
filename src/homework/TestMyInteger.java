package homework;

/**
 * Created by gavri on 06.12.2015.
 */
public class TestMyInteger {
    public static void main(String[] args) {
        MyInteger num1 = new MyInteger(89);
        int sum = num1.add(11);
        System.out.println(sum);

        MyInteger num2 = new MyInteger(5);
        System.out.println(num2.exponentiation(3));

        System.out.println(num2.factorial());

        System.out.println(num2.modulo(5));

        num2.whichNumisBigger(2);

    }
}
