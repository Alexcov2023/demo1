package lesson31.lessoncode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LambdaExample3 {
    public static void main(String[] args) {

        ListMerge listMerge = ((list1, list2) -> {
            list1.addAll(list2);
            return list1;});

        List<String> list1 = new ArrayList<>();
        List<String> list2 = new ArrayList<>();


        list1.add("Toronto");
        list1.add("Berlin");
        list1.add("Leipzig");
        list1.add("London");

        list2.add("Paris");
        list2.add("Madrid");
        list2.add("Roma");
        list2.add("Istanbul");

        //System.out.println(listMerge.merge(list1, list2));

        List<String> merge = listMerge.merge(list1, list2);
        Collections.sort(merge);
        System.out.println(merge);
    }
}
