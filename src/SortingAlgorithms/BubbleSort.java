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

    public static void selectSort(int[] array){
        int tmp = array[0];
        int tmpIndex = 0;
        for(int i = 0; i < array.length; i++ ){
            for(int j = i; j < array.length; j ++){
                if (array[j]< array[i] && array[j] < array[tmpIndex]){
                    tmpIndex = j;
                }
            }
            if(array[i]>array[tmpIndex]){
                tmp = array[i];
                array[i] = array[tmpIndex];
                array[tmpIndex] = tmp;
            }
        }
        for(int num : array){
            System.out.printf("\"%d\"",num);
        }
    }
}
