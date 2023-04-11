import java.util.Arrays;
import java.util.Date;

public class PurchaseOrder {
    private int id;
    private String description;
    private Date date;
    private Client client;
    private Product[] products;

    private int productIndex = 0;
    private static int idIncrement;

    public PurchaseOrder(String description) {
        this.setId(++idIncrement);
        this.description = description;
        this.setDate(new Date());
        this.products = new Product[4];
    }

    public int getId() {
        return id;
    }

    private void setId(int id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public Date getDate() {
        return date;
    }

    private void setDate(Date date) {
        this.date = date;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public Product[] getProducts() {
        return products;
    }

    public PurchaseOrder addProduct(Product product) {
        if (this.productIndex < this.products.length) {
            this.products[this.productIndex++] = product;
        }
        return this;
    }

    public double calculateFullPrice(Product[] products) {
        double fullPrice = 0;
        for (Product product : products
        ) {
            fullPrice += product.getPrice();
        }
        return fullPrice;
    }

    public double showFullPrice() {
        return calculateFullPrice(this.getProducts());
    }

    @Override
    public String toString() {
        return this.getDescription() + ":\n" +
                "id = " + this.getId() +
                "\nDate = " + this.getDate() +
                "\nClient = " + this.getClient() +
                "\nProducts = " + Arrays.toString(this.getProducts()) +
                "\nFull price = " + showFullPrice();
    }
}
