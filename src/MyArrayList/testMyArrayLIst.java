package MyArrayList;

import java.util.ArrayList;

public class testMyArrayLIst {
    public static void main(String[] args) {
        MyArrayList<Integer> list = new MyArrayList();
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
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        list.add(7);
        list.add(8);
        list.add(9);
        list.add(11,999);
        System.out.println(list.get(11));
        System.out.println(list.size());
        list.add(5,1000);
        System.out.println(list.get(12));
        System.out.println(list.size());
        System.out.println(list.get(5));

        list.set(12,888);
        System.out.println(list.get(12));
        //list.clear();
        list.add(0);
        System.out.println(list.get(0));
        System.out.println(list.remove(null));
        System.out.println(list.get(12));
        System.out.println(list.size());
        list.add(888);
        Integer in = 888;
       // System.out.println(list.remove(in));
        System.out.println(list.contains(in));






    }

    }
