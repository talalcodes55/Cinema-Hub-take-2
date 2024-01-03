//package BackEnd;
//
//
//import java.io.FileOutputStream;
//import java.io.IOException;
//import java.io.ObjectOutputStream;
//import java.util.HashMap;
//
//
//
//public class Main {
//    public static void main(String[] args) throws IOException, ClassNotFoundException {
//        ObjectOutputStream useroos = new ObjectOutputStream(new FileOutputStream(FileHandling.USERS_FILE));  
//        ObjectOutputStream movieoos = new ObjectOutputStream(new FileOutputStream(FileHandling.MOVIES_FILE));  
//        Movie movie1 = new Movie("MALEFICENT", "9.9", "Fantasy, Mystery", "C:\\Users\\Dell\\Documents\\GitHub\\Cinema-Hub-take-2\\CinemaHubProject\\src\\main\\java\\FrontEnd\\Images\\maleficent.png");
//        Movie movie2 = new Movie("CRUELLA", "9.2", "Drama", "C:\\Users\\Dell\\Documents\\GitHub\\Cinema-Hub-take-2\\CinemaHubProject\\src\\main\\java\\FrontEnd\\Images\\cruella.png");
//        Movie movie3 = new Movie("FALL", "8.0", "Thrilling, ", "C:\\Users\\Dell\\Documents\\GitHub\\Cinema-Hub-take-2\\CinemaHubProject\\src\\main\\java\\FrontEnd\\Images\\fall.png");
//        Movie movie4 = new Movie("GONE GIRL", "7.5", "Drama", "C:\\Users\\Dell\\Documents\\GitHub\\Cinema-Hub-take-2\\CinemaHubProject\\src\\main\\java\\FrontEnd\\Images\\gonegirl.png");
//        Movie movie5 = new Movie("THE BATMAN", "8.7", "Action, Thrilling", "C:\\Users\\Dell\\Documents\\GitHub\\Cinema-Hub-take-2\\CinemaHubProject\\src\\main\\java\\FrontEnd\\Images\\thebatman.png");
//        Movie movie6 = new Movie("THE GOOD NURSE", "8.7", "Drama", "C:\\Users\\Dell\\Documents\\GitHub\\Cinema-Hub-take-2\\CinemaHubProject\\src\\main\\java\\FrontEnd\\Images\\thegoodnurse.png");
//        
//        HashMap<String, Movie> movies = new HashMap<>();
//        movies.put("MALEFICENT", movie1);
//        movies.put("CRUELLA", movie2);
//        movies.put("FALL", movie3);
//        movies.put("GONE GIRL", movie4);
//        movies.put("THE BATMAN", movie5);
//        movies.put("THE GOOD NURSE", movie6);
//        
//        movieoos.writeObject(movies);
//        
//
//        User user1 = new User("Talal", "Talal2004","1234" , 5000);
//        User user2 = new User("Doha", "Doha2004","5678" , 3400);
//        User user3 = new User("Layal", "Layal2004","2345" , 2500);
//          
//        HashMap<String, User> users = new HashMap<>();
//        users.put("Talal", user1);
//        users.put("Doha", user2);
//        users.put("Layal", user3);
//        useroos.writeObject(users);
//        
//        useroos.flush();
//        useroos.close();
//        
//        movieoos.flush();
//        movieoos.close();
//          
//    }
//}