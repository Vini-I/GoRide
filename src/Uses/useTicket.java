package Uses;


public class UseTicket {
    
    private String rentDate;
    private int bicycleId;
    private int userId;
    private String dueDate;
    public static final String fechaRegex = "^\\d{2}/\\d{2}/\\d{4}$";

    public String getFechaInicio() {
        return rentDate;
    }

    public int getBicycleId() {
        return bicycleId;
    }

    public int getUserId() {
        return userId;
    }

    public String getFechaFinalizacion() {
        return dueDate;
    }

    public void setFechaFinalizacion(String fechaFinalizacion) {
        if (validateDateFinal(fechaFinalizacion)){
            this.dueDate = fechaFinalizacion;
        }
    }
    
    public void setFechaInicio(String fechaInicio) {
         if (validateDateStart(fechaInicio)){
             this.rentDate = fechaInicio;
         }
    }
    
    private boolean validateDateFinal(String fechaFinalizacion){
        return fechaFinalizacion.matches(fechaRegex);
    }
    
    private boolean validateDateStart(String fechaInicio){
        return fechaInicio.matches(fechaRegex);
    }

    

    public UseTicket(String fechaInicio, int bicycleId, int userId, String fechaFinalizacion) {
        this.rentDate = fechaInicio;
        this.bicycleId = bicycleId;
        this.userId = userId;
         if (validateDateFinal(fechaFinalizacion)){
            this.dueDate = fechaFinalizacion;
        }
    }

    @Override
    public String toString() {
        return "Fecha de Inicio del Alquiler: " + rentDate + "Bicycle Id: " + bicycleId + " User Id: " + userId + " Fecha de Finalizacion del Alquiler: " + dueDate + '}';
    }
  
    
    
}
