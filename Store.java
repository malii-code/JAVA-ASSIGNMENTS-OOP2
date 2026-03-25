//MALII STEPHEN MUUNGAMI
//CT100/G/22156/24
//E-COMMERCE PRODUCT SYSTEM
public class Store {

    private Product[] inventory = new Product[10];
    private int count = 0;

    public void addProduct(Product p) {
        inventory[count++] = p;
    }

    public void sellProduct(String id, int qty) {
        for (Product p : inventory) {
            if (p != null && p.getProductId().equals(id)) {
                p.sell(qty);
            }
        }
    }

    public void listLowStock() {
        for (Product p : inventory) {
            if (p != null && p.getQuantity() < 10) {
                p.displayProduct();
            }
        }
    }
}
