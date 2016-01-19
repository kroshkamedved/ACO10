package LoopsTests;

public class LoopsTests {
    public static void main(String[] args) {

        int b = 9;
// DO WHILE TEST
        do {
            b = b-1;
            System.out.println(b);
        } while (b >=0);

        System.out.println("**********************************");
// FOR EACH TEST
        int[] list = new int[]{7,8,9,7,7,10};
            for (int num : list){
                System.out.println(num);
            }

    }

}
