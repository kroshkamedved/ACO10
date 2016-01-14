package MyArrayList;

import java.util.ArrayList;

public class testMyArrayLIst {
    public static void main(String[] args) {
        MyArrayList<Integer> list = new MyArrayList<>();
        ArrayList<Integer> l = new ArrayList<>();
     try {
         /*MyArrayList list2 = new MyArrayList(0);
         MyArrayList list3 = new MyArrayList(0);*/
     } catch (minLengthExcerption excerption) {
         System.out.println("I can't do it");
     }
        System.out.println("*******************************************");

    list.add(15);
        System.out.println(list.get(0));

      // list.add("string");
        System.out.println(list.get(1));

    }

    }
