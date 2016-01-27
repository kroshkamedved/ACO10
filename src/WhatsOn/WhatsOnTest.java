package WhatsOn;

import java.util.HashMap;

/**
 * Created by gavri on 27.01.2016.
 */
public class WhatsOnTest {
    public static void main(String[] args) {
        Movie mv = new Movie();
        Movie mv2 = new Movie();
        mv.setGenre("Action");
        mv.setRelease(1991);
        mv.setTitle("Point Break");
        mv2.setGenre("Action");
        mv2.setRelease(1991);
        mv2.setTitle("Point Break");
        System.out.println(mv.equals(mv2));

        System.out.println( "mv hashCode is "+mv.hashCode());
        System.out.println( "mv2 hashCode is "+mv2.hashCode());
        System.out.println(mv);

        Cinema cinema = new Cinema("Cinema-City","Ocean Plza");
        cinema.setCinemaMovies(mv.hashCode(),mv);
        System.out.println("****************************************");
        System.out.println(cinema.getCinemaMovies().get(mv.hashCode()));
       // cinema.setCinemaMovies(mv2.hashCode(),mv2);
        System.out.println("****************************************");
        System.out.println(cinema.getCinemaMovies().get(mv.hashCode()));
        System.out.println(cinema.getCinemaMovies().containsValue(mv2));


    }
}
