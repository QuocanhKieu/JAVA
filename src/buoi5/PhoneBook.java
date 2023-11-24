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
        for(int i = 0; i < this.phoneList.size(); i++) {
            if(this.phoneList.get(i).name.equals(name)) {
                this.phoneList.remove(i);
                return;
            }
        }
    }
    @Override
    public void updatePhone(String name, String newPhone) {
        for(int i = 0; i < this.phoneList.size(); i++) {
            if(this.phoneList.get(i).name.equals(name)) {
               this.phoneList.get(i).phone.add(newPhone);

            }
        }
    }

    @Override
    public PhoneNumber searchPhone(String name) {
        for(int i = 0; i < this.phoneList.size(); i++) {
            if(this.phoneList.get(i).name.equals(name)) {
                return this.phoneList.get(i);

            }
        }
        return new PhoneNumber();
    }

    @Override
    public void sort() {
        while(true){
            int count = 0;
            for (int i = 0; i < this.phoneList.size() - 1; i++) {
                if (this.phoneList.get(i).name.charAt(0) > this.phoneList.get(i + 1).name.charAt(0)) {
                    PhoneNumber temp = this.phoneList.get(i);
                    this.phoneList.set(i, this.phoneList.get(i + 1));
                    this.phoneList.set(i + 1, temp);
                    count ++;

                }

            }
            if(count == 0) {
                return;
            }

        }
    }
}