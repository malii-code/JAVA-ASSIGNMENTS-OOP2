//MALII STEPHEN  MUUNGAMI
//CT100/G/22156/24
//E-COMMERCE PRODUCT SYSTEM
public class StoreMain {

    public static void main(String[] args) {

        Store store = new Store();

        Product p1 = new Product("1","Laptop",60000,15);
        Product p2 = new Product("2","Phone",30000,8);
        Product p3 = new Product("3","Headphones",2000,20);
        Product p4 = new Product("4","Keyboard",1500,5);

        store.addProduct(p1);
        store.addProduct(p2);
        store.addProduct(p3);
        store.addProduct(p4);

        store.sellProduct("1",5);
        p4.restock(10);

        System.out.println("Low stock products:");
        store.listLowStock();
    }
}
