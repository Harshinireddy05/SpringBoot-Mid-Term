package org.example.cartserviceproject.Models;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter

public class Cart {
    private long id;
    private int userId;
    private String date;
    private String[] products;
}
