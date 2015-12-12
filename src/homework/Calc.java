package homework;

import java.util.Scanner;

/**
 Написать калькулятор в виде консольного меню
 - сложение двух чисел
 - вычитание двух чисел
 - умножение двух чисел
 - деление двух чисел
 */
public class Calc {
    double sum;
    double quotient;
    double product;
    double difference;


public  double adding(){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter first number");
    double firstNumber = sc.nextDouble();
    System.out.println("Enter second number");
    double secondNumber = sc.nextDouble();
    sum = firstNumber + secondNumber;
    return sum;
}







}
