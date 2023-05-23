public class Invoice {
    // declare instance variables
    private String partNumber;
    private String partDescription;
    private int quantityPurchased;
    private double pricePerItem;

    // create getters and setters
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

    public void setPartNumber(String part_no) {
        this.partNumber = part_no;
    }

    public void setPartDescription(String part_desc) {
        this.partDescription = part_desc;
    }

    public void setQuantityPurchased(int quantity) {
        if (quantityPurchased > 0) {
            this.quantityPurchased = quantity;
        } else {
            this.quantityPurchased = 0;
        }
    }

    public void setPricePerItem(double price) {
        if (pricePerItem > 0) {
            this.pricePerItem = price;
        } else {
            this.pricePerItem = 0.0;
        }
    }

// create class constructor
    Invoice(String part_no, String part_desc, int quantity, double price) {
        this.partNumber = part_no;
        this.partDescription = part_desc;
        this.pricePerItem = price;
        this.quantityPurchased = quantity;
    }

    // create invoice amount function
    public double getInvoiceAmount() {
        return this.pricePerItem * this.quantityPurchased;
    }

}

// create test class
class InvoiceTest {
    public static void main(String[] args){
        Invoice laptop =  new Invoice("#2atguuy", "Invoice generated for new HP Laptops", 24, 100.50);

        // print results
        System.out.println("Part Number: " + laptop.getPartNumber());
        System.out.println("Part Description: " + laptop.getPartDescription());
        System.out.println("Quantity purchased: " + laptop.getQuantityPurchased());
        System.out.println("Price per item: " + laptop.getPricePerItem());
        System.out.println("Total: " + laptop.getInvoiceAmount());
    }
}