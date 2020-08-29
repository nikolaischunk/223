package ch.noser.helloworld.domainModels.orders;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderServiceImpl implements OrderService{

    @Autowired
    OrderRepository repo;

    @Override
    public List<Order> getAllOrders() {
        return repo.findAll();
    }

    @Override
    public Order getOrderById(OrderKey id) {
        return repo.findById(id).orElse(null);
    }

    @Override
    public String addOrder(Order NewOrder) {
        System.out.println("lolllllllllll: " + NewOrder);
        NewOrder.setId(new OrderKey(NewOrder.getUser().getUserId(), NewOrder.getProduct().getProductId()));
        repo.save(NewOrder);
        return "Order created!";
    }

    @Override
    public String deleteOrderBYId(OrderKey id) {
        repo.deleteById(id);
        return "Order with ID " + id + " deleted!";
    }

    @Override
    public String updateOrder(OrderKey id, Order NewOrder) {
        Order order = repo.findById(id).orElse(null);
        order.setAmount(NewOrder.getAmount());
        return "Order with ID " + id + " updated!";
    }
}
