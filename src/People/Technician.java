package People;



public class Technician extends Civilian {
    private String speciality;
    
    public String getSpeciality() {
        return speciality;
    }
    
    public void setSpeciality(String speciality) {
        this.speciality = speciality;
    }

    public Technician(int id, String name, String email, String speciality) {
        super(id, name, email);
        this.speciality = speciality;
    }

    @Override
    public String toString() {
        return "\nTechnician:" + super.toString() + "\nSpecialty: " + speciality;
    }
    
    
}
