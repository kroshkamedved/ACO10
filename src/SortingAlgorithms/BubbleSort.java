package SortingAlgorithms;

import Library.Book;
import com.sun.org.apache.xml.internal.security.utils.JavaUtils;

import java.awt.*;
import java.util.ArrayList;
import java.util.Objects;

/**
 * Created by gavri on 25.12.2015.
 */
public class BubbleSort {
    public static void bubbleSort(int[] array){
        int tmp = array[0];
        for (int i = 0; i < array.length; i++){
            for (int j = 1; j<array.length-i; j++){
                if (array[j-1]>array[j]){
                    tmp = array[j-1];
                    array[j-1] = array[j];
                    array[j] = tmp;
                }
            }
        }
        for(int num : array){
            System.out.printf("\"%d\"", num);
        }
    }
}
