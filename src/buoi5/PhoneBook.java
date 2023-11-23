package buoi5;

import java.util.ArrayList;

public class PhoneBook extends Phone{
    ArrayList<PhoneNumber> phoneList = new ArrayList<>();

    @Override
    public void insertPhone(String name, String phone) {
        for (PhoneNumber phoneItem : phoneList) {
            if (phoneItem.name.equals(name)) {
                if(!phoneItem.phone.contains(phone)) {
                    phoneItem.phone.add(phone);
                    return;
                }else {
                    return;
                }
            }
        }
        phoneList.add(new PhoneNumber(name, phone));
    }
    @Override
    public void removePhone(String name) {
        for (PhoneNumber phoneItem : phoneList) {

            if (phoneItem.name.equals(name)) {
                if(!phoneItem.phone.contains(phone)) {
                    phoneItem.phone.add(phone);
                    return;
                }else {
                    return;
                }
            }
        }
    }
    @Override
    public void updatePhone(String name, String newPhone) {

    }

    @Override
    public PhoneNumber searchPhone(String name) {
        return new PhoneNumber();
    }

    @Override
    public void sort() {

    }
}
