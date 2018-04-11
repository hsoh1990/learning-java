package e04.stream.ex;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

public class StreamExample01 {
    public static void main(String[] args) {
        List<Product> products = Arrays.asList(
                new Product(1L, "A", new BigDecimal("100.00")),
                new Product(2L, "B", new BigDecimal("20.00")),
                new Product(3L, "C", new BigDecimal("30.01")),
                new Product(4L, "D", new BigDecimal("80.00")),
                new Product(5L, "E", new BigDecimal("7.00"))
        );

        System.out.println("Products.price >=30 : " +
                products.stream()
                        .filter(product -> product.getPrice().compareTo(new BigDecimal("30.00")) >= 0)
                        .collect(toList())
        );

        System.out.println("Products.price >=30 : \n" +
                products.stream()
                        .filter(product -> product.getPrice().compareTo(new BigDecimal("30.00")) >= 0)
                        .map(product ->product.toString())
                        .collect(joining("\n"))
        );

        System.out.println(IntStream.of(1,2,3,4,5).sum());

        System.out.println("Products.price sum :  " +
                products.stream()
                .map(product -> product.getPrice())
                .reduce(BigDecimal.ZERO, (price1, price2) -> price1.add(price2))
        );

        System.out.println("Products.price sum (>=30):  " +
                products.stream()
//                        .map(product -> product.getPrice())
                        .map(Product::getPrice)
                        .filter(price -> price.compareTo(new BigDecimal("30")) >=0)
//                        .reduce(BigDecimal.ZERO, (price1, price2) -> price1.add(price2))
                        .reduce(BigDecimal.ZERO, BigDecimal::add)
        );

        System.out.println("Products.price >=30 count :  " +
                products.stream()
                        .filter(product -> product.getPrice().compareTo(new BigDecimal("30"))>=0)
                        .count()
        );
    }
}

@Data
@AllArgsConstructor
class Product {
    private long id;
    private String name;
    private BigDecimal price;

}
