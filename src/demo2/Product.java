package demo2;

public class Product {
    public Product(String Id,String name, float price,int qty, String unit) {
        this.name = name;
        this.price = price;
        this.Id = Id;
        this.unit = unit;
        this.qty = qty;

    }
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