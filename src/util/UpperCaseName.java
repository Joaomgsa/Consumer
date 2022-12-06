package util;

import entities.Products;

import java.util.function.Function;

public class UpperCaseName implements Function<Products,String> {

    @Override
    public String apply(Products prod) {
        return prod.getName().toUpperCase();
    }
}
