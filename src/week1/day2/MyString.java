package week1.day2;


public class MyString {
    char[] letters;

    public MyString(String word) {
        this.letters = word.toCharArray();
    }

    public int length(){
        return letters.length;
    }

    public int indexOf(char letter){
        int index = -1;
        for (int i = 0; i < letters.length; i++) {
            if(letters[i] == letter){
                index = i;
                return index;
            }
        }
        return index;
    }

}
