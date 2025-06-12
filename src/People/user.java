package People;



public class User extends Civilian {
    private String phone;

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        if (verifyPhone(phone)) {
            this.phone = phone;
        }
    }
    
    public static boolean verifyPhone(String phone) {
        String regex = "^[245678]\\\\d{7}$";
        return phone.matches(regex);
    }

    public User(int id, String name , String email, String phone) {
        super(id, name, email);
        this.phone = phone;
    }

    @Override
    public String toString() {
        return "\nUser:" + super.toString() + "\nPhone: " + phone;
    }
}
