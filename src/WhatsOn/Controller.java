package WhatsOn;

/**
 * Created by gavri on 27.01.2016.
 */
public interface Controller {

    public void viewFilms();
    public void viewCinemas();
    public void viewCinemaFilms(Cinema cinema);
    public void showCinByFilm(Movie movie);
    public void showFilmInfo(Movie movie);
}
