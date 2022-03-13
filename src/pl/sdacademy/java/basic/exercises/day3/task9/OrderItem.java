package pl.sdacademy.java.basic.exercises.day3.task9;

public class OrderItem {
    private String productName;
    private int quantity;
    private double price;

    public OrderItem(String productName, int quantity, double price) {
        this.productName = productName;
        this.quantity = quantity;
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public String getProductName() {
        return productName;
    }

    double getAmount(){
        return price * quantity;
    }

    boolean isCorrect(){
        return quantity > 0 && price > 0;
    }

    public void print(){
        //System.out.println(this);
        StringBuilder sb = new StringBuilder();
        sb.append(productName).append(" \t| ");
        sb.append(price).append(" zl \t| ");
        sb.append(quantity).append(" pcs \t| ");
        sb.append(getAmount()).append(" zl");
        System.out.println(sb);
    }

    //@Override
    //public String toString() {
        //return productName + " | " + quantity +
               // " pcs | " + price +
               // "zl" + " | " + getAmount();
    //}
}
