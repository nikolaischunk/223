package ch.noser.helloworld.domainModels.orders;

import org.aspectj.weaver.ast.Or;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/orders")
public class OrderController {

    OrderService Service;

    public OrderController(OrderService OrderService){
        this.Service = OrderService;
    }

    @GetMapping("")
    ResponseEntity<List<Order>> getAll (){
        return new ResponseEntity<>(Service.getAllOrders(), HttpStatus.OK);
    }

    @GetMapping("/{userId}/{productId}")
    ResponseEntity<Order> getOrderById (@PathVariable String userId, @PathVariable String productId){
        return new ResponseEntity<>(Service.getOrderById(new OrderKey(userId, productId)), HttpStatus.OK);
    }

    @PostMapping("")
    ResponseEntity<String> postOrder (@RequestBody Order NewOrder){
        return new ResponseEntity<>(Service.addOrder(NewOrder), HttpStatus.CREATED);
    }
}
