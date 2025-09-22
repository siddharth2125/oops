class Order {
    int orderId; String orderDate;
    Order(int id,String d){ orderId=id; orderDate=d; }
    String getOrderStatus(){ return "Order Placed"; }
}

class ShippedOrder extends Order {
    String tracking;
    ShippedOrder(int id,String d,String t){ super(id,d); tracking=t; }
    @Override String getOrderStatus(){ return "Shipped:"+tracking; }
}

class DeliveredOrder extends ShippedOrder {
    String deliveryDate;
    DeliveredOrder(int id,String d,String t,String dd){ super(id,d,t); deliveryDate=dd; }
    @Override String getOrderStatus(){ return "Delivered:"+deliveryDate; }
}

public class OrderDemo {
    public static void main(String[] args){
        Order o1 = new Order(1,"2025-09-18");
        Order o2 = new ShippedOrder(2,"2025-09-17","TRK123");
        Order o3 = new DeliveredOrder(3,"2025-09-16","TRK456","2025-09-18");
        System.out.println(o1.getOrderStatus());
        System.out.println(o2.getOrderStatus());
        System.out.println(o3.getOrderStatus());
    }
}
