package Uses;


public class useTickets {
    
    private String fechaInicio;
    private int bicycleId;
    private int userId;
    private String dueDate;
    public static final String fechaRegex = "^\\d{2}/\\d{2}/\\d{4}$";

    public String getFechaInicio() {
        return fechaInicio;
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
             this.fechaInicio = fechaInicio;
         }
    }
    
    private boolean validateDateFinal(String fechaFinalizacion){
        return fechaFinalizacion.matches(fechaRegex);
    }
    
    private boolean validateDateStart(String fechaInicio){
        return fechaInicio.matches(fechaRegex);
    }

    

    public useTickets(String fechaInicio, int bicycleId, int userId, String fechaFinalizacion) {
        this.fechaInicio = fechaInicio;
        this.bicycleId = bicycleId;
        this.userId = userId;
         if (validateDateFinal(fechaFinalizacion)){
            this.dueDate = fechaFinalizacion;
        }
    }

    @Override
    public String toString() {
        return "Fecha de Inicio del Alquiler: " + fechaInicio + "Bicycle Id: " + bicycleId + " User Id: " + userId + " Fecha de Finalizacion del Alquiler: " + dueDate + '}';
    }
  
    
    
}
