package Library;

import java.io.*;

/**
 * Created by gavri on 19.01.2016.
 */
public class Menu {
    public Menu() {

    }

    public void showMenu()  {

        try {
            InputStreamReader is = new InputStreamReader(new FileInputStream("menu.txt"));
            StringBuffer  sb = new StringBuffer();
            BufferedReader br = new BufferedReader(is);
            String line = null;

            try {
                while (br.read() != -1){
                    line = br.readLine();
                    sb = sb.append(line+"\n");
                }
            } catch (IOException e){
                e.printStackTrace();
            }
            String allText = sb.toString();
            System.out.println(allText);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }



    }
}
