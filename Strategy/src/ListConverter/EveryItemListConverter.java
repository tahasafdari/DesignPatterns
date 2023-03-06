package ListConverter;

import java.util.Iterator;
import java.util.List;

public class EveryItemListConverter implements ListConverter {
    @Override
    public String listToString(List list) {
        StringBuilder sb = new StringBuilder();

        Iterator i = list.iterator();

        while (i.hasNext()) {
            sb.append(i.next()+"\n");
        }
        return sb.toString();
    }
}
