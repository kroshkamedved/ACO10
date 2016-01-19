package Formatter;

import java.util.Formatter;

/**
STING.FORMAT TEST & printf test;
 */
public class TestFormatter {
    public static void main(String[] args) {

        int a = 1;
        String b = "-bla-bla";
            String c =  String.format("We are writing some %s shit %d time per day",b,a);
        System.out.println(c);
            System.out.printf("We are writing some %s shit %d time per day",b,a);


    }
}
