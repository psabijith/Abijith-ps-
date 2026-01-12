package BookMyShowClone.src.com.aitrich.bookmyshowclone.Domain;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Admin {
	
	private List<Movie> movies = new ArrayList<>();
	private List<Theatre> theatres = new ArrayList<>();
	private List<Shows> shows = new ArrayList<>();
	
	public Admin() { }

	public void addMovie(Movie movie) {
		movies.add(movie);
		System.out.println(movie.getName() + " added successfully!");
	}
	
	public void removeMovie(Movie movie) {
		movies.remove(movie);
		System.out.println(movie.getName() + " removed successfully!");
	}
	public void getAllMovies() {
		System.out.println("All current movies:");
		System.out.println("------------------");
		
		for(Movie e : movies) {
			System.out.println("Name: " + e.getName() + "Language: " + e.getLanguage() + "Rating: " + e.getRating() + "Theatre: " + e.getTheatre() + "Formats: " + e.getFormat());
		}
	}
	public void addTheatre(Theatre theatre) {
		theatres.add(theatre);
	}
	public void removeTheatre(Theatre theatre) {
		theatres.remove(theatre);
	}
	public void getAllTheatre(){
		System.out.println("All current Theatres:");
		System.out.println("---------------------");
		
		for(Theatre e :theatres) {
			System.out.println("Name: " + e.getName() + "Location: " + e.getLocation() + "Total Seats: " + e.getTotalSeats() + "Seats Available: " + e.getSeatsAvailable());
		}
	}
	public List<Movie> getMovies() {
	    return movies;
	}

	public List<Theatre> getTheatres() {
	    return theatres;
	}

	
public void createShow(Movie movie, Theatre theatre,
             LocalDateTime showTime, Formats format) {

Shows show = new Shows(movie, theatre, showTime, format);
shows.add(show);

System.out.println("Show created for " +
  movie.getName() + " at " +
  theatre.getName() + " (" + format + ")");
}

public void removeShow(Shows show) {
shows.remove(show);
System.out.println("Show removed");
}

public void getAllShows() {
System.out.println("\nAll Shows:");
System.out.println("-----------");
for (Shows s : shows) {
System.out.println(
  s.getMovie().getName() +
  " | " + s.getTheatre().getName() +
  " | " + s.getShowTime() +
  " | " + s.getFormat()
);
}
}
public List<Shows> getShows() {
    return shows;
}
}