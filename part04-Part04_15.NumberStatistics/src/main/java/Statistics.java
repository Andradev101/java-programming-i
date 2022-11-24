
public class Statistics {
    private int count;
    private int sum;
    
    public Statistics() {
        this.count = 0;
    }

    public void addNumber(int number) {
        this.sum += number;
        count += 1;
    }

    public int getCount() {
        return this.count;
    }

    public int sum() {
        return this.sum;
    }

    public double average() {
        if(Double.isNaN(this.count) || this.sum == 0) {
            return 0;
        } else {
            return (double) this.sum / this.count;
        }
    }
}
