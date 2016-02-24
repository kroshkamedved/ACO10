package MyScanner;

import java.io.*;

/**
 * Created by gavri on 25.02.2016.
 */
public class MyScannerTest {
    public static void main(String[] args) throws FileNotFoundException {
        MyScanner sc = new MyScanner();

        MyScanner scString = new MyScanner("This is my test MyScanner object");

        Reader reader = new InputStreamReader(new FileInputStream("\\tmp\\try.txt"));

        MyScanner scReader = new MyScanner(reader);

    }
}
