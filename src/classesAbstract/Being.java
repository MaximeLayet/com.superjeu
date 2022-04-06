package classesAbstract;

public abstract class Being extends SpacialElement implements Comparable<Being>{

    private int maxHealth = 100;
    protected int health;
    protected double resistance;

    public Being(String name, int x, int y, int maxHealth, int health, double resistance) {
        super(name, x, y);
        this.maxHealth = maxHealth;
        this.health = health;
        this.resistance = resistance;
    }

    //A recoder//provisoire//
    public void receiveDamage(){
        this.health -= health;
    }

    public int getMaxHealth() {
        return maxHealth;
    }

    public void setMaxHealth(int maxHealth) {
        this.maxHealth = maxHealth;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public double getResistance() {
        return resistance;
    }

    public void setResistance(double resistance) {
        this.resistance = resistance;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Being{");
        sb.append("maxHealth=").append(maxHealth);
        sb.append(", health=").append(health);
        sb.append(", resistance=").append(resistance);
        sb.append(", x=").append(x);
        sb.append(", y=").append(y);
        sb.append('}');
        return sb.toString();
    }

    @Override
    public int compareTo(Being being) {
        if(this.health > being.getHealth()){
            return 1;
        } else if (this.health < being.health){
            return -1;
        } else{
            return 0;
        }
    }

}
