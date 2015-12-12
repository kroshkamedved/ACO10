package week2.day1;


public class TestCat {
    public static void main(String[] args) {
        StaticCat cat1 = new StaticCat("Vas'ka");
        System.out.println(StaticCat.id);

        StaticCat cat2 = new StaticCat("Vas'ka2");
        System.out.println(StaticCat.id);

        StaticCat cat3 = new StaticCat("Vas'ka3");
        System.out.println(StaticCat.id);
    }
}
