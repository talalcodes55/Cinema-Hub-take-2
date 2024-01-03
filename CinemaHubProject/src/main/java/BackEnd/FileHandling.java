
package BackEnd;
import java.io.*;
import java.util.HashMap;

public class FileHandling {
    public static final String USERS_FILE = "C:\\Users\\Dell\\Documents\\GitHub\\Cinema-Hub-take-2\\CinemaHubProject\\src\\main\\java\\Files\\users.txt";
    public static final String MOVIES_FILE = "C:\\Users\\Dell\\Documents\\GitHub\\Cinema-Hub-take-2\\CinemaHubProject\\src\\main\\java\\Files\\movies.txt";
    public static final String FILESDIR = "C:\\Users\\Dell\\Documents\\GitHub\\Cinema-Hub-take-2\\CinemaHubProject\\src\\main\\java\\Files\\";
    
    
    
    public static HashMap <String , Movie> readAllMovies() throws IOException, ClassNotFoundException{
            HashMap <String , Movie> movies = new HashMap<>();
            FileInputStream fis = new FileInputStream(MOVIES_FILE);
            ObjectInputStream ois = new ObjectInputStream(fis);
            
            movies =  (HashMap<String, Movie>) ois.readObject();
            
            return movies;  
        }

    public static HashMap <String , User> readAllUsers() throws IOException, ClassNotFoundException, FileNotFoundException{
        HashMap <String , User> users = new HashMap<>();
        FileInputStream fis = new FileInputStream(USERS_FILE);
        ObjectInputStream ois = new ObjectInputStream(fis);
        
        users = (HashMap <String , User>)ois.readObject();
        return users;
}
    
    public static void writeAllUsers(HashMap<String, User> usersHash) throws FileNotFoundException, IOException{
        FileOutputStream fos = new FileOutputStream(USERS_FILE);
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        try{
            oos.writeObject(usersHash);
        }catch(FileNotFoundException e){
            e.printStackTrace();
        }catch(IOException e){
            e.printStackTrace();
        }finally{
        oos.close();
        }
    }
    public static void writeAllMovies(HashMap<String, Movie> moviesHash) throws FileNotFoundException, IOException{
        FileOutputStream fos = new FileOutputStream(MOVIES_FILE);
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        try{
            oos.writeObject(moviesHash);
        }catch(FileNotFoundException e){
            e.printStackTrace();
        }catch(IOException e){
            e.printStackTrace();
        }finally{
        oos.close();
        }
    }
}
