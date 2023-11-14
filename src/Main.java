public class Main{
    public static void main(String[] args) {
        System.out.println("Hello World!");

        double t = 15.15;
        sayHello("Everybody");



        System.out.println();

        isNguyenTo(8);
    }
    static void sayHello(String msg) {
        System.out.println("hello" + msg );
    }

    static void isNguyenTo(int num) {
        if (num < 1) {
            System.out.println("Ko La So Nguyen To");
            return;
        }

        for( int i = 2; i <=(int)(Math.sqrt(num)) ;i++) {
            if (num % i == 0 ) {
                System.out.println("Ko La So Nguyen To");
                return;
            }

        }
        System.out.println("La So Nguyen To");
    }
}