package Bicycles;

public class Bicycle {
    private int id;
    
    BicycleStatus status;
    
    private String brand;

    public int getId() {
        return id;
    }

    public BicycleStatus getStatus() {
        return status;
    }

    public String getBrand() {
        return brand;
    }

    public void setStatus(BicycleStatus status) {
        this.status = status;
    }

    public Bicycle(int id, String brand) {
        this.id = id;
        this.status = BicycleStatus.AVAILABLE;
        this.brand = brand;
    }
    
    

    @Override
    public String toString() {
        return "\nBicycle:\nId:" + id + "\nStatus: " + status + "\nBrand: " + brand;
    }
}
