import java.util.*;
public class Emolevy extends AbstractDevicePart {
    List<DevicePart> childList = new ArrayList<DevicePart>();
    public Emolevy(int price) {
        this.price = price;
    }

    @Override
    public int getPrice(){
        int total = price;
        if(!childList.isEmpty()){
            for(DevicePart d : childList){
                total += d.getPrice();
            }
        }
        return total;
    }

    public void addParts(DevicePart part){
        childList.add(part);
    }

    @Override
    public String toString() {
        String t = " ";
        if(childList.isEmpty()){
            t = "Motherboard";
        } else {
            t = "emolevy";
            t += ", which is attached to: [";
            for (DevicePart d : childList){
                t+= " " + d.toString();
            }
            t += "]";
        }

        return t;

    }
}
