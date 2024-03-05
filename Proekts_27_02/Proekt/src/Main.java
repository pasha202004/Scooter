import java.io.FileWriter;
import java.io.IOException;
import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Please, tell me some information of scooter model!");

        System.out.println("What model does electric scooter has?(Xiaomi, Samsung, Bolt)");
        String elec = scan.nextLine();
        System.out.println("What model does simple scooter has?(Decahtlon, Blazer Pro, Ethic)");
        String  simp = scan.nextLine();
        System.out.println("What model does hibrid scooter has?(Buggati, Samsung)");
        String hib = scan.nextLine();

        ArrayList<Scooter> vechile = new ArrayList<>();
        Scooter electric = new ElectricScooter(523, elec, 2, 75, 35);
        System.out.println(electric.printInfo());
        System.out.println(electric.getCred());
        Scooter simple = new SimpleScooter(210,simp, 2,"AWD");
        System.out.println(simple.printInfo());
        System.out.println(simple.getCred());
        Scooter hibrid = new HybridScooter(367, hib, 2, 125, "metal");
        System.out.println(hibrid.printInfo());
        System.out.println(hibrid.getCred());
        vechile.add(electric);
        vechile.add(simple);
        vechile.add(hibrid);



        try{
            FileWriter writer = new FileWriter("scoot.txt");

            for (Scooter i: vechile){
                writer.write(i.printInfo() + "\n");

            }
            writer.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }
}