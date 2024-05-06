package lab9;

import java.util.*;

public class Lists {
    ArrayList<Integer> arrayList;
    LinkedList<Integer> linkedList;

    public void run() {
        arrayList = new ArrayList<>();
        addElementsToLists(arrayList);
        selectRandomElements(arrayList);
        linkedList = new LinkedList<>();
        addElementsToLists(linkedList);
        // Refactoring through the addElementsToLists method increased the time for adding LinkedList elements by 5-7 times
        // selectRandomElements(linkedList);
        // a very long time
    }
    public void addElementsToLists(List<Integer> list) {
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < 1000000; i++) {
            list.add(i);
        }
        long endTime = System.currentTimeMillis();
        long elapsedTime = endTime - startTime;
        System.out.println("Adding a "+ (long) list.size() +" elements to the "+ list.getClass() +" took: " + elapsedTime + " milliseconds");
    }
    public static void selectRandomElements(List<Integer> list) {
        Random random = new Random();
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < 100000; i++) {
            int randomElement = list.get(random.nextInt(list.size()));
        }
        long endTime = System.currentTimeMillis();
        long elapsedTime = endTime - startTime;
        System.out.println("Time spent selecting elements from "+ list.getClass() +" at random: " + elapsedTime + " milliseconds");
    }
}