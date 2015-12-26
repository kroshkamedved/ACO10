package ClassWork;

/**
 * Created by gavri on 23.12.2015.
 */
public class BubbleSorting {
    public static void main(String[] args) {
        int[] array1 = {4,3,6,78,9,0,1};

        for(int integer : array1){
            System.out.println(integer);
        }

        int tem = array1[0];
        for (int i = 0; i< array1.length; i++ ){
            for (int j = 1; j<array1.length-i;j++ ){
                if (array1[j-1] > array1[j]){
                    tem = array1[j];
                    array1[j] = array1[j-1];
                    array1[j-1] = tem;
                }
            }
        }
        System.out.println();
        for(int integer : array1){
            System.out.println(integer);
        }

    }
}
