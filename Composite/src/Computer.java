import java.util.*;
public class Computer {
    List<DevicePart> parts = new ArrayList<DevicePart>();

    public void create() {
        DevicePart computerCase = new Kotelo(63);
        DevicePart motherboard = new Emolevy(150);
        DevicePart RAM = new Muistipiiri(100);
        DevicePart graphicCard = new Naytonohjain(700);
        DevicePart processor = new Prosessori(1500);
        DevicePart networkCard = new Verkkokortti(25);

        motherboard.addParts(RAM);
        motherboard.addParts(graphicCard);
        motherboard.addParts(processor);
        motherboard.addParts(networkCard);
        computerCase.addParts(motherboard);
        parts.add(computerCase);




    }

    public String getParts(){
        String p = "";
        for(DevicePart d : parts){
            p += d.toString() + " ";
        }
        return p;
    }
    public int price(){
        int computerPrice = 0;
        for (DevicePart d : parts){
            computerPrice += d.getPrice();
        }
        return computerPrice;
    }

}
