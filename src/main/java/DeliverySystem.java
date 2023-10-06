public final class DeliverySystem {
    private final static DeliverySystem deliverySystem = new DeliverySystem();
    private Product product;
    private double miles;
    private double totalPrice;
    private DeliverySystem() {
        this.product = null;
        this.miles = 0.0;
        this.totalPrice = 0.0;
    }

    public Product getProduct() {
        return product;
    }

    private void setProduct(Product product) {
        this.product = product;
    }

    public double getMiles() {
        return miles;
    }

    private void setMiles(double miles) {
        this.miles = miles;
    }

    public double getTotalPrice() {
        return Math.round(totalPrice * 100.0) / 100.0;
    }

    public void calculateTotalPrice(Product product, double miles) {
        int deliveryFee;
        setProduct(product);
        setMiles(miles);
        if (miles >= 0 && miles <= 5) {
            deliveryFee = 2;
        }
        else if (miles > 5 && miles <= 15) {
            deliveryFee = 5;
        }
        else if (miles > 15 && miles <= 25) {
            deliveryFee = 10;
        }
        else if (miles > 25 && miles <= 50) {
            deliveryFee = 15;
        }
        else {
            deliveryFee = 20;
        }
        totalPrice = deliveryFee + (product.getPrice() * product.getQuantityOrder());
    }

    public void printReceipt() {
        System.out.println("ITEM RECEIPT\n");
        System.out.println("Product     QTY     Price     Miles     Total");
        System.out.println("------      ---     -----     -----     -----");
        System.out.printf("%-12s %-6d $%4.2f     %4.2f     $%4.2f", product.getName(), product.getQuantityOrder(), product.getPrice(), miles, getTotalPrice());
        //System.out.println(product.getName() + "        " + product.getQuantityOrder() + "       $" + product.getPrice() + "     " + miles + "      $" + getTotalPrice());
        System.out.println("\nTHANK YOU. COME AGAIN");
    }
    public static DeliverySystem getInstance() {
        return deliverySystem;
    }
}
