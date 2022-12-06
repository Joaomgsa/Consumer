package util;

import entities.Products;

import java.util.function.Consumer;

public class PriceUpdate implements Consumer<Products> {

    @Override
    public void accept(Products prod){
        prod.setPrice(prod.getPrice() * 1.1);
    }
}
