package pl.sdacademy.java.basic.exercises.day3.task9;

public class Main {
    public static void main(String[] args) {
        OrderItem orderItem1 = new OrderItem("cukier", 1, 3.5);
        OrderItem orderItem2 = new OrderItem("maka", 2, 4);
        OrderItem orderItem3 = new OrderItem("chleb", 3, 4);
        OrderItem orderItem4 = new OrderItem("jaja", 4, 4);
        OrderItem orderItem5 = new OrderItem("melko", 5, 4);

        Order order = new Order(5);

        order.addItem(orderItem1);
        order.addItem(orderItem2);
        order.addItem(orderItem3);
        order.addItem(orderItem4);
        order.addItem(orderItem5);

        order.print();
    }
}
