package classes;

import classesAbstract.Humanoid;

import java.util.ArrayList;

public class Orc extends Humanoid {
    public int rage;

    public Orc(String name, int x, int y, int maxHealth, int health, double resistance, ArrayList<House> houses, int rage) {
        super(name, x, y, maxHealth, health, resistance, houses);
        this.rage = rage;
    }

    public int getRage() {
        return rage;
    }

    public void setRage(int rage) {
        this.rage = rage;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Orc{");
        sb.append("rage=").append(rage);
        sb.append(", health=").append(health);
        sb.append(", resistance=").append(resistance);
        sb.append(", x=").append(x);
        sb.append(", y=").append(y);
        sb.append('}');
        return sb.toString();
    }
}
