package IO;

import java.io.File;
import java.io.FileNotFoundException;

/**
 * Created by gavri on 22.02.2016.
 */
public class IOUtilsTest {
    public static void main(String[] args) throws FileNotFoundException {
      //  byte[] effective = IOUtils.getBytesWithBuff("C:\\development\\Effective.pdf");
        File file = new File("C:\\development\\Effective.pdf");
      //  byte[] effective = IOUtils.getToBytes(file);
        byte[] effective = IOUtils.getToBytesWithoutByteArrayOS(file);
        File copy = new File("C:\\development\\EffectiveCopy.pdf");

        IOUtils.writeInto(effective,copy);




    }
}
