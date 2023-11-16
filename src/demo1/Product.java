package demo1;

public class Product {
    String Id;
    String name;
    float price = 0;

    int qty = 0;

    String unit;

    void increQty() {

        qty += 1;
    }

    void decreQty() {
        if( qty == 0) return;
        qty -= 1;
    }

    void changePrice(float price) {
        if (price < 0) return;
        this.price = price;

    }

    void printQty() {
        if (qty <=0) System.out.println("Out Of Stock");
        else System.out.println("In Stock");
    }
}
