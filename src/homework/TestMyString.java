package homework;

import com.sun.deploy.util.ArrayUtil;

/**
 * Created by gavri on 10.12.2015.
 */
public class TestMyString {
    public static void main(String[] args) {
        char[] array = {'d','D','f','h'};
        char[] array2 = {'D'};
            MyString anyString = new MyString(array);
            MyString result = anyString.concatenate(array2);
                result.showContent();
        result.toLowerCase();
            System.out.println();
        result.showContent();
            System.out.println();
        result.toUpperCase();
        result.showContent();
            System.out.println();

        boolean a = anyString.searchText(array2);
            System.out.println(a);

        MyString result2 = result.subMyString(0,2);
            System.out.println();
            result2.showContent();
        System.out.println();

        char[] chatArray = {' ', 's','s','X',' ','!'};

        MyString tryNewMeth = new MyString(chatArray);
            tryNewMeth.showContent();
            System.out.println();
        MyString tryNewMeth2 = tryNewMeth.deleteSpace();
            tryNewMeth2.showContent();

        tryNewMeth.compare(tryNewMeth2);
    }



}
