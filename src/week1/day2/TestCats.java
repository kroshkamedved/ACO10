package week1.day2;


public class TestCats {
    public static void main(String[] args) {
        Cat kitten = new Cat("Myrka", 7, "sphynx");
        Cat kitten2 = kitten;
        kitten.name = "Byrka";
        kitten = null;
        System.out.println(kitten);
        System.out.println(kitten2);


    }
}
