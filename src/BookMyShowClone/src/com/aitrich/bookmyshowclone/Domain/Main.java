package BookMyShowClone.src.com.aitrich.bookmyshowclone.Domain;

import java.time.LocalDateTime;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Authentication auth = new Authentication();
        Admin admin = new Admin();
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\nWELCOME TO BOOKYOURSHOW!");
            System.out.println("1. Login");
            System.out.println("2. Register");
            System.out.println("0. Exit");
            System.out.print("Enter your choice: ");

            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {

                case 1:
                    System.out.print("Username: ");
                    String loginUser = sc.nextLine();

                    System.out.print("Password: ");
                    String loginPass = sc.nextLine();

                    AuthUser loggedUser = auth.login(loginUser, loginPass);

                    if (loggedUser == null) {
                        System.out.println("Invalid username or password ");
                        break;
                    }

                    if (loggedUser.getRole() == Role.ADMIN) {
                        System.out.println("Welcome ADMIN: " + loginUser);
                        adminMenu(sc, admin);
                    } else {
                        System.out.println("Welcome USER: " + loginUser);
                        User user = new User(loginUser, admin.getShows());
                        userMenu(sc,user);
                    }
                    break;

                case 2:
                    System.out.print("Username: ");
                    String regUser = sc.nextLine();

                    System.out.print("Password: ");
                    String regPass = sc.nextLine();

                    System.out.print("Role (ADMIN / USER): ");
                    Role role;
                    try {
                        role = Role.valueOf(sc.nextLine().toUpperCase());
                    } catch (IllegalArgumentException e) {
                        System.out.println("Invalid role");
                        break;
                    }

                    if (auth.register(regUser, regPass, role)) {
                        System.out.println("Registration successful ");
                    } else {
                        System.out.println("Username already exists ");
                    }
                    break;

                case 0:
                    System.out.println("Exiting...");
                    sc.close();
                    return;

                default:
                    System.out.println("Invalid choice");
            }
        }
    }

    // ---------------- ADMIN MENU ----------------
    private static void adminMenu(Scanner sc, Admin admin) {

        while (true) {
            System.out.println("\n--- ADMIN MENU ---");
            System.out.println("1. Add Movie");
            System.out.println("2. View Movies");
            System.out.println("3. Add Theatre");
            System.out.println("4. View Theatres");
            System.out.println("5. Create Show");
            System.out.println("6. View Shows");
            System.out.println("0. Exit");
            System.out.print("Choice: ");

            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {

                case 1:
                    System.out.print("Movie name: ");
                    String name = sc.nextLine();

                    System.out.print("Language: ");
                    String language = sc.nextLine();

                    Ratings rating;
                    try {
                        System.out.print("Rating (U / UA / A): ");
                        rating = Ratings.valueOf(sc.nextLine().toUpperCase());
                    } catch (IllegalArgumentException e) {
                        System.out.println("Invalid rating ");
                        break;
                    }

                    Movie movie = new Movie(name, language, rating, null, null);
                    admin.addMovie(movie);
                    break;

                case 2:
                    admin.getAllMovies();
                    break;

                case 3:
                    System.out.print("Theatre name: ");
                    String tName = sc.nextLine();

                    System.out.print("Location: ");
                    String location = sc.nextLine();

                    System.out.print("Total seats: ");
                    int seats = sc.nextInt();
                    sc.nextLine();

                    Theatre theatre = new Theatre(tName, location, seats, seats, null);
                    admin.addTheatre(theatre);
                    break;

                case 4:
                    admin.getAllTheatre();
                    break;

                case 5:
                    System.out.println("Select Movie:");
                    admin.getAllMovies();
                    System.out.print("Enter movie index (0,1,2..): ");
                    int mIndex = sc.nextInt();
                    sc.nextLine();

                    System.out.println("Select Theatre:");
                    admin.getAllTheatre();
                    System.out.print("Enter theatre index (0,1,2..): ");
                    int tIndex = sc.nextInt();
                    sc.nextLine();

                    admin.createShow(
                        admin.getMovies().get(mIndex),
                        admin.getTheatres().get(tIndex),
                        LocalDateTime.now().plusHours(3),
                        Formats.TWO_D
                    );
                    break;


                case 6:
                    admin.getAllShows();
                    break;

                case 0:
                    System.out.println("Exiting...");
                    return;

                default:
                    System.out.println("Invalid admin choice");
            }
        }
    }
    private static void userMenu(Scanner sc, User user) {

        while (true) {
            System.out.println("\n--- USER MENU ---");
            System.out.println("1. View Shows");
            System.out.println("2. Book Show");
            System.out.println("3. View My Bookings");
            System.out.println("0. Logout");
            System.out.print("Choice: ");

            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    user.viewShows();
                    break;

                case 2:
                    user.viewShows();
                    System.out.print("Select show number: ");
                    int index = sc.nextInt();

                    System.out.print("Seats to book: ");
                    int seats = sc.nextInt();
                    sc.nextLine();

                    user.bookShow(index, seats);
                    break;

                case 3:
                    user.viewBookings();
                    break;

                case 0:
                    return;

                default:
                    System.out.println("Invalid choice");
            }
        }
    }
}
