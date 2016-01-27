package WhatsOn;

/**
 * Created by gavri on 27.01.2016.
 */
public class Movie {
    private String title;
    private String genre;
    private int release;
    private volatile int hashCode = 0;

    public Movie(String title,String genre, int release){
        this.title = title;
        this.genre = genre;
        this.release = release;
    }

    public Movie(){

    }


    @Override
    public boolean equals(Object o){
        if(o == null) return false;
        if(this == o) return true;
        if(o.getClass() != this.getClass()) return false;
        Movie mv = (Movie) o;
        if (mv.release != this.release) return false;
        if (!mv.genre.equals(this.genre)) return false;
        return (mv.title.equals(this.title));
    }


    @Override
    public int hashCode(){
        if(hashCode == 0) {
            int result = 17;
            result = 37 * result + release;
            result = 37 * result + title.hashCode();
            result = 37 * result + genre.hashCode();
            hashCode = result;
        }
        return hashCode;
    }

    @Override
    public String toString(){
        return String.format(" Title - %s \n Genre - %s \n Release date - %d",title,genre,release);
    }




    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public int getRelease() {
        return release;
    }

    public void setRelease(int release) {
        this.release = release;
    }
}
