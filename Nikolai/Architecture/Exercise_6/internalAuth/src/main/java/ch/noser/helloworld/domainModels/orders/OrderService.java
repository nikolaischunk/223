package ch.noser.helloworld.domainModels.orders;


import java.util.List;

public interface OrderService {

    List<Order> getAllOrders();

    Order getOrderById (OrderKey id);

    String addOrder(Order NewOrder);

    String deleteOrderBYId(OrderKey id);

    String updateOrder(OrderKey id, Order NewOrder);
}
