package WhatsOn;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by gavri on 27.01.2016.
 */
public class Cinema {
    private String name;
    private String address;
    private HashMap<Integer,Movie> cinemaMovies = new HashMap<>();

    public Cinema(String name, String address){
        this.name = name;
        this.address = address;
    }

    public Cinema() {

    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }


    public void setCinemaMovies(int hashCOde, Movie movie) {
        this.cinemaMovies.put(hashCOde,movie);
    }

    public HashMap<Integer, Movie> getCinemaMovies() {
        return cinemaMovies;
    }
}
