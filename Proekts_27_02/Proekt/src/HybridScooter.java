public class HybridScooter extends Scooter{
    private int Kilomas;
    private String Material;

    public HybridScooter(int price, String model, int numwheels, int kilomas, String material){
        super(price,model,numwheels);
        this.Kilomas=kilomas;
        this.Material=material;
    }
    public String printInfo() {
        return ("Scooter price is " + getPrice() + "$, scooter model is " + getModel() + ", number of wheel is " + getModel() + ", the scooter can withstand " + Kilomas + "kg, scooter made with " + Material);
    }
    public String getCred(){
        double i = Math.round(getPrice()/12.) ;

        return("scooter credit cost on 12 months - "+i+" eiro");
    }
    public int getKilomas() {
        return Kilomas;
    }

    public void setKilomas(int kilomas) {
        Kilomas = kilomas;
    }

    public String getMaterial() {
        return Material;
    }

    public void setMaterial(String material) {
        Material = material;
    }
}
