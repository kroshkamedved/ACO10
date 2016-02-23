package IO;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

/**
 * Created by gavri on 12.02.2016.
 */
public class SaveAndReadStrings {
    public static void main(String[] args) {
        try {
            File file = new File("C:\\development\\test.txt");
            FileReader fileReader = new FileReader(file);
            BufferedReader bf = new BufferedReader(fileReader);
            String line = null;
            while ((line = bf.readLine())!= null){
                System.out.println(line);
                System.out.println(System.lineSeparator());
            }
            fileReader.close();
        }catch (IOException e){
            e.printStackTrace();
        }

    }
}
