public class Ride {
    private int distance; ///////// get by bhaskara
    private String driversName;
    private String car;
    private int score;

    public Ride(int distance, String driversName, String car, int score){
        this.driversName = driversName;
        this.car = car;
        this.score = score;
        this.distance = distance;
    }

    public int getDistance() {
        return distance;
    }

    public String getDriversName() {
        return driversName;
    }

    public String getCar() {
        return car;
    }

    public int getScore() {
        return score;
    }

    public void setDistance(int distance) {
        this.distance = distance;
    }

    public void setDriversName(String driversName) {
        this.driversName = driversName;
    }

    public void setCar(String car) {
        this.car = car;
    }

    public void setScore(int score) {
        this.score = score;
    }
}

    // valuebydistance
    // ifbiggerthan25kmcancel

