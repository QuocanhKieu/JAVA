public class Main{
    public static void main(String[] args) {
        System.out.println("Hello World!");

        double t = 15.15;
//        sayHello("Everybody");

//        isNguyenTo(8);

//        System.out.println(findFiboN(7));

        System.out.println(findNearestPrimeOf(8));
    }
    static void sayHello(String msg) {
        System.out.println("hello" + msg );
    }

    static boolean isNguyenTo(int num) {
        if (num < 1) {
            return false;
        }

        for( int i = 2; i <=(int)(Math.sqrt(num)) ;i++) {
            if (num % i == 0 ) {
                return false;
            }

        }
        return true;

    }

    static int findFiboN(int order) {
        if (order == 0) return 0;
        if (order == 1) return 1;
        int pre = 0;
        int cur = 1;
        for (int i = 0; i < order -1 ; i++)
        {
            int temp = cur;
            cur = cur + pre;
            pre = temp;
        }
        return cur;
    }

    static int findNearestPrimeOf(int num) {
        for( int i = num- 1 ; i >= 2; i--) {

            if (isNguyenTo(i))
                return i;
        }
        return 2;
    }
}