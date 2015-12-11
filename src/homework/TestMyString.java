package homework;

import com.sun.deploy.util.ArrayUtil;

/**
 * Created by gavri on 10.12.2015.
 */
public class TestMyString {
    public static void main(String[] args) {
        char[] array = {'d','d','f','h'};
        char[] array2 = {'a','d','f','h'};
        MyString anyString = new MyString(array);
        MyString result = anyString.concatenate(array2);
        result.showContent();



    }
}
