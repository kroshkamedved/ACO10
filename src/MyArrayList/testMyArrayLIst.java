package MyArrayList;

import java.util.ArrayList;

public class testMyArrayLIst {
    public static void main(String[] args) {
        MyArrayList<Integer> list = new MyArrayList(100);
        ArrayList<Integer> l = new ArrayList<>();
     try {
         /*MyArrayList list2 = new MyArrayList(0);
         MyArrayList list3 = new MyArrayList(0);*/
     } catch (minLengthExcerption excerption) {
         System.out.println("I can't do it");
     }
        System.out.println("*******************************************");



        list.add(15);
        list.add(16);

        System.out.println(list.get(0));
        System.out.println(list.get(1));


    }

    }
