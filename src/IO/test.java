package IO;

import java.io.*;

/**
 * Created by gavri on 16.01.2016.
 */
public class test {
    public static void main(String[] args) throws IOException {
        File file = new File("menu.txt");
        System.out.println(file.exists());
        File copy = new File ("copy.txt");
        System.out.println(copy.exists());
        InputStream is = new FileInputStream(file);
        OutputStream os = new FileOutputStream(copy, true);

        int readByte = 0;

        while (readByte!= -1){
            readByte = is.read();
            os.write(readByte);
            System.out.println(copy.exists());
        }
    }
}
