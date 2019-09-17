public class BakedGood {
    private String name;
    private double price;
    private int expirationDate;
    private boolean containsGluten;
    private boolean containsDairy;
    private boolean containsNuts;
    private boolean containsSoy;
    private int quantityInStock;

    public BakedGood(){

    }

    public BakedGood(String name, double price, int expirationDate, boolean containsGluten,
                     boolean containsDairy, boolean containsNuts, boolean containsSoy, int quantityInStock){
        this.name = name;
        this.price = price;
        this.expirationDate = expirationDate;
        this.containsGluten = containsGluten;
        this.containsDairy = containsDairy;
        this.containsNuts = containsNuts;
        this.containsSoy = containsSoy;
        this.quantityInStock = quantityInStock;
    }

    public String getDisplayText(){
        String lineitem = name + "\t\t$" + price + "\t";
        if(containsGluten){
            lineitem += "\tcontains gluten";
        }
        if(containsDairy){
            lineitem += "\tcontains dairy";
        }
        if(containsNuts){
            lineitem += "\tcontains nuts";
        }
        if(containsSoy){
            lineitem += "\tcontains soy";
        }
        return lineitem;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getExpirationDate() {
        return expirationDate;
    }

    public void setExpirationDate(int expirationDate) {
        this.expirationDate = expirationDate;
    }

    public boolean isContainsGluten() {
        return containsGluten;
    }

    public void setContainsGluten(boolean containsGluten) {
        this.containsGluten = containsGluten;
    }

    public boolean isContainsDairy() {
        return containsDairy;
    }

    public void setContainsDairy(boolean containsDairy) {
        this.containsDairy = containsDairy;
    }

    public boolean isContainsNuts() {
        return containsNuts;
    }

    public void setContainsNuts(boolean containsNuts) {
        this.containsNuts = containsNuts;
    }

    public boolean isContainsSoy() {
        return containsSoy;
    }

    public void setContainsSoy(boolean containsSoy) {
        this.containsSoy = containsSoy;
    }

}
