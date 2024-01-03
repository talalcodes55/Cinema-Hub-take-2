
package BackEnd;

import java.io.Serializable;

class Date implements Serializable{
    private String month;
    private String day;
    
    public Date(String month, String day){
        this.month = month;
        this.day = day;
    }

    Date() {}

    public String getMonth() {
        return month;
    }

    public void setMonth(String month) {
        this.month = month;
    }

    public String getDay() {
        return day;
    }

    public void setDay(String day) {
        this.day = day;
    }

    @Override
    public String toString() {
        return getMonth()+ "/" + getDay();
    }
    
    
    
}
