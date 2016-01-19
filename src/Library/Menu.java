package Library;

import java.io.*;

/**
 * Created by gavri on 19.01.2016.
 */
public class Menu {
    InputStreamReader is;
    public Menu() throws FileNotFoundException {
        is = new InputStreamReader(new FileInputStream("menu.txt"));
    }

    public void showMenu() throws IOException {
        BufferedReader br = new BufferedReader(is);
        String line = br.readLine();
        int bite = 0;
        while ( bite!= -1 ){
            bite = br.read();
            System.out.println(line);
            line = br.readLine();
        }
    }
}
