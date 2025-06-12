package People;



public abstract class Civilian {
    protected String name;
    protected int id;
    protected String email;
    
    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }
    
     public void setEmail(String email) {
        if (verifyEmail(email)) {
            this.email = email;
        }
    }
    
    public static boolean verifyEmail(String email) {
        String regex = "^[\\w.-]+@[\\w.-]+\\.[a-zA-Z]{2,}$";
        return email.matches(regex);
    }

    public Civilian(int id, String name, String email) {
        this.name = name;
        this.id = id;
        this.email = email;
    }

    @Override
    public String toString() {
        return " \nId: " + id  + "\nName: " + name + "\nEmail: " + email;
    }
}
