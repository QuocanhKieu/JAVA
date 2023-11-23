package buoi5;

public class Main {
    public  static void main (String[] args) {
//        Person p = new Person();

        Person p1 = new Person() {
            @Override
            public void run() {
                System.out.println("Male runs");
            }
        };
    }
}
