package pl.sdacademy.java.basic.exercises.day3.task9;

public class Order {
    private int maxOrderItem;
    private OrderItem[] items;
    private int currentQuantity;

    public Order(int maxOrderItem) {
        currentQuantity = 0;
        this.maxOrderItem = maxOrderItem;
        items = new OrderItem[maxOrderItem];
    }

    boolean addItem (OrderItem orderItem){
        if (currentQuantity >= maxOrderItem){
            System.out.println("Order is full");
            return false;
        }
        if (!orderItem.isCorrect()){
            System.out.println("Item is incorrect: " + orderItem.getProductName());
            return false;
        }
        items[currentQuantity] = orderItem;
        currentQuantity++;
        return true;
    }

    double getTotalAmout(){
        double totalAmount = 0;
        for (OrderItem element : items) {
            if (element != null){
                totalAmount += element.getAmount();
            }
        }
        return totalAmount;
    }

    int getItemsCount(){
       int totalItems = 0;
        for (OrderItem element : items) {
            if (element != null){
                totalItems += element.getQuantity();
            }
        }
        return totalItems;
    }

    void print(){
        for (OrderItem element : items) {
            if (element != null);
            element.print();
        }
        System.out.println("Total amount: " + getTotalAmout() + " zl");
        System.out.println("Count: " + getItemsCount() + " pcs");
    }
}
