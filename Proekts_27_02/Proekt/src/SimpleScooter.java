public class SimpleScooter extends Scooter{

    private String Drive;
    public SimpleScooter(int price, String model, int numwheels,String drive){
        super(price,model,numwheels);
        this.Drive=drive;
    }

    public String getDrive() {
        return Drive;
    }
    public String printInfo() {
        return ("Scooter price is " + getPrice() + "$, scooter model is " + getModel() + ", number of wheel is " + getModel() + ", scooter drive is " + Drive);
    }
    public String getCred(){
            double i = Math.round(getPrice()/12.) ;

            return("scooter credit cost on 12 months - "+i+" eiro");
        }


    public void setDrive(String drive) {
        Drive = drive;
    }
}

