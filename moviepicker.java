import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class MoviePicker {
    private List<Movie> movies;  // List to store all movies
    private Scanner scanner;     // Scanner for user input

    public MoviePicker() {
        movies = new ArrayList<>();
        scanner = new Scanner(System.in);
        initializeMovies(); // Initialize the list with sample movies
    }

    public static void main(String[] args) {
        new MoviePicker().start(); // Start the movie picker application
    }

    public void start() {
        boolean running = true; // Flag to keep the application running

        while (running) {
            displayMenu(); // Display the main menu
            int choice = getInputInt(); // Get user choice with input validation

            switch (choice) {
                case 1:
                    filterMovies(); // Filter movies based on user input
                    break;
                case 2:
                    running = false; // Exit the application
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }

        scanner.close(); // Close the scanner when done
    }

    private void displayMenu() {
        System.out.println("Welcome to Movie Picker!");
        System.out.println("1. Find a Movie");
        System.out.println("2. Exit");
        System.out.print("Choose an option: ");
    }

    private void initializeMovies() {
        // Add sample movies, ensuring coverage for all combinations
        // Sci-Fi
        movies.add(new Movie("Inception", 2010, "Sci-Fi", 148));
        movies.add(new Movie("The Matrix", 1999, "Sci-Fi", 136));
        movies.add(new Movie("Blade Runner 2049", 2017, "Sci-Fi", 164));
        movies.add(new Movie("Back to the Future", 1985, "Sci-Fi", 116));
        movies.add(new Movie("Interstellar", 2014, "Sci-Fi", 169));
        movies.add(new Movie("Star Wars: Episode IV - A New Hope", 1977, "Sci-Fi", 121));
        movies.add(new Movie("Avatar", 2009, "Sci-Fi", 162));
        movies.add(new Movie("Alien", 1979, "Sci-Fi", 117));

        // Crime
        movies.add(new Movie("The Godfather", 1972, "Crime", 175));
        movies.add(new Movie("Pulp Fiction", 1994, "Crime", 154));
        movies.add(new Movie("The Dark Knight", 2008, "Crime", 152));
        movies.add(new Movie("The Departed", 2006, "Crime", 151));
        movies.add(new Movie("Se7en", 1995, "Crime", 127));

        // Action
        movies.add(new Movie("Mad Max: Fury Road", 2015, "Action", 120));
        movies.add(new Movie("The Dark Knight", 2008, "Action", 152));
        movies.add(new Movie("Gladiator", 2000, "Action", 155));
        movies.add(new Movie("John Wick", 2014, "Action", 101));
        movies.add(new Movie("Avengers: Endgame", 2019, "Action", 181));

        // Drama
        movies.add(new Movie("Forrest Gump", 1994, "Drama", 142));
        movies.add(new Movie("The Shawshank Redemption", 1994, "Drama", 142));
        movies.add(new Movie("The Social Network", 2010, "Drama", 120));
        movies.add(new Movie("Joker", 2019, "Drama", 122));
        movies.add(new Movie("Fight Club", 1999, "Drama", 139));

        // Horror
        movies.add(new Movie("Get Out", 2017, "Horror", 104));
        movies.add(new Movie("The Exorcist", 1973, "Horror", 122));
        movies.add(new Movie("A Nightmare on Elm Street", 1984, "Horror", 91));
        movies.add(new Movie("The Shining", 1980, "Horror", 146));
        movies.add(new Movie("Halloween", 1978, "Horror", 91));

        // Fantasy
        movies.add(new Movie("The Lord of the Rings: The Fellowship of the Ring", 2001, "Fantasy", 178));
        movies.add(new Movie("Harry Potter and the Sorcerer's Stone", 2001, "Fantasy", 152));
        movies.add(new Movie("The Wizard of Oz", 1939, "Fantasy", 102));
        movies.add(new Movie("Pan's Labyrinth", 2006, "Fantasy", 118));
        movies.add(new Movie("The Princess Bride", 1987, "Fantasy", 98));

        // Animation
        movies.add(new Movie("The Lion King", 1994, "Animation", 88));
        movies.add(new Movie("Spider-Man: Into the Spider-Verse", 2018, "Animation", 117));
        movies.add(new Movie("Coco", 2017, "Animation", 105));
        movies.add(new Movie("Toy Story", 1995, "Animation", 81));
        movies.add(new Movie("Finding Nemo", 2003, "Animation", 100));

        // Comedy
        movies.add(new Movie("The Grand Budapest Hotel", 2014, "Comedy", 99));
        movies.add(new Movie("Groundhog Day", 1993, "Comedy", 101));
        movies.add(new Movie("The Wolf of Wall Street", 2013, "Comedy", 180));
        movies.add(new Movie("Superbad", 2007, "Comedy", 113));
        movies.add(new Movie("The Truman Show", 1998, "Comedy", 103));

        // Romance
        movies.add(new Movie("Titanic", 1997, "Romance", 195));
        movies.add(new Movie("Casablanca", 1942, "Romance", 102));
        movies.add(new Movie("Pride and Prejudice", 2005, "Romance", 129));
        movies.add(new Movie("The Notebook", 2004, "Romance", 123));
        movies.add(new Movie("La La Land", 2016, "Romance", 128));

        // Adventure
        movies.add(new Movie("Jurassic Park", 1993, "Adventure", 127));
        movies.add(new Movie("Indiana Jones and the Raiders of the Lost Ark", 1981, "Adventure", 115));
        movies.add(new Movie("The Hobbit: An Unexpected Journey", 2012, "Adventure", 169));
        movies.add(new Movie("Jumanji", 1995, "Adventure", 104));
        movies.add(new Movie("The Revenant", 2015, "Adventure", 156));

        // Thriller
        movies.add(new Movie("The Silence of the Lambs", 1991, "Thriller", 118));
        movies.add(new Movie("Parasite", 2019, "Thriller", 132));
        movies.add(new Movie("Zodiac", 2007, "Thriller", 157));
        movies.add(new Movie("Gone Girl", 2014, "Thriller", 149));
        movies.add(new Movie("Seven", 1995, "Thriller", 127));

        // War
        movies.add(new Movie("1917", 2019, "War", 119));
        movies.add(new Movie("Saving Private Ryan", 1998, "War", 169));
        movies.add(new Movie("Dunkirk", 2017, "War", 106));
        movies.add(new Movie("Apocalypse Now", 1979, "War", 153));
        movies.add(new Movie("Platoon", 1986, "War", 120));
    }

    private void filterMovies() {
        // Prompt user for their movie preferences
        System.out.print("Do you want to re-watch a movie? (yes/no): ");
        String rewatch = scanner.nextLine().toLowerCase();

        System.out.print("Do you want an older movie or a newer movie? (older/newer): ");
        String age = scanner.nextLine().toLowerCase();

        System.out.println("Available genres: Horror, Fantasy, Sci-Fi, Mystery, Crime, Action, Drama, Thriller, Adventure, Animation, Romance, Comedy, War");
        System.out.print("What genre are you interested in?: ");
        String genre = scanner.nextLine();

        System.out.print("What is the maximum duration of the movie in minutes?: ");
        int duration = getInputInt(); // Get user input with validation

        // Filter movies based on user input
        List<Movie> filteredMovies = movies.stream()
                .filter(movie -> (age.equals("older") && movie.getYear() < 2000) || (age.equals("newer") && movie.getYear() >= 2000))
                .filter(movie -> movie.getGenre().equalsIgnoreCase(genre))
                .filter(movie -> movie.getDuration() <= duration)
                .collect(Collectors.toList());

        // Display filtered movies or no matches found
        if (filteredMovies.isEmpty()) {
            System.out.println("No movies found matching your criteria.");
        } else {
            System.out.println("Here are some movies you might like:");
            for (Movie movie : filteredMovies) {
                System.out.println(movie);
            }
        }
    }

    private int getInputInt() {
        while (true) {
            try {
                return Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.print("Invalid input. Please enter a valid number: ");
            }
        }
    }
}

class Movie {
    private String title; // Title of the movie
    private int year;     // Release year of the movie
    private String genre; // Genre of the movie
    private int duration; // Duration of the movie in minutes

    public Movie(String title, int year, String genre, int duration) {
        this.title = title;
        this.year = year;
        this.genre = genre;
        this.duration = duration;
    }

    // Getter methods for movie attributes
    public String getTitle() {
        return title;
    }

    public int getYear() {
        return year;
    }

    public String getGenre() {
        return genre;
    }

    public int getDuration() {
        return duration;
    }

    @Override
    public String toString() {
        // Return a string representation of the movie
        return title + " (" + year + ") - " + genre + " - " + duration + " minutes";
    }
}
