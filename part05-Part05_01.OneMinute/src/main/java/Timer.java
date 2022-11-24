import java.sql.Time;

public class Timer {
    private int milisecond;
    private int second;
    private int milisecondLimit;
    private int secondLimit;
    
    //works too, but not what the question asked
    // private int limit;
    // private int time;

    public Timer() {
        this.milisecondLimit = 100;
        this.secondLimit = 60;
        this.milisecond = 0;
        this.second = 0;
        
        //works too, but not what the question asked
        // this.time = 0;
        // this.limit = 100;
    }

    public void advance() {
        this.milisecond++;
        if(this.milisecond >= this.milisecondLimit) {
            this.milisecond = 0;
            this.second++;
            if(this.second >= this.secondLimit){
                this.second = 0;
            }
        }
        
        //works too, but not what the question asked
        // this.time++;
        // if(this.time >= this.limit){
        //     this.time = 0;
        // }
    }
     
    //works too, but not what the question asked
    // public int getTime(){
    //     return this.time;
    // }

    @Override
    public String toString() {
        if(this.second < 10 && this.milisecond < 10) {
            return String.valueOf("0" + String.valueOf(this.second) + ":0" + this.milisecond);
        } else if(this.second < 10) {
            return String.valueOf("0" + String.valueOf(this.second) + ":" + this.milisecond);
        } else if(this.milisecond < 10){
            return String.valueOf(String.valueOf(this.second) + ":0" + this.milisecond);
        } else {
            return String.valueOf(String.valueOf(this.second) + ":" + this.milisecond);
        }
        
        
        //works too, but not what the question asked
        // if(this.time < 10) {
        //     return String.valueOf("0" + String.valueOf(this.time));
        // } else {
        //     return String.valueOf(String.valueOf(this.time));
        // }
    }
}
