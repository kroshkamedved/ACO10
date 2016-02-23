package IO;

import java.io.*;

/**
 * Created by gavri on 12.02.2016.
 */
public class SaveAndReadObjects {
    public static void main(String[] args) {
        String name = "asdasda";
        String name2 = "DDDDDD";
        String name3 = "AAAAAAAA";
        File file = new File("C:\\development\\test.txt"); // create a link
        try {  // Methods, which is being used in works with IO throws IOExceptions
            FileOutputStream fileOs = new FileOutputStream(file); // create thread for connection to file // CAN CONNECT TO OBJECTS, BUT CAN WRITE ONLE ARRAY OF BYTES
            ObjectOutputStream oos = new ObjectOutputStream(fileOs); // create chainable thread, CAN WRITE OBJECTS, BUT CAN'T CONNECT TO THEM
            oos.writeObject(name);// serializing object to file
            oos.writeObject(name2);
            oos.writeObject(name3);
            oos.close();
        } catch (IOException e){
            e.printStackTrace();
            System.out.println("Ooops");
        }

        System.out.println("completed");



        name = null;
        name2 = null;
        name3 = null;
        System.out.printf(name+ "\n"+name2+"\n" +name3+"\n");

        try {
            FileInputStream fileIS = new FileInputStream(file);// READ OBJECT AS BYTES, CONNECTION
            ObjectInputStream ois = new ObjectInputStream(fileIS); // DECODE BYTES INTO OBJECT
            name = (String)ois.readObject(); //OBJECTS WILL BE READ IN ORDER WHICH THEY WHERE WRITTEN
            name2 = (String)ois.readObject();
            name3 = (String)ois.readObject();
            ois.close();
        } catch (IOException e){
            e.printStackTrace();
        } catch (ClassNotFoundException cnf){
            cnf.printStackTrace();
        }

        System.out.printf(name+ "\n"+name2+"\n" +name3);

        }
}
