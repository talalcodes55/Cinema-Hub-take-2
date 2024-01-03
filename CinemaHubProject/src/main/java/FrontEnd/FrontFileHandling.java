package FrontEnd;

import BackEnd.FileHandling;
import BackEnd.Movie;
import BackEnd.User;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashMap;


public class FrontFileHandling {
   
    public static HashMap<String, Movie> getMovies(){
        HashMap<String, Movie> movies = null;
        
        try{
            movies = FileHandling.readAllMovies();
        }catch(FileNotFoundException e){
            e.printStackTrace();
        }catch(ClassNotFoundException e){
            e.printStackTrace();
        }catch(IOException e){
            e.printStackTrace();
        }
        
        return movies;
    }
}
