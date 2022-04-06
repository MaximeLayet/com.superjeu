package classesAbstract;

import classes.House;

import java.util.ArrayList;

public abstract class Humanoid extends Being {

    ArrayList<Animal> animals =new ArrayList<>();
    ArrayList<House> houses = new ArrayList<>();

    public Humanoid(String name, int x, int y, int maxHealth, int health, double resistance) {
        super(name, x, y, maxHealth, health, resistance);
    }

    public ArrayList<House> getHouses() {
        return houses;
    }

    public void setHouses(ArrayList<House> houses) {
        this.houses = houses;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Humanoid{");
        sb.append("health=").append(health);
        sb.append(", resistance=").append(resistance);
        sb.append(", houses=").append(houses);
        sb.append(", x=").append(x);
        sb.append(", y=").append(y);
        sb.append('}');
        return sb.toString();
    }
}
