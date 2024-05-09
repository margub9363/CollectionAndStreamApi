package learningStreamApi;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class FlatMapPractice {
    public static void main(String[] args) {
//         = [[1,2,3],[4,5,6],[7,8,9]];
        List<Integer> list1 = List.of(1, 2, 3);
        List<Integer> list2 = List.of(4, 5, 6);
        List<Integer> list3 = List.of(7, 8, 9);
        ArrayList<List<Integer>> mainList = new ArrayList<>();
        mainList.add(list1);
        mainList.add(list2);
        mainList.add(list3);

        System.out.println(mainList);
        List<Integer> afterFlatmap = mainList.stream().flatMap(x -> x.stream()).collect(Collectors.toList());
        System.out.println(afterFlatmap);

    }
}
