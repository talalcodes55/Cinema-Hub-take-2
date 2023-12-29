package BackEnd;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;


public class Main {
    public static void main(String[] args) throws IOException, ClassNotFoundException {            
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream(FileHandler.USERS_FILE));
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(FileHandler.USERS_FILE));
        User user1 = new User("Talal", "Talal2004", "12345", 1000);
        User user2 = new User("Doha", "Doha2004", "78910", 2000);
        User user3 = new User("Layal", "Layal2004", "11213", 1000);
        oos.writeObject(user1);
        oos.writeObject(user2);
        oos.writeObject(user3);
        System.out.println(ois.readObject());   
        System.out.println(ois.readObject());   
        System.out.println(ois.readObject());   
    }
}