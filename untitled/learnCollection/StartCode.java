package learnCollection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class StartCode {
    public static void main(String[] args) {
        System.out.println("Welcome to code java collection framework");

//        creating collection

//        Type Safe - Same type of elements(Object) are added to collection
        ArrayList<String> names = new ArrayList<String>();
        names.add("Rahman");
        names.add("Rahman");
        names.add("Tannu");
//        names.add(23);  this will give compilation error
        System.out.println(names);

        System.out.println("Getting 1st Element ");
        System.out.println("First name is : "+names.get(0));

//        un type safe  - Different types of elements can be added to collection
        ArrayList names1 = new ArrayList();

//        Removing Object
        names.remove("Rahman");
        System.out.println(names);

//        checking for value
        System.out.println(names.contains("Rahman"));

//        check for empty
        System.out.println(names.isEmpty());

//        ###    HashSet
        HashSet<Double> nms = new HashSet<>();
        nms.add(14.14);
        nms.add(234.25);
        nms.add(4505.20);
        nms.add(4505.20);

//        nms.add(14);   giving Compilation Error

        System.out.println(nms);

    }
}
