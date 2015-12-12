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


public void action(){

    System.out.println("Enter first number");
    Scanner sc = new Scanner(System.in);
    double firstNumber = sc.nextDouble();
    System.out.println("Enter second number");
    double secondNumber = sc.nextDouble();
    System.out.println("Enter action symbol");
    char action =sc.next().charAt(0);
    if (action == '/'){
        quotient = firstNumber / secondNumber;
        System.out.println(firstNumber / secondNumber );
    }
    if (action == '+'){
        sum = firstNumber + secondNumber;
        System.out.println(firstNumber + secondNumber );
    }
    if (action == '-'){
        difference = firstNumber - secondNumber;
        System.out.println(firstNumber - secondNumber );
    }
    if (action == '*'){
        product = firstNumber * secondNumber;
        System.out.println(firstNumber * secondNumber );
    }
}







}
