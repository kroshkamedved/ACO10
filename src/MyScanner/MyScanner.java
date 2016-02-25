package MyScanner;

import java.io.IOException;
import java.io.Reader;

/**
 * Created by gavri on 25.02.2016.
 */
public class MyScanner {

    char[] data = null;
    char[] buffer = new char[1000];


    public MyScanner(Reader reader){
        int count = 0;
        try {
            while ((count = reader.read(buffer,0,buffer.length))!= -1){
                if (data == null){
                    data = buffer;
                    buffer = new char[2000];

                } else {
                    char [] tmp = new char[data.length + count];
                    System.arraycopy(data,0,tmp,0,data.length);
                    System.arraycopy(data,0,buffer,0,count);
                    data = tmp;
                    tmp = null;
                }
                if (count <= data.length) {
                    char[] tmp = new char[count];
                    System.arraycopy(data,0,tmp,0,count);
                    data = tmp;
                    tmp = null;
                }

                }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public MyScanner (String text){
        data = text.toCharArray();
    }

    public String next(){
        String[] strArray = data.toString().split(" ");
        String str = strArray[0];
        return  str;
    }

}

