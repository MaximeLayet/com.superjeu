package classes;

import enumerations.Ematerial;

public class Castle extends House{
    public int defense;

    public Castle(String name, int x, int y, int price, Ematerial ematerial, int defense) {
        super(name, x, y, price, ematerial);
        this.defense = defense;
    }


    public int getDefense() {
        return defense;
    }

    public void setDefense(int defense) {
        this.defense = defense;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Castle{");
        sb.append("defense=").append(defense);
        sb.append(", x=").append(x);
        sb.append(", y=").append(y);
        sb.append('}');
        return sb.toString();
    }
}
