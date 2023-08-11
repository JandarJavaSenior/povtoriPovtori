public class Store {
    Product [ ] products;
    public void doInspection(){
        System.out.println("=======================  Inspection result  =======================\n" +
                "Product      | Produced On   | Storage place   |  life days   | Fresh\n" +
                "\n" +
                "-----------+---------------+---------------+--------------+------------+");

        int i = 1;
        for (Product p:this.products) {

            System.out.printf("%d ,| %s       | %s       | %s       | %d       | %s   \n",
                    i,p.getProductName(),
                    p.getProdusetOn(),
                    p.getPlaceOfProducts(),
                    p.getExpDay(),
                    p.isFrashs());
            i++;
        }
    }

    public Product[] getProducts() {
        return products;
    }

    public void setProducts(Product[] products) {
        this.products = products;
    }
}
