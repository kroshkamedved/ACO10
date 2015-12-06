package week1.day2;


public class TestGranny {
    public static void main(String[] args) {
        Cat kitten = new Cat("Myrka", 7, "sphynx");

        Granny babywka = new Granny("Starywka", 73, kitten);
        System.out.println(babywka);
    }
}
