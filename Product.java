//MALII STEPHEN MUUNGAMI
//CT100/G/22156/24
// E-COMMERCE PRODUCT SYSTEM
public class Product {

    private String productId;
    private String name;
    private double price;
    private int quantityInStock;

    public Product(String id, String name, double price, int qty) {
        this.productId = id;
        this.name = name;
        this.price = price;
        this.quantityInStock = qty;
    }

    public String getProductId() {
        return productId;
    }

    public int getQuantity() {
        return quantityInStock;
    }

    public void updatePrice(double newPrice) {
        price = newPrice;
    }

    public void sell(int qty) {
        if (quantityInStock >= qty) {
            quantityInStock -= qty;
        }
    }

    public void restock(int qty) {
        quantityInStock += qty;
    }

    public void displayProduct() {
        System.out.println(productId + " " + name +
                " Price: " + price +
                " Stock: " + quantityInStock);
    }
}
