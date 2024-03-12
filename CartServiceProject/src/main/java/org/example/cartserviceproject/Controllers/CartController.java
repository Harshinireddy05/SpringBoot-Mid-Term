package org.example.cartserviceproject.Controllers;

import org.example.cartserviceproject.Models.Cart;
import org.example.cartserviceproject.Services.CartServices;
import org.springframework.web.bind.annotation.*;

import java.sql.SQLOutput;

@RestController

public class CartController {
    private CartServices cartServices;
    public CartController(CartServices cartServices) {
        this.cartServices = cartServices;
    }

    @GetMapping("/carts")
    public Cart getAllCarts() {
        return new Cart();
    }

    @GetMapping("/carts/{id}")
    public Cart getSingleCart(@PathVariable("id") long id) {
        return cartServices.getSingleCart(id);
    }

    @GetMapping("/carts/{date}")
    public Cart getCartByDate(@PathVariable String date) {
        return new Cart();
    }

    @GetMapping("/carts/{userId}")
    public Cart getUserCart(@PathVariable int userId) {
        return new Cart();
    }

    @PostMapping("/carts/")
    public Cart addCart(@RequestBody Cart cart) {
        return new Cart();
    }

    @PutMapping("/carts/{id}")
    public Cart updateCart(@RequestBody Cart cart) {
        return new Cart();
    }

    @DeleteMapping("/carts/{id}")
    public Cart deleteCart(@PathVariable long id) {
        return new Cart();
    }
}
