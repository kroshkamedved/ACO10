package Library;

import sun.misc.IOUtils;
import sun.nio.ch.IOUtil;
import sun.nio.ch.IOUtil;

import java.io.*;
import java.util.Scanner;
import java.io.*;
import java.io.*;
import java.util.Scanner;
import java.io.*;

/**
 * Created by gavri on 19.01.2016.
 */
public class TestLibrary2 {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Menu menu = new Menu();
        menu.showMenu();
        Library lib = new Library();
        try {
            ObjectInputStream is = new ObjectInputStream(new FileInputStream("lib.txt"));
            lib = (Library) is.readObject();
            is.close();
        } catch (IOException e) {
            e.printStackTrace();
        }


        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));


        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("\n***Make your choice***");
            String choice = bf.readLine();
            switch (choice) {
                case "1":
                    lib.showReaders();
                    break;
                case "2":
                    lib.showBooksInLib();
                    break;
                case "3":
                    lib.addBook();
                    break;
                case "4":
                    lib.addReader();
                    break;
                case "5":
                    lib.giveBook();
                    break;
                case "6":
                    lib.showGottenBooks();
                    break;
                case "7":
                    System.out.println("Enter Reader name");
                    lib.showUserBooks();
                    break;
                case "8":
                    //lib.addToBlckList();
                case "9":
                    lib.showReaders();
                    break;
                case "10":
                    lib.showReaders();
                    break;
                default:
                    System.out.println("Try just one more time, please");
            }

        }
    }
}
