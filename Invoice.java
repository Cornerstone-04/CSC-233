public class Invoice {
    // instance variables
    private String partNumber;
    private String partDescription;
    private int quantityPurchased;
    private double pricePerItem;

    // get methods
    public String getPartNumber() {
        return this.partNumber;
    }

    public String getPartDescription() {
        return this.partDescription;
    }

    public int getQuantityPurchased() {
        return this.quantityPurchased;
    }

    public double getPricePerItem() {
        return this.pricePerItem;
    }

    // setters for the instance variables
    public void setPartNumber(String partnumber) {
        this.partNumber = partnumber;
    }

    public void setPartDescription(String description) {
        this.partNumber = description;
    }

    public void setQuantityPurchased(int quantityPurchased) {
        if (quantityPurchased > 0) {
            this.quantityPurchased = quantityPurchased;
        } else {
            this.quantityPurchased = 0;
        }
    }

    public void setPricePerItem(double price) {
        if (price > 0) {
            this.pricePerItem = price;
        } else {
            this.pricePerItem = 0.0;
        }
    }

    // get invoice amount method
    public double getInvoiceAmount() {
        return this.getPricePerItem() * this.quantityPurchased;
    }

    // Class constructor

    Invoice(String number, String descritpion, int quantity, double price) {
        setPartNumber(number);
        setPartDescription(descritpion);
        setPricePerItem(price);
        setQuantityPurchased(quantity);
    }
}

// test class for the invoice class
class InvoiceTest {
    public static void main(String[] args) { // main method
        Invoice test = new Invoice("20/52ha000",
                "this is just a randome invoice object to test the functionality of the invoice class", 4, 230.50);
        System.out.println("the total amount for the invoice is : " + test.getInvoiceAmount());
        System.out.println("the price of each item purchased is : " + test.getPricePerItem());
    }
}
