package Maintenance;



public class MaintenanceTicket {
    
    private String maintenanceDate;
    private String description;
    private String technicianName;
    private int bicycleId;

    public String getFechaMantenimiento() {
        return maintenanceDate;
    }

    public String getDescription() {
        return description;
    }

    public String getTechnicianName() {
        return technicianName;
    }

    public int getBicycleId() {
        return bicycleId;
    }

    public MaintenanceTicket(String fechaMantenimiento, String description, String technicianName, int bicycleId) {
        this.maintenanceDate = fechaMantenimiento;
        this.description = description;
        this.technicianName = technicianName;
        this.bicycleId = bicycleId;
    }

    @Override
    public String toString() {
        return "Fecha de Mantenimiento: " + maintenanceDate + " Descripcion del Mantinimiento: " + description +  " Nombre del Tecnico: " + technicianName + " Bicicleta Id: " + bicycleId ;
    }
}
