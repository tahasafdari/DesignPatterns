package visitor;

import player.Knight;
import player.Player;
import player.Squire;
import player.Warrior;

public interface Visitor {
    public void visit(Player p);
}
