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
        System.out.println();
    }

    public MyString concatenate(char[] newStringEnding) {
        char[] newContent = new char[content.length + newStringEnding.length];
        int i = 0;
        int length = content.length;
        while (i < content.length) {
            newContent[i] = content[i];
            i++;

        }
        while (i < newContent.length) {
            newContent[i] = newStringEnding[i - length];
            i++;
        }


        return new MyString(newContent);
    }


    public void toLowerCase() {
        for (int i = 0; i < content.length; i++) {
            content[i] = Character.toLowerCase(content[i]);
        }
    }

    public void toUpperCase() {
        for (int i = 0; i < content.length; i++) {
            content[i] = Character.toUpperCase(content[i]);
        }
    }


    public void searchWhereIsText(char[] textArray) {
        if (textArray.length < content.length) {

            for (int i = 0; i < content.length; i++) {

                if (textArray[0] == content[i]) {

                    for (int j = 0; j < textArray.length && textArray[j] == content[i + j]; j++) {
                        if (j == textArray.length - 1) {
                            System.out.println(" You can find your substring in cells from - " + i + " to - " + (i + j));
                        }

                    }
                }

            }
        }
    }

    public boolean searchText(char[] textArray) {
        boolean result = false;
        if (textArray.length < content.length) {

            for (int i = 0; i < content.length; i++) {

                if (textArray[0] == content[i]) {

                    for (int j = 0; j < textArray.length && textArray[j] == content[i + j]; j++) {
                        if (j == textArray.length - 1) {
                            result = true;
                        }

                    }
                }

            }
        }

        return result;
    }


    public MyString subMyString(int first, int last) {
        if (first > last | content.length < last) {
            System.out.println("Error - Write correct range");
        }
        char[] array = new char[(content.length - first) - (content.length - last) + 1];
        MyString newMyString = new MyString(array);
        for (int i = 0; i < array.length; i++) {
            array[i] = content[i + first];
        }

        return newMyString;
    }

    public MyString deleteSpace() {
        int j = 0;
        int i = 0;
        while (i < content.length) {
            if (content[i] == ' ') {
                j++;
                i++;
            }else{
                i++;
            }
        }

        char[] array = new char[content.length - j];
        j = 0;
        i=0;


        while (i < content.length) {
            if (content[i] != ' ') {
                array[j] = content[i];
                j++;
                i++;
            } else {
                i++;
            }
        }

        MyString newString = new MyString(array);

        return newString;

    }


}