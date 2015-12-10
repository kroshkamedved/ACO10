package homework;

/**
 * Created by gavri on 10.12.2015.
 */
public class MyString {
    String content = "";

    //Конструкторы:
    //1
    public MyString(char[] array) {
        for (int i = 0; i < array.length; i++) {
            content = content + array[i];
        }

    }

    // 2
    public MyString() {
        return;
    }

    //2
    public MyString(String content) {
        this.content = content;
    }


    // Методы

    public void showContent() {
        System.out.println(content);
    }

    public void concatenation(String newStringEnding) {
        content = content + newStringEnding;
    }


    public void toLowerCase() {
        content = content.toLowerCase();
    }

    public void toUpperCAse() {
        content = content.toUpperCase();
    }

    public void searchingText(String text) {

        char[] textArray = text.toCharArray();
        char[] contentArray = content.toCharArray();
        if (textArray.length < contentArray.length) {

            for (int i = 0; i < content.length(); i++) {

                if (textArray[0] == contentArray[i]){

                    for (int j = 0; j < textArray.length && textArray[j] == contentArray[i+j];j++ )
                    {
                        if(j == textArray.length-1){
                            System.out.println ("From - " + i + " to - "+ (i+j));}

                    }
                }

            }
        }

    }
}