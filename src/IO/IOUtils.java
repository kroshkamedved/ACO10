package IO;

import java.io.*;
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
    }

