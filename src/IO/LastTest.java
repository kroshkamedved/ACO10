package IO;

import java.io.*;
import java.util.Arrays;

/**
 * Created by gavri on 23.02.2016.
 */
public class LastTest {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("C:\\development\\homework.txt");
        byte[] ar = IOUtils.getToBytesWithoutByteArrayOS(file);
        String str = new String(ar);
       // System.out.println(str);

        byte[] ar2 = IOUtils.getToBytes(file);
        String str2 = new String(ar2);
      //  System.out.println(str2);

        String str3 = IOUtils.readFileContent(file.toString());
        // System.out.println(str3);

        Reader reader = new FileReader(file);
        char [] array = new char[1024];
        StringBuilder sb = new StringBuilder();

        /*try {
            int count = reader.read(array);
            sb.append(array,0,count);

            System.out.println(count);
           // System.out.println(sb);
            System.out.println("***************************************");

            count = reader.read(array);
            sb.append(array,0,count);
            System.out.println(count);
            System.out.println(sb);

        } catch (IOException e) {
            e.printStackTrace();
        }*/

        try {
            int firstStringCharSize = reader.read(array);
            String firstString = new String(array,0,firstStringCharSize);
            System.out.print(firstString);
            char last = array[1023];


            int secondStringCharSize = reader.read(array);
            String secondString = new String(array,0,secondStringCharSize);
            System.out.println(secondString);
            System.out.printf("Длина первой строки - %d симовола \n" +
                    "Длина второй чтроки - %d символа\n", firstStringCharSize,secondStringCharSize);
            System.out.println("Последний симов первой строки - "+last);

        } catch (IOException e) {
            e.printStackTrace();
        }

        File dir = new File("src\\tmp");
        dir.mkdir();

        IOUtils.writeIntoFile(Arrays.asList("java.io.*, decorator, adapter, builder, Serialization",
                "Опубликовано: 22 февр. 2016 г.",
                "aco11 week6 day2"),"src\\tmp\\try.txt");

    }
}
