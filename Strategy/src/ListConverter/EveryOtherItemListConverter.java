package ListConverter;

import java.util.Iterator;
import java.util.List;

public class EveryOtherItemListConverter implements ListConverter {
    @Override
    public String listToString(List list) {
        StringBuilder sb = new StringBuilder();
        Object[] arr = list.toArray();

        for (int i = 0; i < arr.length; i++) {
            sb.append(arr[i].toString());
            if ((i+1) % 2 == 0) {
                sb.append("\n");
            } else {
                sb.append(" ");
            }
        }

        return sb.toString();
    }
}
