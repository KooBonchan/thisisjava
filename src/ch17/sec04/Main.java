package ch17.sec04;

import java.util.ArrayList;
import java.util.List;

public class Main {
  public static void main(String[] args) {
    List<Product> list = new ArrayList<>();
    for(int i = 1; i <=5; i++){
      list.add(new Product.ProductBuilder()
          .pno(i)
          .name("Product"+i)
          .company("Fodera")
          .price(((int)(100 * Math.random()) + 50) * 10000)
          .build());
    }

    list.stream().forEach(System.out::println);
  }
}
