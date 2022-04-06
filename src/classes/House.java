package classes;

import classesAbstract.SpacialElement;
import enumerations.Ematerial;

public class House extends SpacialElement {
    private int price;

    private Ematerial ematerial;

    public House(String name, int x, int y, int price, Ematerial ematerial) {
        super(name, x, y);
        this.price = price;
        this.ematerial = ematerial;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public Ematerial getEmaterial() {
        return ematerial;
    }

    public void setEmaterial(Ematerial ematerial) {
        this.ematerial = ematerial;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("House{");
        sb.append("x=").append(x);
        sb.append(", y=").append(y);
        sb.append(", price=").append(price);
        sb.append(", ematerial=").append(ematerial);
        sb.append('}');
        return sb.toString();
    }
}
