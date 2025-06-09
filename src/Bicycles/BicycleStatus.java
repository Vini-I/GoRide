package Bicycles;

public enum BicycleStatus {
    AVAILABLE("available"),
    RENTED("rented"),
    MAINTENANCE("maintenance");
    
    private final String status;
    
    BicycleStatus(String status) {
        this.status = status;
    }
    
    public String getStatus() {
        return status;
    }
    
    @Override
    public String toString() {
        return status;
    }
}
