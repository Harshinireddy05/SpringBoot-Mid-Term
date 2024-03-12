package org.example.cartserviceproject.DTO;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter

public class CartDTO {
    long id;
    int userId;
    String date;
    String[] products;
}