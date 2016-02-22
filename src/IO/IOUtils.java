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

        byte[] buff = new byte[1024];

        StringBuilder res = new StringBuilder();
        int count = -1;

        try {
            while ((count = is.read(buff)) != -1 ){
                res.append(Arrays.toString(buff)); //todo find problem, see string result before returning
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return res.toString().getBytes();
    }

    public static void  writeInto(byte[] in, File path) throws FileNotFoundException {
        try(OutputStream os = new FileOutputStream(path);) {
            os.write(in);
        } catch (IOException e) {
            e.printStackTrace();
        }
        }
    }

