package homework;

/**
 * Created by gavri on 10.12.2015.
 */
public class MyString {
    char[] content;

    //Конструкторы:

    public MyString(char[] array) {
        content = array;
    }


    public MyString() {
        return;
    }


    // Методы

    public void showContent() {
        for (int i = 0; i < content.length; i++) {
            System.out.print(content[i]);
        }
    }

    public MyString concatenate(char[] newStringEnding) {
        char[] newcontent = new char[content.length + newStringEnding.length];
        int i = 0;
        int length = content.length;
            while (i < content.length) {
                newcontent[i] = content[i];
                i++;

            }
            while (i < newcontent.length) {
                newcontent[i] = newStringEnding[i-length];
                i++;
            }


        return  new MyString(newcontent);
    }
/*

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

                if (textArray[0] == contentArray[i]) {

                    for (int j = 0; j < textArray.length && textArray[j] == contentArray[i + j]; j++) {
                        if (j == textArray.length - 1) {
                            System.out.println("From - " + i + " to - " + (i + j));
                        }

                    }
                }

            }
        }

    }*/
}