package player;

import visitor.Visitor;

public interface Fighter {
    public int attack();
    public void takeDamage(int dmg);
    public String getName();
}
