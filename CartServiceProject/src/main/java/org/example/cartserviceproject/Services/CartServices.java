package org.example.cartserviceproject.Services;

import org.example.cartserviceproject.DTO.CartDTO;
import org.example.cartserviceproject.Models.Cart;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service

public class CartServices implements ServiceCart {
    private final RestTemplate restTemplate = new RestTemplate();
    @Override
    public Cart getAllCarts(){
        CartDTO abc = restTemplate.getForObject(
                "https://fakestoreapi.com/carts",
                CartDTO.class
        );
        Cart cart = new Cart();
        assert abc != null;
        cart.setUserId(abc.getUserId());
        return cart;
    }

    @Override
    public Cart getSingleCart(long id){
        CartDTO abc = restTemplate.getForObject(
                "https://fakestoreapi.com/carts/"+id,
                CartDTO.class
        );
        Cart cart = new Cart();
        assert abc != null;
        cart.setUserId(abc.getUserId());
        cart.setId(abc.getId());
        cart.setDate(abc.getDate());
        return cart;
    }
}