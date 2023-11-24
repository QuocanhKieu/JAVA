package buoi5;



import java.util.ArrayList;

public class PhoneNumber {
    String name;
    ArrayList<String> phone = new ArrayList<>();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<String> getPhone() {
        return phone;
    }

    public void setPhone(String model) {

        this.phone.add(model);
    }

    public PhoneNumber () {

    }

    public PhoneNumber (String name, String number) {
        this.name = name;
//        this.phone = new ArrayList<>();
        this.phone.add(number);

    }
}
