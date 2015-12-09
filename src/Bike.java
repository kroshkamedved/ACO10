/**
 * Created by gavri on 06.12.2015.
 */
public class Bike {
    String colour;
    double engineVoluem;
    String bikeType;
    int DataOfManufacturing;


    public Bike(int DataOfManufacturing, String bikeType, String colour, double engineVoluem){
        this.DataOfManufacturing = DataOfManufacturing;
        this.bikeType = bikeType;
        this.colour = colour;
        this.engineVoluem = engineVoluem;
}

    public void sellMoto()  {
        System.out.printf("Bike for sale:\n " +
                "bike type %s, colour - %s, engine voluen is %f, date of manufaturing is %d", bikeType, colour,engineVoluem,DataOfManufacturing);
    }


    }


