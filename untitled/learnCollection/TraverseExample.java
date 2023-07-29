package learnCollection;

import java.util.ArrayList;
import java.util.Iterator;

public class TraverseExample {
    public static void main(String[] args) {

        ArrayList<String> names = new ArrayList<String >();
        names.add("Rahman");
        names.add("Tannu");
        names.add("Margub");
        names.add("Rocky");

        System.out.println("#########Iterating through Iterator");
        Iterator<String> it = names.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }

        System.out.println("#########Iterating through forEach Loop");
        for (String name:names
             ) {
            System.out.println(name);
        }

        System.out.println("######### Iterating through for Loop");
        for (int i=0; i<names.size(); i++){
            System.out.println(names.get(i));
        }
    }
}
