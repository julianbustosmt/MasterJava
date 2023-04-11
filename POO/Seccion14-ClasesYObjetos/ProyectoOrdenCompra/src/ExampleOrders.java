public class ExampleOrders {
    public static void main(String[] args) {

        PurchaseOrder order1 = new PurchaseOrder("Orden 1");

        Client client1 = new Client("Juan", "Perez");
        order1.setClient(client1);

        Product product1 = new Product("Nvidia", "RTX-4090",15);
        Product product2 = new Product("AMD", "RX-6600",13);
        Product product3 = new Product("Gigabyte", "RTX-4080",12);
        Product product4 = new Product("MSI", "RTX-4070",10);

        order1.addProduct(product1).addProduct(product2).addProduct(product3).addProduct(product4);

        PurchaseOrder order2 = new PurchaseOrder("Orden 2");

        Client client2 = new Client("Pablo", "Pica");
        order2.setClient(client2);

        Product product5 = new Product("Nvidia", "RTX-4090",18);
        Product product6 = new Product("AMD", "RX-6600",19);
        Product product7 = new Product("Gigabyte", "RTX-4080",20);
        Product product8 = new Product("MSI", "RTX-4070",21);

        order2.addProduct(product5).addProduct(product6).addProduct(product7).addProduct(product8);

        PurchaseOrder order3 = new PurchaseOrder("Orden 3");

        Client client3 = new Client("Pedro", "Perez");
        order3.setClient(client3);

        Product product9 = new Product("Nvidia", "RTX-4090",4);
        Product product10 = new Product("AMD", "RX-6600",87);
        Product product11 = new Product("Gigabyte", "RTX-4080",42);
        Product product12 = new Product("MSI", "RTX-4070",23);

        order3.addProduct(product9).addProduct(product10).addProduct(product11).addProduct(product12);

        System.out.println(order1 + "\n\n" + order2 + "\n\n" + order3 );

    }
}
