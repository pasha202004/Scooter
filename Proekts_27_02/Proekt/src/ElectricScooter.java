import java.sql.Time;

public class ElectricScooter extends Scooter{
    private int Distance;
    private int Speed;


    public ElectricScooter(int price, String model, int numwheels, int distance, int speed){
        super(price,model,numwheels);
        this.Distance=distance;
        this.Speed=speed;

    }
    public String printInfo(){
        double i = getPrice()/12.;
        return("Scooter price is "+getPrice()+"$, scooter model is "+getModel()+", number of wheel is "+getNumWheels()+", distance for which an electric scooter is designed is "+Distance+" km, scooter speed is "+Speed+"km/h");
    }
    public String getCred(){
        double i = Math.round(getPrice()/12.) ;

        return("scooter credit cost on 12 months - "+i+" eiro");
    }



    public int getDistance() {
        return Distance;
    }

    public void setDistance(int distance) {
        Distance = distance;
    }

    public int getSpeed() {
        return Speed;
    }

    public void setSpeed(int speed) {
        Speed = speed;
    }
}
