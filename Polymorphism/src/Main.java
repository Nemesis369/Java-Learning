import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        // Adventure theMovie = new Adventure("Stars Wars");
        // theMovie.watchMovie();

        // Movie theMovie = Movie.getMovie("Science", "Star Wars");
        // theMovie.watchMovie();

        Scanner sc = new Scanner(System.in);

        while (true) { 
            System.out.println("Enter Type(A for Adventure, C for Comedy, S for Science Fiction, or Q to quit)");
            String type = sc.nextLine();
            if("Qq".contains(type)) {
                break;
            }
            System.out.println("Enter Movie title:");
            String title = sc.nextLine();
            Movie movie = Movie.getMovie(type, title);
            movie.watchMovie();
        }
    }
}
