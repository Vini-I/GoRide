package Main;

import People.*;

public class GoRide {
    public static void main(String[] args) {
        User u1 = new User(2, "Carlos", "Carlos@gmail.com", "88888888");
        Technician t1 = new Technician(3, "Ana", "Ana@gmail.com", "Llantas");
        
        System.out.println(u1);
        System.out.println(t1);
    }
    
}
