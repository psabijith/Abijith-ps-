package BookMyShowClone.src.com.aitrich.bookmyshowclone.Domain;

import java.util.ArrayList;
import java.util.List;

public class User {

    private String username;
    private List<Shows> shows;
    private List<Booking> bookings = new ArrayList<>();
    
    public User() {}
    public User(List<Shows> shows) {
        this.shows = shows;
    }
    public User(String username, List<Shows> shows) {
        this.username = username;
        this.shows = shows;
    }

    // -------- VIEW SHOWS --------
    public void viewShows() {
        for (int i = 0; i < shows.size(); i++) {
            Shows s = shows.get(i);
            System.out.println(
                i + ". " +
                s.getMovie().getName() +
                " | " + s.getTheatre().getName() +
                " | Seats: " + s.getTheatre().getSeatsAvailable()
            );
        }
    }

    // -------- BOOK SHOW --------
    public void bookShow(int showIndex, int seats) {

        Shows show = shows.get(showIndex);
        Theatre theatre = show.getTheatre();

        if (theatre.getSeatsAvailable() < seats) {
            System.out.println("Not enough seats available!");
            return;
        }

        theatre.setSeatsAvailable(
            theatre.getSeatsAvailable() - seats
        );

        Booking booking = new Booking(username, show, seats);
        bookings.add(booking);

        System.out.println("Booking successful!");
    }

    // -------- VIEW BOOKINGS --------
    public void viewBookings() {
        System.out.println("\nYour Bookings:");
        for (Booking b : bookings) {
            System.out.println(
                b.getShow().getMovie().getName() +
                " | Seats: " + b.getSeatsBooked()
            );
        }
    }
}
