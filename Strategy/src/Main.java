import ListConverter.ListConverter;
import ListConverter.EveryThirdItemListConverter;
import ListConverter.EveryItemListConverter;
import ListConverter.EveryOtherItemListConverter;

import java.util.ArrayList;
import java.util.List;

public class Main {
    private static final int[] data = new int[] {8,67,55,85,42,19,79,35,6,100,34,39,86,92,5,29,43,17,66,51,78,52,38,32,75,15,95,30,58,28,33,70,3,68,60,97,84,80,83,49,4,88,50,22,23,25,87,14,65,7,59,11,48,71,93,47,27,91,20,53,26,44,13,74,63,72,82,12,73,31,1,56,24,98,99,40,96,76,94,69,41,2,64,89,77,45,37,16,61,62,18,81,21,54,57,46,9,10,36,90};

    public static void main(String args[]) {
        List<Integer> list = new ArrayList<>();
        for (int item : data) {
            list.add(item);
        }

        ListConverter converter = new EveryItemListConverter();

        System.out.println("Linebreak after every item");
        System.out.println(converter.listToString(list));

        converter = new EveryOtherItemListConverter();
        System.out.println("Linebreak after every second item");
        System.out.println(converter.listToString(list));

        converter = new EveryThirdItemListConverter();
        System.out.println("Linebreak after every third item");
        System.out.println(converter.listToString(list));

    }
}
