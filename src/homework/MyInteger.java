package homework;

/**
 * Created by gavri on 06.12.2015.
 */
public class MyInteger {
    int number;

    public MyInteger(int number){
        this.number = number;
    }

    public int add (int num){
        int sum = num + number;
        return  sum;
    }

    public int subtraction (int num){
        int difference = number - num;
        return difference;
    }


    public int multiplication (int num){
        int product = num * number;
        return product;
    }


    public double division (int num){
        double quotient = number / num;
        return quotient;
    }


    public int exponentiation (int num){
        int power = number;
        if (num >= 2){
            for (int i = 2; i <= num; i ++ ){
                power = power * number;
            }
        }
        return power;
    }


    public int factorial(){
        int product = 1;
        for (int i = 2; i <= number; i++ ){
            product = product * i;
        }

        return product;
    }

    public int modulo(int num){
        int modulo = number% num;
        return modulo;
    }


    public void whichNumisBigger(int num){
        int smaller;
        int bigger;
        smaller =(num < number) ? num:number;
        bigger = (num> number) ? num: number;
        System.out.printf("Thi bigger num is %d, and the smaller num is - %d", bigger, smaller);
    }

}
