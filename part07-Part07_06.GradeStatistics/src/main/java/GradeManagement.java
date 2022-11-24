import java.util.ArrayList;

public class GradeManagement {
    
    private ArrayList<Integer> pointList;

    public GradeManagement() {
        this.pointList = new ArrayList<>();
    }

    //verifications
    public void addPoint(int point) {
        if(point >= 0 && point <= 100) {
            this.pointList.add(point);
        }
    }

    //behaviours
    public Double getAverage() {
        Double avg = 0.0;
        for (Integer points : pointList) {
            avg += points;
        }

        return (avg)/pointList.size();
    }

    public Double getPassingPointsAverage() {
        
        Double avg = 0.0;
        Integer passedPointsCounter = 0;

        for (Integer points : pointList) {

            Boolean passingPoints = isPassingPoints(points);
            if(passingPoints) {
                passedPointsCounter++;
                avg += points;
            }
        }
        
        if(passedPointsCounter == 0) {
            return null;
        }

        return avg/passedPointsCounter;
    }

    public Double getPassPercentage() {
        
        Integer passingPointsCounter = 0;
        for(Integer points : pointList) {
            
            Boolean passingPoints = isPassingPoints(points);
            if(passingPoints) {
                passingPointsCounter++;
            }
        }

        return 100 * (Double.valueOf(passingPointsCounter) / this.pointList.size());
    }

    public void printGradeDistribution() {
        //i feel like i could implement this 1000x better, but every other way io think about gets more complicated than this one.     
        Integer grade0Counter = 0;
        Integer grade1Counter = 0;
        Integer grade2Counter = 0;
        Integer grade3Counter = 0;
        Integer grade4Counter = 0;
        Integer grade5Counter = 0;

        for (Integer points : this.pointList) {
            if(points < 50) {
                grade0Counter++;
            } else if(points >= 50 && points < 60) {
                grade1Counter++;
            } else if(points >= 60 && points < 70) {
                grade2Counter++;
            } else if(points >= 70 && points < 80) {
                grade3Counter++;
            } else if(points >= 80 && points < 90) {
                grade4Counter++;
            } else if(points >= 90) {
                grade5Counter++;
            }
        }

        System.out.println(printStar(5, grade5Counter));
        System.out.println(printStar(4, grade4Counter));
        System.out.println(printStar(3, grade3Counter));
        System.out.println(printStar(2, grade2Counter));
        System.out.println(printStar(1, grade1Counter));
        System.out.println(printStar(0, grade0Counter));
    }

    //helpers
    private Boolean isPassingPoints(Integer points) {
        return points >= 50;
    }

    private String printStar(Integer grade, Integer times) {
        String outString = grade +": ";
        for(Integer i = 0; i < times; i++) {
            outString += "*";
        }
        return outString;
    }

    public void print() {
        System.out.println("Point average (all): " + getAverage());
        Double passingPointsAvg = getPassingPointsAverage();
        System.out.println("Point average (passing): " + (passingPointsAvg == null ? "-" : passingPointsAvg));
        System.out.println("Pass percentage: " + getPassPercentage());
        printGradeDistribution();
    }
}
