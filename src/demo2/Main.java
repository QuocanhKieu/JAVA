package demo2;

public class Main {
    public static void main(String[] args) {
        Product p1 = new Product("1", "Phone", 10.5f, 5,"piece");
        Product p2 = new Product("2", "Laptop", 10.5f, 5,"piece");
        Product p3 = new Product("3", "Graphic Card", 10.5f, 5,"piece");

        System.out.println(p1.name);
    }
}
