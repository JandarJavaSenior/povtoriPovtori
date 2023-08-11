import java.time.LocalDate;
import java.util.Random;

public class Product {

    private String productName;
    private int expDay;
    private boolean isFrash;
    private LocalDate produsetOn;
    private String placeOfProducts;
    private  static Random random;

    Product(String productName, int expDay) {
        this.productName = productName;
        this.expDay = expDay;
        geterateData();
        setPlase();
        isFresh();
    }

    private void isFresh(){
        int ex = 0;
        if (this.placeOfProducts.equals("Shon - Case")){
            ex = this.expDay/2;
        }else {
            ex = this.expDay;
        }

        if(produsetOn.plusDays(this.expDay).isAfter(LocalDate.now())){
            this.isFrash = true;
        }else {
            this.isFrash = false;}
    }
    private void setPlase(){random = new Random();

        int randomNamber = random.nextInt(2);
        if (randomNamber == 1){
            this.placeOfProducts = "Shon - Case";
        }else {
            this.placeOfProducts = "Ise - Boks";
        }
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public int getExpDay() {
        return expDay;
    }

    private void geterateData(){
        Random random = new Random();

        int month = random.nextInt(8) + 1;
        int day = random.nextInt(28) + 1;

        this.produsetOn = LocalDate.of(2023, month, day);

    }


    public boolean isFrashs() {
        return isFrash;
    }


    public LocalDate getProdusetOn() {
        return produsetOn;
    }

    public void setProdusetOn(LocalDate produsetOn) {
        this.produsetOn = produsetOn;
    }

    public String getPlaceOfProducts() {
        return placeOfProducts;
    }

    public void setPlaceOfProducts(String placeOfProducts) {
        this.placeOfProducts = placeOfProducts;
    }
}
