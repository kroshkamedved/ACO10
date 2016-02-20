package IO;

import java.io.*;

/**
 * Created by gavri on 12.02.2016.
 */
public class SaveAndReadObjects {
    public static void main(String[] args) {
        String name = "asdasda";
        File file = new File("C:\\development\\test.txt"); // create a link
        try {  // Methods, which is being used in works with IO throws IOExceptions
            FileOutputStream fileOs = new FileOutputStream(file); // create thread for connection to file
            ObjectOutputStream oos = new ObjectOutputStream(fileOs); // create chainable thread
            oos.writeObject(name); // serializing object to file
            oos.close();
        } catch (IOException e){
            e.printStackTrace();
            System.out.println("Ooops");
        }

        System.out.println("completed");



        name = null;
        System.out.println(name);

        try {
            FileInputStream fileIS = new FileInputStream(file);
            ObjectInputStream ois = new ObjectInputStream(fileIS);
            name = (String)ois.readObject();
            ois.close();
        } catch (IOException e){
            e.printStackTrace();
        } catch (ClassNotFoundException cnf){
            cnf.printStackTrace();
        }

        System.out.println(name);

        }
}
