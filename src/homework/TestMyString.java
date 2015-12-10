package homework;

/**
 * Created by gavri on 10.12.2015.
 */
public class TestMyString {
    public static void main(String[] args) {
        char[] array = {'s','d','m','n'};
         MyString anyString = new MyString(array);
        System.out.println(anyString.content);

        MyString anyString3 = new MyString();
        anyString3.content = "Baradaada x";
        System.out.println(anyString3.content);

        MyString anyString4 = new MyString("Barada xy");
        System.out.println(anyString4.content);

        anyString4.showContent();

        anyString.concatenation("la-la-la");
        anyString.toUpperCAse();
        anyString.showContent();
        anyString.toLowerCase();
        anyString.showContent();
        anyString3.searchingText("ada");






    }
}
