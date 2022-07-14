package kg.attractor.java;

 import kg.attractor.java.homework.RestaurantOrders;
 import kg.attractor.java.homework.domain.Item;
 import kg.attractor.java.homework.domain.Order;

 import java.util.List;

 import static java.util.Comparator.comparingDouble;
 import static java.util.stream.Collectors.*;
 import static java.util.Comparator.*;

// используя статические imports
// мы импортируем *всё* из Collectors и Comparator.
// теперь нам доступны такие операции как
// toList(), toSet() и прочие, без указания уточняющего слова Collectors. или Comparator.
// вот так было до импорта Collectors.toList(), теперь стало просто toList()


public class Main {

    public static void main(String[] args) {

        // это для домашки
        // выберите любое количество заказов, какое вам нравится.

        //var orders = RestaurantOrders.read("orders_100.json").getOrders();
        //var orders = RestaurantOrders.read("orders_1000.json").getOrders();
        //var orders = RestaurantOrders.read("orders_10_000.json").getOrders();

        // протестировать ваши методы вы можете как раз в этом файле (или в любом другом, в котором вам будет удобно)
        var orders = RestaurantOrders.read("orders_100.json").getOrders();
      // orders.forEach(System.out::println);
        System.out.println("--------------Сумма заказов----------------\n");
        var total = orders.stream()
                .mapToDouble(e->e.getTotal())
                .sum();
        System.out.println("\n"+total);

//        System.out.println("--------------Список заказов----------------\n");
//        var list = orders.stream()
//                .flatMap(e -> e.getItems().stream())
//                .map(e->e.getName())
//                .collect(toList());
//         list.forEach(System.out::println);

        var maxPrice = orders.stream()

               .flatMap(a -> a.getItems().stream())
               .map( e ->  e.getPrice())
                .collect(toList());

        System.out.println(maxPrice);
           maxPrice.stream();









    }
}
