package pl.camp.it.lambda;

import java.util.*;
import java.util.function.*;

public class Main {
    public static void main(String[] args) {
        List<Car> cars = new ArrayList<>();
        cars.add(new Car("Audi", "A3", 140000));
        cars.add(new Car("Mercedes", "S500", 440000));
        cars.add(new Car("Fiat", "Tipo", 38000));
        cars.add(new Car("Toyota", "Corolla", 80000));

        System.out.println(cars);

        Collections.sort(cars, new Comparator<Car>() {
            @Override
            public int compare(Car car1, Car car2) {
                return car1.getPrice() - car2.getPrice();
            }
        });

        System.out.println("Posortowane samochody:");
        System.out.println(cars);

        System.out.println("-----------------------------------");


        Function<String, Car> funkcja = x -> new Car(x, x + "Model", 9000);
        Car c = funkcja.apply("Tesla");
        System.out.println(c);


        System.out.println("-----------------------------------");


        BiFunction<String, String, Car> biFunkcja = (x, y) -> new Car(x, y, 20000);
        Car c2 = biFunkcja.apply("Opel", "Insignia");
        System.out.println(c2);

        System.out.println("-----------------------------------");

        UnaryOperator<Integer> unary = x -> x * 4;
        System.out.println(unary.apply(5));


        System.out.println("-----------------------------------");


        Predicate<String> predykat = x -> x.equals("predykat");
        System.out.println(predykat.test("jakaśWartość"));
        System.out.println(predykat.test("predykat"));

        System.out.println("-----------------------------------");


        Supplier<Car> supplier = () -> new Car("Fiat", "Punto", 45000);
        Car c3 = supplier.get();
        System.out.println(c3);


        System.out.println("-----------------------------------");



        Consumer<Car> consumer = x -> System.out.println(x);
        consumer.accept(c);

        System.out.println("-----------------------------------");


        Comparator<Car> komparatorSamochodow = (x, y) -> y.getPrice() - x.getPrice();

        Collections.sort(cars, komparatorSamochodow);
        System.out.println(cars);

        System.out.println("-----------------------------------");


        Collections.sort(cars, (x, y) -> x.getPrice() - y.getPrice());
        System.out.println(cars);


        System.out.println("-----------------------------------");

















    }


}
