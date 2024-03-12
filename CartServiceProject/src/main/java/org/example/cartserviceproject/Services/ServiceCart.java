package org.example.cartserviceproject.Services;

import org.example.cartserviceproject.Models.Cart;

public interface ServiceCart {
    Cart getAllCarts();
    Cart getSingleCart(long id);
}