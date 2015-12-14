package week2.day2;

import java.util.ArrayList;

public class TestArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        System.out.println(numbers.size());
        numbers.add(45);
        System.out.println(numbers.size());
        numbers.add(1, 12);
        System.out.println(numbers.size());
        numbers.add(1, 13);
        numbers.add(14);
        System.out.println(numbers.size());
        System.out.println(numbers.get(1));
        System.out.println(numbers.get(2));
        numbers.set(1, 14);
        System.out.println(numbers.get(1));
        numbers.remove(new Integer(14));
        System.out.println("Hello");

    }
}
