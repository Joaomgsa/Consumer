package application;

import entities.Products;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class Program {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        List<Products> list = new ArrayList<>();

        list.add(new Products("Tv", 900.0));
        list.add(new Products("Mouse", 50.0));
        list.add(new Products("Tablet", 350.0));
        list.add(new Products("HD Case", 80.90));

        list.forEach();

    }
}