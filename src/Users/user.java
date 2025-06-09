package Users;



public class user {
    private String name;
    private int id;
    private String phone;
    private String email;

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public String getPhone() {
        return phone;
    }

    public String getEmail() {
        return email;
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

    @Override
    public String toString() {
        return "\nUser:\nName: " + name + "\nId: " + id + "\nPhone: " + phone + "\nEmail:" + email;
    }
}
