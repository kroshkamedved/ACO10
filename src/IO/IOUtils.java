package IO;

import com.sun.org.apache.xerces.internal.xs.datatypes.ByteList;
import com.sun.xml.internal.ws.encoding.MtomCodec;

import java.io.*;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by gavri on 22.02.2016.
 */
public class IOUtils {
    public static byte[] getBytesWithBuff(String path) throws FileNotFoundException {
        File file = new File(path);
        InputStream is = new FileInputStream(file);
        StringBuilder res = new StringBuilder();

        byte[] buff = new byte[1000];
        ByteArrayOutputStream byteArrayOutputStream =
                new ByteArrayOutputStream();

        int count = -1;

        try {
            while ((count = is.read(buff)) != -1 ){
                byteArrayOutputStream.write(buff,0,count); //todo find problem, see string result before returning
            }
            byteArrayOutputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return byteArrayOutputStream.toByteArray();
    }

    public static void  writeInto(byte[] in, File path) throws FileNotFoundException {
        try(OutputStream os = new FileOutputStream(path);) {
            os.write(in);
        } catch (IOException e) {
            e.printStackTrace();
        }
        }

    public static byte[] getToBytes (File file) throws FileNotFoundException {
        InputStream is = new FileInputStream(file);
        byte[] array = new byte[1024];


        int count = -1;


        try(ByteArrayOutputStream os = new ByteArrayOutputStream();) {
            while ((count = is.read(array,0,array.length)) != -1){
                    os.write(array,0,count);

            }
            return os.toByteArray();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

    public static byte[] getToBytesWithoutByteArrayOS (File file) throws FileNotFoundException {
        InputStream is = new FileInputStream(file);
        byte[] array = null;
        try {
            byte[] ar = Files.readAllBytes(file.toPath());
            array = ar;
        } catch (IOException e) {
            e.printStackTrace();
        }



        return array;
    }

 }





