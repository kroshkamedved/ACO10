package IO;

import sun.text.normalizer.UTF16;

import java.io.*;

/**
 * Created by gavri on 16.01.2016.
 */
public class test {
    public static void main(String[] args) /*throws IOException */{

        /*  File file = new File("menu.txt");
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

            RandomAccessFile file1 = new RandomAccessFile("copy.txt","r");

        int readByte2;
        while ((readByte2 = file1.read())!= -1 ){
            System.out.print((char)(readByte2));
        }
        System.out.println("**********************************************");
        BufferedReader br = new BufferedReader(new FileReader("menu.txt"));
        StringBuffer sb = new StringBuffer();
        String line = br.readLine();

        while (line != null){
            sb.append(line);
            sb.append(System.lineSeparator());
            line = br.readLine();
        }

        String allText = sb.toString();

        System.out.println(allText);

        */

        File file = new File("C:\\development\\1.doc");
        try {
            FileInputStream is = new FileInputStream(file);
            InputStreamReader isr = new InputStreamReader(is);
            try {
                OutputStreamWriter os = new OutputStreamWriter(new FileOutputStream("copy.doc"),"UTF8");
                try {
                    int bite  = isr.read();

                    while (bite != -1){
                        bite  = isr.read();
                        os.write(bite);
                    }
                    os.close();
                    is.close();
            } catch (UnsupportedEncodingException t){
                    t.printStackTrace();
                }

            }catch (IOException e){
                e.printStackTrace();
            }
        } catch (FileNotFoundException n){
            n.printStackTrace();
        }




    }
}
