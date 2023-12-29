
package BackEnd;
import java.io.*;
import java.util.HashMap;
public class FileHandler {
    public static final String USERS_FILE = "C:\\Users\\Dell\\Documents\\NetBeansProjects\\CinemaHubProject\\src\\main\\java\\Files\\users.txt";
    public static final String MOVIES_FILE = "C:\\Users\\Dell\\Documents\\NetBeansProjects\\CinemaHubProject\\src\\main\\java\\Files\\movies.txt";
    public static final String FILESDIR = "Files\\";
    
    
   
    
    public static HashMap <String , Movie> readAllMovies() throws IOException, ClassNotFoundException{
            HashMap <String , Movie> movies = new HashMap<>();
            FileInputStream fis = new FileInputStream(MOVIES_FILE);
            ObjectInputStream ois = new ObjectInputStream(fis);
        try{
            Movie movie;
            while (( movie = (Movie)ois.readObject()) != null) {
               movies.put(movie.getTitle(), movie);
            }       
        }   
        catch(FileNotFoundException e){
            e.printStackTrace();
        }
        catch(IOException e){
            e.printStackTrace();
        }
        finally{
             ois.close();
        }
        return movies;
    }
    

    public static HashMap <String , User> readAllUsers() throws IOException, ClassNotFoundException, FileNotFoundException{
         HashMap <String , User> users = new HashMap<>();
        FileInputStream fis = new FileInputStream(USERS_FILE);
        ObjectInputStream ois = new ObjectInputStream(fis);
        try{
        User user;

        while ((user = (User)ois.readObject()) != null){
            users.put(user.getUsername(), user);
        }
        }
        catch(FileNotFoundException e){
            e.printStackTrace();
        }
        catch(IOException e){
            e.printStackTrace();
        }
        finally{
            ois.close();
        }
        return users;
    }
}
