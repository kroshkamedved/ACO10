package IO;

import java.io.*;
import java.nio.file.Files;
import java.util.List;

/**
 * Created by gavri on 22.02.2016.
 */
public class IOUtils {

    public static void writeInto(byte[] in, File path) throws FileNotFoundException {
        try (OutputStream os = new FileOutputStream(path);) {
            os.write(in);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static byte[] getToBytes(File file) throws FileNotFoundException {
        InputStream is = new FileInputStream(file);
        byte[] array = new byte[1024];
        int count;
        try (ByteArrayOutputStream os = new ByteArrayOutputStream();) {
            while ((count = is.read(array, 0, array.length)) != -1) {
                os.write(array, 0, count);
            }
            return os.toByteArray();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }


    public static byte[] getToBytesWithoutByteArrayOS(File file) throws FileNotFoundException {
        byte[] array = null;
        try {
            array = Files.readAllBytes(file.toPath());
        } catch (IOException e) {
            e.printStackTrace();
        }
        return array;
    }

    public static String readFileContent(String path) throws FileNotFoundException {
        Reader reader = new FileReader(path);

        char[] buff = new char[1024];
        StringBuilder sb = new StringBuilder();

        int count = -1;

        try {
            while ((count = reader.read(buff)) != -1) {
                sb.append(buff, 0, count);
            }
        } catch (IOException io) {
            io.printStackTrace();
        }
        return sb.toString();
    }


    public static void writeIntoFile(List<String> conent, String path){
        try(Writer writer = new FileWriter(path)) {
            for (String part : conent){
                writer.write(part);
            }
            writer.flush();
        }catch (IOException io){
            io.printStackTrace();
        }
    }
}





