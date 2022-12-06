package application;

import entities.Products;
import util.UpperCaseName;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Program {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        List<Products> list = new ArrayList<>();

        list.add(new Products("Tv", 900.0));
        list.add(new Products("Mouse", 50.0));
        list.add(new Products("Tablet", 350.0));
        list.add(new Products("HD Case", 80.90));



        List<String> names = list.stream().map(prod -> prod.getName().toUpperCase()).collect(Collectors.toList());

        names.forEach(System.out::println);

    }
}