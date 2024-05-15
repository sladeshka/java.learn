package lesson14;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Collectors;

public class StreamApiTest {
    public static void main(String[] args) {
        List<PromoCode> promos = new ArrayList<>();
        promos.add(new PromoCode("DISCOUNT1", false));
        promos.add(new PromoCode("DISCOUNT2", true));
        promos.add(new PromoCode("DISCOUNT3", false));
        promos.add(new PromoCode("DISCOUNT4", true));

        promos.forEach(System.out::println);

        List<PromoCode> collect = promos.stream()
                .filter(PromoCode::getExpired)
                .collect(Collectors.toList());

        collect.forEach(System.out::println);

        List<PromoCode> collect2 = promos.stream()
                .filter(promoCode -> !promoCode.getExpired())
                .collect(Collectors.toList());

        collect2.forEach(System.out::println);

        List<PromoCode> collect3 = promos.stream()
                .filter(promoCode -> promoCode.getCode().equals("DISCOUNT4"))
                .collect(Collectors.toList());
        collect3.forEach(System.out::println);

        Map<String, List<PromoCode>> collect4 = promos.stream()
                .collect(Collectors.groupingBy(PromoCode::getCode));

        System.out.println(collect4);

        List<PromoCode> discount4 = collect4.get("DISCOUNT4");
        discount4.forEach(System.out::println);

        AtomicInteger count = new AtomicInteger();
        collect4.forEach((key, val) -> {
            if(key.equals("DISCOUNT4")) {
                val.forEach(System.out::println);
                count.getAndIncrement();
                System.out.println(count);
            }
        });

        promos.sort(Comparator.comparing(PromoCode::getCode));
        promos.forEach(System.out::println);
        promos.sort(Comparator.comparing(PromoCode::getCode, Comparator.reverseOrder()));
        promos.forEach(System.out::println);

        List<String> c = promos.stream()
                .map(PromoCode::getCode)
                .collect(Collectors.toList());

        c.forEach(System.out::println);

    }
}
