package week2.day1;


public class StaticCat {
    static int id;
    String name;

    public StaticCat(String name) {
        this.name = name;
        id++;
    }

}
