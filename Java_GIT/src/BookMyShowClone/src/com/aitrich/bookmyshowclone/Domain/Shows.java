package BookMyShowClone.src.com.aitrich.bookmyshowclone.Domain;

import java.time.LocalDateTime;

public class Shows {

    private Movie movie;
    private Theatre theatre;
    private LocalDateTime showTime;
    private Formats format;

    public Shows(Movie movie, Theatre theatre,
                LocalDateTime showTime, Formats format) {
        this.movie = movie;
        this.theatre = theatre;
        this.showTime = showTime;
        this.format = format;
    }

    public Movie getMovie() { return movie; }
    public Theatre getTheatre() { return theatre; }
    public LocalDateTime getShowTime() { return showTime; }
    public Formats getFormat() { return format; }
}
