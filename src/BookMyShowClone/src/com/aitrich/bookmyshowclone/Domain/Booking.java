package BookMyShowClone.src.com.aitrich.bookmyshowclone.Domain;


public class Booking {

    private String username;
    private Shows show;
    private int seatsBooked;

    public Booking(String username, Shows show, int seatsBooked) {
        this.username = username;
        this.show = show;
        this.seatsBooked = seatsBooked;
    }

    public String getUsername() { return username; }
    public Shows getShow() { return show; }
    public int getSeatsBooked() { return seatsBooked; }
}
