
// Use parallel streams when processing a large dataset with CPU-intensive operations and when 
// tasks are independent. 
// For small datasets, sequential streams are usually
//  better because parallel streams introduce thread management overhead.

import java.util.ArrayList;
class ParallelSteamExample {

    public static void main(String[] args) {
        Long startTime;
        Long endTime;
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);

        System.out.println(numbers);

        startTime = System.currentTimeMillis();
        numbers.stream().forEach(System.out::println);
        endTime = System.currentTimeMillis();
        System.out.println("Time taken for sequential stream: " + (endTime - startTime) + " milliseconds");

        startTime = System.currentTimeMillis();
        numbers.parallelStream().forEach(System.out::println);
        endTime = System.currentTimeMillis();
        System.out.println("Time taken for parallel stream: " + (endTime - startTime) + " milliseconds");

    }
}
