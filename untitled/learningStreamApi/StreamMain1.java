package learningStreamApi;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;


public class StreamMain1 {
    public static void main(String[] args) {

        List<Integer> numberList = new ArrayList<>();
        for (int i = 1; i <= 100; i++) {
            numberList.add(i);
        }
        System.out.println(numberList);

//        Doubling the list
        System.out.println("Doubling the list");
        List<Integer> doubleListValue = numberList.stream().map(i -> i * 2).collect(Collectors.toList());
        System.out.println(doubleListValue);

//        filetring even Numbers
        System.out.println("Filtering Even Numbers");
        List<Integer> evenList = numberList.stream().filter(integer -> integer % 2 == 0).collect(Collectors.toList());
        System.out.println(evenList);


        String[] name = new String[]{"Rahman", "Tannu"};
        System.out.println(name.length);
        List<String> nameArrayList = new ArrayList<>();
        nameArrayList.addAll(List.of(name));
        System.out.println(nameArrayList);
        List<String> nameWithPrefix = nameArrayList.stream().map(individualName -> "Mr. " + individualName).collect(Collectors.toList());
        System.out.println(nameWithPrefix);
    }
}

