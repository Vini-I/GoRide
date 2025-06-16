package GoRide;

import Bicycles.*;

public class Main {

    public static void main(String[] args) {
        Bicycle b1 = new Bicycle(1, "Specialized");
        Bicycle b2 = new ElectricBicycle(2, "Energy");
        Bicycle b3 = new GasBicycle(3, "Yamaha");
        
        BicycleList bicycleList = new BicycleList();
        System.out.println(bicycleList.add(b1));
        System.out.println(bicycleList.add(b3));
        System.out.println(bicycleList.add(b2));
    }
    
}
