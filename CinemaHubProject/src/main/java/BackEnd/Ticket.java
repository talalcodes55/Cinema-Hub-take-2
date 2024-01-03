package BackEnd;

import java.io.Serializable;


public class Ticket implements Serializable {
    String forWichMovie;
    String ID;
    String seatNumber;
    Date date;
    int price;


    public Ticket(String forWhichMovie, String ID,String seatNumber,Date date, int price) {
        this.forWichMovie = forWhichMovie;
        this.ID = ID;
        this.seatNumber = seatNumber;
        this.date = date;
        this.price = price;
    }

    public String getID() {
        return this.ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getForWhichMovie() {
        return this.forWichMovie;
    }
    
    public void setForWhichMovie(String forWichMovie) {
        this.forWichMovie = forWichMovie;
    }


    public String getForWichMovie() {
        return this.forWichMovie;
    }

    public void setForWichMovie(String forWichMovie) {
        this.forWichMovie = forWichMovie;
    }

    public int getPrice() {
        return this.price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
    public String getSeatNumber() {
        return this.seatNumber;
    }

    public void setSeatNumber(String seatNumber) {
        this.seatNumber = seatNumber;
    }
    public String getDate(){
        return date.toString();
    }

}
