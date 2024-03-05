public class Scooter {

   private int Price;
    private String Model;
    private int numWheels;

    public Scooter(int price, String model, int numwheels){
        this.Price = price;
        this.Model = model;
        this.numWheels = numwheels;
    }
    public String printInfo(){
        return("Scooter price is "+Price+", scooter model is "+Model+", number of wheel is "+numWheels);
    }
    public String getCred(){

        return("electricity consumption is"+0);
    }

    public int getPrice() {
        return Price;
    }

    public void setPrice(int price) {
        Price = price;
    }

    public String getModel() {
        return Model;
    }

    public void setModel(String model) {
        Model = model;
    }

    public int getNumWheels() {
        return numWheels;
    }

    public void setNumWheels(int numWheels) {
        this.numWheels = numWheels;
    }
}
