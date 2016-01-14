package SortingAlgorithms;

/**
 * Created by gavri on 26.12.2015.
 */
public class Selection {
    public static void selectionSort(int[] array) {
        int tmp=0;
        int tmp2 = array[0];
        for (int i =0; i< array.length; i++) {
            for (int j=0; j< array.length; j++) {
                if (array[j] < tmp2) {
                    tmp = j;
                }
            }
            tmp2 = array[i];
            array[i] = array[tmp];
            array[tmp] = tmp2;
        }
        for (int num: array){
            System.out.printf("\"%d\"", num);
        }
    }
}