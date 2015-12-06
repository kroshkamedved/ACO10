package week1.day1;

public class _01_findMinMax {

    public static void main(String[] args) {

        int [] array = {1,2,3,4,5};
        MinMaxContainer container1 = findMinMax(array);
        container1.showContainer();
        String s = new String();
        s.length();
        String.valueOf(true);

        int [] array2 = {10,12,13,14,15};
        MinMaxContainer container2 = findMinMax(array2);
        System.out.println(container2.max + ", " + container2.min);
    }


    public static MinMaxContainer findMinMax(int [] mass){

        MinMaxContainer container = new MinMaxContainer();
        container.max = mass[0];
        container.min = mass[0];
        for (int i = 1; i < mass.length; i++) {
            if(container.max < mass[i]){
                container.max = mass[i];
            }if(container.min > mass[i]){
                container.min = mass[i];
            }
        }

        return container;
    }
}
