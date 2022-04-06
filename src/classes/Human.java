package classes;

import classesAbstract.Humanoid;

import java.util.ArrayList;

public class Human extends Humanoid {
    public int mana;

    public Human(String name, int x, int y, int maxHealth, int health, double resistance, ArrayList<House> houses, int mana) {
        super(name, x, y, maxHealth, health, resistance, houses);
        this.mana = mana;
    }

    public int getMana() {
        return mana;
    }

    public void setMana(int mana) {
        this.mana = mana;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Human{");
        sb.append("mana=").append(mana);
        sb.append(", health=").append(health);
        sb.append(", resistance=").append(resistance);
        sb.append(", x=").append(x);
        sb.append(", y=").append(y);
        sb.append('}');
        return sb.toString();
    }
}
