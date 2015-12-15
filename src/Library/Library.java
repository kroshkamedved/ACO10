package Library;

import java.util.ArrayList;

/**
 * Created by gavri on 13.12.2015.
 */
public class Library {
    ArrayList<Reader> readers;
    ArrayList<Books> books;
    ArrayList blackList;

    public void showReaders(){
        int i = 0;
        System.out.println("");
        for(Reader reader : readers){
            System.out.print(" " + reader.name);
        }
    }

 }


