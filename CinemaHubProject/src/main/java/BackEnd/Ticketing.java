package BackEnd;

import java.io.*;
import java.util.ArrayList;

public class Ticketing {
    // display available seats for a movie:
    public static ArrayList<String> displayAvailableSeats(Movie movie, String showtime)
                throws IOException, FileNotFoundException {

            ArrayList<String> availableSeats = new ArrayList<>();
            FileReader fr = new FileReader(FileHandling.FILESDIR + movie.getTitle() + ".txt");
            BufferedReader br = new BufferedReader(fr);
        try {

            String line;
            while ((line = br.readLine()) != null) {
                String[] ID = line.split(",");
                String seat = ID[2];
                if (showtime.equals(seat) && !line.contains("#")) {
                    availableSeats.add(seat);
                }
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            
        } catch (IOException e) {
            e.printStackTrace();
        }
        finally{
            br.close();
        }
        return availableSeats;
    }

    // Book a ticket by a user:
    public static void book(User user, Movie movie, String month, String day, String showtime, String seatNumber)
            throws IOException, FileNotFoundException {
                
                FileWriter fw = new FileWriter(FileHandling.FILESDIR + movie.getTitle() + ".txt");
                FileReader fr = new FileReader(FileHandling.FILESDIR + movie.getTitle() + ".txt");
                BufferedWriter bw = new BufferedWriter(fw);
                BufferedReader br = new BufferedReader(fr);
        try {

            String ID = month + "," + day + "," + showtime+ ","+seatNumber;
            String line;
             
            Ticket ticket = new Ticket(movie.getTitle(), ID ,seatNumber,new Date(month, day), 100);
            user.addTickets(ticket);

            while ((line = br.readLine()) != null) {
                bw.write(line.replace(ID, ID + "#"));
                
            }

            user.setBalance(user.getBalance() - 100);
            user.setTickets(user.getTickets());
   
        } catch (FileNotFoundException e) {
            e.printStackTrace();

        } catch (IOException e){
            e.printStackTrace();
        }
        finally{
            bw.close();
            br.close();
            System.out.println("Ticket Has been booked successfully, Enjoy watching!");
        }
    }

    public static void unBook(User user, Movie movie, String ID)throws FileNotFoundException, IOException{

        FileWriter fw = new FileWriter(FileHandling.FILESDIR + movie.getTitle() + ".txt");
        FileReader fr = new FileReader(FileHandling.FILESDIR + movie.getTitle() + ".txt");
        BufferedWriter bw = new BufferedWriter(fw);
        BufferedReader br = new BufferedReader(fr);

        try {
            String line;
            String takenID = ID + "#";

            while ((line = br.readLine()) != null) {
                
                if (line.equals(takenID)) {
                    bw.write(line.replace(line, ID));
                }
            }
            user.deleteTickets(ID);
            user.setTickets(user.getTickets());
            
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e){
            e.printStackTrace();
        }
        finally{
            bw.close();
            br.close();
        }
    }
    public void unBook(Ticket ticket) throws FileNotFoundException, IOException{
        FileWriter fw = new FileWriter(FileHandling.FILESDIR + ticket.getForWhichMovie() + ".txt");
        FileReader fr = new FileReader(FileHandling.FILESDIR +  ticket.getForWhichMovie() + ".txt");
        BufferedWriter bw = new BufferedWriter(fw);
        BufferedReader br = new BufferedReader(fr);
        
        try{
            String line;
            String takenID = ticket.getID() + "#";
            
            while ((line = br.readLine()) != null) {                
                if (line.equals(takenID)) {
                    bw.write(line.replace(line, ticket.getID()));
                }
            }
        }catch(FileNotFoundException e) {
            e.printStackTrace();
        }catch(IOException e){
            e.printStackTrace();
        }finally{
            br.close();
            bw.close();
        }
        
    }
}
