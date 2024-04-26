package lesson9;

import lab2.Car;
import lesson6.AnotherChild;
import lesson6.Child;
import lesson6.Parent;

import javax.swing.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        List list = new ArrayList();

        list.add(123);
        list.add("str");
        list.add(true);
        list.add(new Car());

        System.out.println(list);

        List<String> strings = new ArrayList<>();

        strings.add("123");
        strings.add("str");
        strings.add("true");
        strings.add(new Car().toString());

        System.out.println(strings);

        Parent parent = new Parent("Jack");
        Child child = new Child("Tom");
        AnotherChild anotherChild = new AnotherChild("Joe");

        someMethod(parent);
        someMethod(child);
        someMethod(anotherChild);

        List<Parent> parents = new ArrayList<>();
        List<Child> children = new ArrayList<>();
        List<AnotherChild> anotherChildren = new ArrayList<>();

        handleList(parents);
        handleList(children);
        handleList(anotherChildren);

        listMethod(parents);
        listMethod(children);

        List<Integer> ints = new ArrayList<>();
        List<List<List<Integer>>> ints3 = new ArrayList<>();

        System.out.println(ints3);

        ints.add(555);
        ints.add(333);
        ints.add(2);
        ints.add(2);
        ints.add(2);
        ints.add(5);
        ints.add(1);
        ints.add(3);
        ints.add(4);

        System.out.println(ints);
        Collections.sort(ints);
        System.out.println(ints);

        for (int i = 0; i < ints.size(); i++) {
            System.out.println(ints.get(i));
        }

        for (Integer integer : ints) {
            System.out.println(integer);
        }

        ints.remove(2);
        ints.remove(Integer.valueOf(2));
        System.out.println(ints);

        for (Integer integer : ints) { // .ConcurrentModificationException
            if (integer > 333) {
//                ints.remove(integer);
            }
        }
//        long
//        Iterator<Integer> iterator = ints.iterator();
//        while (iterator.hasNext()){
//            Integer next = iterator.next();
//            if(next > 333) {
//                iterator.remove();
//            }
//        }
        // short
        ints.removeIf(next -> next > 333);

        System.out.println(ints);

        if (ints != null && !ints.isEmpty()) {
            System.out.println(ints);
        }

        List<Integer> ints4 = List.of(123, 321);
        // ints4.add(123); // .UnsupportedOperationException

        List<Integer> integers = Collections.unmodifiableList(ints4);
        List<Integer> integers1 = new ArrayList<>(integers);

        Set<String> set = new HashSet<>();
        for (int i = 0; i < 100; i++) {
            set.add("Java" + i);
        }

        System.out.println(set);

        Set<String> set2 = new LinkedHashSet<>();
        for (int i = 0; i < 100; i++) {
            set2.add("Java" + i);
        }

        System.out.println(set2);

        Set<String> set3 = new TreeSet<>();
        for (int i = 0; i < 100; i++) {
            set3.add("Java" + i);
        }

        System.out.println(set3);

        Set<Integer> uniques = new HashSet<>(ints);
        System.out.println(uniques);

        Set<Object> objects = Set.of();

        Set<Integer> un = Collections.unmodifiableSet(uniques);

        ArrayList<Integer> integers2 = new ArrayList<>(uniques);

        System.out.println(integers2);

        //  key     value
        Map<String, Integer> map = new HashMap<>();
        for (int i = 0; i < 15; i++) {
            map.put("key" + i, i);
        }

        map.put("key12", 14);

        System.out.println(map);

        Set<String> keys = map.keySet();
        Collection<Integer> values = map.values();

        Integer x = map.get("key12");
        System.out.println(x);

        System.out.println(getkeysByValue(map, 14));
    }

    public static Set<String> getkeysByValue(Map<String, Integer> map, Integer value) {
        Set<String> result = new HashSet<>();
        for (Map.Entry<String, Integer> pair : map.entrySet()) {
            String key = pair.getKey();
            Integer val = pair.getValue();
            if(val.equals(value)) {
                result.add(key);
            }

        }
        return result;
    }

    public static void someMethod(Parent parent) {
        // some do
    }

    public static void handleList(List<? extends Parent> objects) {
        // some do
    }

    public static void listMethod(List<? super Child> objects) {
        // some do
    }
}
