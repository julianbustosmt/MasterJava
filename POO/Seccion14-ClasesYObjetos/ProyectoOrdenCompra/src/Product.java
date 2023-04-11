public class Product {

    private String producer;
    private String name;
    private int price;

    public Product(String producer, String name, int price) {
        this.producer = producer;
        this.name = name;
        this.price = price;
    }

    public int getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "\n{" +
                "producer ='" + this.producer + '\'' +
                ", name ='" + this.name + '\'' +
                ", price =" + this.price +
                "'}";
    }
}
