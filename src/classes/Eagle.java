package classes;

import classesAbstract.Animal;

public class Eagle extends Animal {
    public int vision;

    public Eagle(String name, int x, int y, int maxHealth, int health, double resistance, int vision) {
        super(name, x, y, maxHealth, health, resistance);
        this.vision = vision;
    }

    public int getVision() {
        return vision;
    }

    public void setVision(int vision) {
        this.vision = vision;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Eagle{");
        sb.append("vision=").append(vision);
        sb.append(", health=").append(health);
        sb.append(", resistance=").append(resistance);
        sb.append(", x=").append(x);
        sb.append(", y=").append(y);
        sb.append('}');
        return sb.toString();
    }
}
